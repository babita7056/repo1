package com.hospital.service;

import com.hospital.model.Patient;
import com.hospital.model.Doctor;
import com.hospital.model.Appointment;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ReportService {
    private final FileService fileService;

    public ReportService(FileService fs) {
        this.fileService = fs;
    }

    public void printAllPatients() throws IOException {
        List<Patient> patients = fileService.readPatients();
        patients.stream().sorted(Comparator.comparing(Patient::getId)).forEach(System.out::println);
    }

    public void printAllDoctors() throws IOException {
        List<Doctor> doctors = fileService.readDoctors();
        doctors.stream().sorted(Comparator.comparing(Doctor::getId)).forEach(System.out::println);
    }

    public void printAllAppointments() throws IOException {
        List<Appointment> apps = fileService.readAppointments();
        apps.stream().sorted(Comparator.comparing(Appointment::getId)).forEach(System.out::println);
    }

    public void appointmentsByDoctor() throws IOException {
        List<Appointment> apps = fileService.readAppointments();
        Map<Integer, List<Appointment>> grouped = apps.stream()
                .collect(Collectors.groupingBy(Appointment::getDoctorId));
        grouped.forEach((docId, list) -> {
            System.out.println("Doctor ID: " + docId);
            list.forEach(System.out::println);
        });
    }

    public void appointmentsOnDate(String date) throws IOException {
        List<Appointment> apps = fileService.readAppointments();
        apps.stream()
                .filter(a -> a.getDate().startsWith(date))
                .sorted(Comparator.comparing(Appointment::getDate))
                .forEach(System.out::println);
    }

    public void countPatientsByDisease() throws IOException {
        List<Patient> patients = fileService.readPatients();
        Map<String, Long> counts = patients.stream()
                .collect(Collectors.groupingBy(Patient::getDisease, Collectors.counting()));
        counts.forEach((d,c) -> System.out.println(d + " -> " + c));
    }
}
