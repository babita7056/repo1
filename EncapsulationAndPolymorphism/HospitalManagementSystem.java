//7.Hospital Management
package EncapsulationAndPolymorphism;
interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

abstract class Patient {
    private String patientId;
    private String name;
    private int age;
    private String diagnosis; 
    private String medicalHistory; 

    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.diagnosis = "Not Available";
        this.medicalHistory = "Not Available";
    }
    public abstract double calculateBill();

    public String getPatientDetails() {
        return "Patient ID: " + patientId + ", Name: " + name + ", Age: " + age;
    }
    public String getDiagnosis() { return diagnosis; }
    public String getMedicalHistory() { return medicalHistory; }

    protected void setDiagnosis(String diagnosis) { this.diagnosis = diagnosis; }
    protected void setMedicalHistory(String medicalHistory) { this.medicalHistory = medicalHistory; }
}
class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private double dailyRate;
    private String records;

    public InPatient(String patientId, String name, int age, int daysAdmitted, double dailyRate) {
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
        this.dailyRate = dailyRate;
        this.records = "";
    }

    @Override
    public double calculateBill() {
        return daysAdmitted * dailyRate;
    }

    @Override
    public void addRecord(String record) {
        records += record + "\n";
    }

    @Override
    public void viewRecords() {
        System.out.println("InPatient Medical Records:\n" + records);
    }
}
class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private String records;

    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        this.records = "";
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        records += record + "\n";
    }

    @Override
    public void viewRecords() {
        System.out.println("OutPatient Medical Records:\n" + records);
    }
}

public class HospitalManagementSystem {
     public static void processPatients(Patient[] patients) {
        for (Patient p : patients) {
            System.out.println(p.getPatientDetails());
            System.out.println("Bill Amount: Rs." + p.calculateBill());

            if (p instanceof MedicalRecord) {
                MedicalRecord mr = (MedicalRecord) p;
                mr.addRecord("General Checkup done.");
                mr.viewRecords();
            }
            System.out.println("---------------------------------");
        }
    }

    public static void main(String[] args) {
        Patient p1 = new InPatient("P001", "Alice", 30, 5, 2000);
        Patient p2 = new OutPatient("P002", "Bob", 40, 500);

        Patient[] patients = { p1, p2 };
        processPatients(patients);
    }
     }


