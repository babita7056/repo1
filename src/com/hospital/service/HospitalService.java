package com.hospital.service;

import com.hospital.model.Patient;
import com.hospital.model.Doctor;
import com.hospital.model.Appointment;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class HospitalService {

    private final String url;
    private final String user;
    private final String pass;
    private final FileService fileService;

    public HospitalService(String url, String user, String pass, FileService fs) {
        this.url = url;
        this.user = user;
        this.pass = pass;
        this.fileService = fs;
    }

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, pass);
    }

    // ---------------- PATIENT ----------------
    public int addPatient(Patient p) throws Exception {

        // CSV
        List<Patient> list = fileService.readPatients();
        int id = list.stream().mapToInt(Patient::getId).max().orElse(0) + 1;
        p.setId(id);
        fileService.appendPatient(p);

        //  DATABASE
        String sql = "INSERT INTO patients(name, age, disease) VALUES (?, ?, ?)";
        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, p.getName());
            ps.setInt(2, p.getAge());
            ps.setString(3, p.getDisease());
            ps.executeUpdate();
        }

        return id;
    }

    // ---------------- DOCTOR ----------------
    public int addDoctor(Doctor d) throws Exception {

        List<Doctor> list = fileService.readDoctors();
        int id = list.stream().mapToInt(Doctor::getId).max().orElse(0) + 1;
        d.setId(id);
        fileService.appendDoctor(d);

        String sql = "INSERT INTO doctors(name, specialty) VALUES (?, ?)";
        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, d.getName());
            ps.setString(2, d.getSpecialty());
            ps.executeUpdate();
        }

        return id;
    }

    // ---------------- APPOINTMENT ----------------
    public int addAppointment(Appointment a) throws Exception {

        List<Appointment> list = fileService.readAppointments();
        int id = list.stream().mapToInt(Appointment::getId).max().orElse(0) + 1;
        a.setId(id);
        fileService.appendAppointment(a);

        String sql = "INSERT INTO appointments(patient_id, doctor_id, date) VALUES (?, ?, ?)";
        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, a.getPatientId());
            ps.setInt(2, a.getDoctorId());
            ps.setString(3, a.getDate());
            ps.executeUpdate();
        }

        return id;
    }

    // ---------------- READ FROM CSV ----------------
    public List<Patient> getAllPatients() throws IOException {
        return fileService.readPatients();
    }

    public List<Doctor> getAllDoctors() throws IOException {
        return fileService.readDoctors();
    }

    public List<Appointment> getAllAppointments() throws IOException {
        return fileService.readAppointments();
    }
    public boolean cancelAppointment(int id) throws IOException {
    List<Appointment> list = fileService.readAppointments();
    List<Appointment> filtered = new ArrayList<>();

    for (Appointment ap : list) {
        if (ap.getId() != id) {
            filtered.add(ap);
        }
    }
    fileService.writeAppointments(filtered);
    return true;
}

public List<Appointment> getAppointmentsByDoctor(int doctorId) throws IOException {
    List<Appointment> list = fileService.readAppointments();
    List<Appointment> filtered = new ArrayList<>();

    for (Appointment a : list) {
        if (a.getDoctorId() == doctorId) {
            filtered.add(a);
        }
    }
    return filtered;
}

}
