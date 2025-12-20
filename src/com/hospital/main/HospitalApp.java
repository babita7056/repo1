package com.hospital.main;

import com.hospital.model.Appointment;
import com.hospital.model.Doctor;
import com.hospital.model.Patient;
import com.hospital.service.FileService;
import com.hospital.service.HospitalService;
import com.hospital.service.ReportService;
import java.util.List;
import java.util.Scanner;

public class HospitalApp {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/hospital_project?useSSL=false&allowPublicKeyRetrieval=true";

        String user = "root";
        String pass = "root";
        try (Scanner sc = new Scanner(System.in)) {
            FileService fs = new FileService();
            HospitalService service = new HospitalService(url, user, pass, fs);
            ReportService report = new ReportService(fs);
            boolean running = true;
            while (running) {
                System.out.println("\n--- Hospital Management System ---");
                System.out.println("1) Register patient");
                System.out.println("2) Register doctor");
                System.out.println("3) Book appointment");
                System.out.println("4) Cancel appointment");
                System.out.println("5) Generate reports");
                System.out.println("6) List patients");
                System.out.println("7) List doctors");
                System.out.println("8) List appointments");
                System.out.println("9) Appointments by doctor");
                System.out.println("10) Export CSVs (rewrite files from memory)"); 
                System.out.println("0) Exit");
                System.out.print("Choose: ");
                String choice = sc.nextLine().trim();
                try {
                    switch (choice) {
                        case "1":
                            System.out.print("Patient name: ");
                            String pname = sc.nextLine();
                            System.out.print("Age: ");
                            int age = Integer.parseInt(sc.nextLine().trim());
                            System.out.print("Disease: ");
                            String disease = sc.nextLine();
                            Patient p = new Patient(pname, age, disease);
                            int pid = service.addPatient(p);
                            System.out.println("Added patient with id: " + pid);
                            break;
                        case "2":
                            System.out.print("Doctor name: ");
                            String dname = sc.nextLine();
                            System.out.print("Specialty: ");
                            String spec = sc.nextLine();
                            Doctor d = new Doctor(dname, spec);
                            int did = service.addDoctor(d);
                            System.out.println("Added doctor with id: " + did);
                            break;
                        case "3":
                            System.out.print("Patient id: ");
                            int apPid = Integer.parseInt(sc.nextLine().trim());
                            System.out.print("Doctor id: ");
                            int apDid = Integer.parseInt(sc.nextLine().trim());
                            System.out.print("Date/time (e.g. 2025-11-14 10:30): ");
                            String date = sc.nextLine();
                            Appointment ap = new Appointment(apPid, apDid, date);
                            int aid = service.addAppointment(ap);
                            System.out.println("Appointment created with id: " + aid);
                            break;
                        case "4":
                            System.out.print("Appointment id to cancel: ");
                            int cancelId = Integer.parseInt(sc.nextLine().trim());
                            boolean ok = service.cancelAppointment(cancelId);
                            System.out.println(ok ? "Cancelled." : "Not found.");
                            break;
                        case "5":
                            System.out.println("---- Reports ----");
                            report.printAllPatients();
                            report.printAllDoctors();
                            report.printAllAppointments();
                            report.appointmentsByDoctor();
                            report.countPatientsByDisease();
                            break;
                        case "6":
                            List<Patient> patients = service.getAllPatients();
                            patients.forEach(System.out::println);
                            break;
                        case "7":
                            List<Doctor> doctors = service.getAllDoctors();
                            doctors.forEach(System.out::println);
                            break;
                        case "8":
                            List<Appointment> apps = service.getAllAppointments();
                            apps.forEach(System.out::println);
                            break;
                        case "9":
                            System.out.print("Doctor id: ");
                            int doctorId = Integer.parseInt(sc.nextLine().trim());
                            List<Appointment> byDoc = service.getAppointmentsByDoctor(doctorId);
                            byDoc.forEach(System.out::println);
                            break;
                        case "10":
                            fs.writePatients(service.getAllPatients());
                            fs.writeDoctors(service.getAllDoctors());
                            fs.writeAppointments(service.getAllAppointments());
                            System.out.println("CSV files updated (overwritten).");
                            break;
                        case "0":
                            running = false; break;
                        default:
                            System.out.println("Unknown option"); break;
                    }
                } catch (Exception ex) {
                    System.err.println("Operation failed: " + ex.getMessage());
                    ex.printStackTrace();
                }
            }
            System.out.println("Goodbye!"); 
        } catch (Exception e) {
            System.err.println("Startup error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
//javac -d out -cp "lib\mysql-connector-j-9.5.0.jar" src\com\hospital\main\HospitalApp.java src\com\hospital\service\HospitalService.java src\com\hospital\model\Patient.java
//java -cp "out;lib\mysql-connector-j-9.5.0.jar" com.hospital.main.HospitalApp
