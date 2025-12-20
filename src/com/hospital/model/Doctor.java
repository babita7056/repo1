package com.hospital.model;

public class Doctor {
    private int id;
    private String name;
    private String specialty;

    public Doctor() {}
    public Doctor(int id, String name, String specialty) { this.id = id; this.name = name; this.specialty = specialty; }
    public Doctor(String name, String specialty) { this(0, name, specialty); }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSpecialty() { return specialty; }
    public void setSpecialty(String specialty) { this.specialty = specialty; }

    public String toCSV() {
        return id + "," + name + "," + specialty;
    }

    public static Doctor fromCSV(String line) {
        String[] a = line.split(",");
        int id = Integer.parseInt(a[0]);
        String name = a[1];
        String spec = a.length>2 ? a[2] : "";
        return new Doctor(id, name, spec);
    }

    @Override
    public String toString() {
        return String.format("Doctor[id=%d, name=%s, specialty=%s]", id, name, specialty);
    }
}
