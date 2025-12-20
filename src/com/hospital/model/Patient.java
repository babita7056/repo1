package com.hospital.model;

public class Patient {
    private int id;
    private String name;
    private int age;
    private String disease;

    public Patient() {}

    public Patient(int id, String name, int age, String disease) {
        this.id = id; this.name = name; this.age = age; this.disease = disease;
    }
    public Patient(String name, int age, String disease) {
        this(0, name, age, disease);
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getDisease() { return disease; }
    public void setDisease(String disease) { this.disease = disease; }

    public String toCSV() {
        return id + "," + name + "," + age + "," + disease;
    }

    public static Patient fromCSV(String line) {
        String[] a = line.split(",");
        int id = Integer.parseInt(a[0]);
        String name = a[1];
        int age = Integer.parseInt(a[2]);
        String disease = a.length>3 ? a[3] : "";
        return new Patient(id, name, age, disease);
    }

    @Override
    public String toString() {
        return String.format("Patient[id=%d, name=%s, age=%d, disease=%s]", id, name, age, disease);
    }
}
