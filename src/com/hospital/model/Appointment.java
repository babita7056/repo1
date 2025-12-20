package com.hospital.model;

public class Appointment {
    private int id;
    private int patientId;
    private int doctorId;
    private String date;

    public Appointment() {}
    public Appointment(int id, int patientId, int doctorId, String date) {
        this.id = id; this.patientId = patientId; this.doctorId = doctorId; this.date = date;
    }
    public Appointment(int patientId, int doctorId, String date) {
        this(0, patientId, doctorId, date);
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getPatientId() { return patientId; }
    public void setPatientId(int patientId) { this.patientId = patientId; }

    public int getDoctorId() { return doctorId; }
    public void setDoctorId(int doctorId) { this.doctorId = doctorId; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    public String toCSV() {
        return id + "," + patientId + "," + doctorId + "," + date;
    }

    public static Appointment fromCSV(String line) {
        String[] a = line.split(",");
        int id = Integer.parseInt(a[0]);
        int pid = Integer.parseInt(a[1]);
        int did = Integer.parseInt(a[2]);
        String d = a.length>3 ? a[3] : "";
        return new Appointment(id, pid, did, d);
    }

    @Override
    public String toString() {
        return String.format("Appointment[id=%d, patientId=%d, doctorId=%d, date=%s]", id, patientId, doctorId, date);
    }
}
