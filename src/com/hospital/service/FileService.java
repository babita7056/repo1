package com.hospital.service;

import com.hospital.model.Patient;
import com.hospital.model.Doctor;
import com.hospital.model.Appointment;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileService {
    private final Path patientsFile = Paths.get("patients.csv");
    private final Path doctorsFile = Paths.get("doctors.csv");
    private final Path appointmentsFile = Paths.get("appointments.csv");

    public FileService() throws IOException {
        if (!Files.exists(patientsFile)) Files.createFile(patientsFile);
        if (!Files.exists(doctorsFile)) Files.createFile(doctorsFile);
        if (!Files.exists(appointmentsFile)) Files.createFile(appointmentsFile);
    }

    public List<Patient> readPatients() throws IOException {
        try (Stream<String> lines = Files.lines(patientsFile)) {
            return lines.filter(l -> !l.trim().isEmpty())
                    .map(Patient::fromCSV)
                    .collect(Collectors.toList());
        }
    }

    public List<Doctor> readDoctors() throws IOException {
        try (Stream<String> lines = Files.lines(doctorsFile)) {
            return lines.filter(l -> !l.trim().isEmpty())
                    .map(Doctor::fromCSV)
                    .collect(Collectors.toList());
        }
    }

    public List<Appointment> readAppointments() throws IOException {
        try (Stream<String> lines = Files.lines(appointmentsFile)) {
            return lines.filter(l -> !l.trim().isEmpty())
                    .map(Appointment::fromCSV)
                    .collect(Collectors.toList());
        }
    }

    public void writePatients(List<Patient> list) throws IOException {
        List<String> lines = list.stream().map(Patient::toCSV).collect(Collectors.toList());
        Files.write(patientsFile, lines);
    }

    public void writeDoctors(List<Doctor> list) throws IOException {
        List<String> lines = list.stream().map(Doctor::toCSV).collect(Collectors.toList());
        Files.write(doctorsFile, lines);
    }

    public void writeAppointments(List<Appointment> list) throws IOException {
        List<String> lines = list.stream().map(Appointment::toCSV).collect(Collectors.toList());
        Files.write(appointmentsFile, lines);
    }

    public void appendPatient(Patient p) throws IOException {
        Files.write(patientsFile, java.util.Collections.singletonList(p.toCSV()), java.nio.file.StandardOpenOption.APPEND);
    }

    public void appendDoctor(Doctor d) throws IOException {
        Files.write(doctorsFile, java.util.Collections.singletonList(d.toCSV()), java.nio.file.StandardOpenOption.APPEND);
    }

    public void appendAppointment(Appointment a) throws IOException {
        Files.write(appointmentsFile, java.util.Collections.singletonList(a.toCSV()), java.nio.file.StandardOpenOption.APPEND);
    }
}
