//7. Hospital Management System
package KeywordsAndInstanceofLevel1;

public class Patient {
    static String hospitalName = "XYZ Hospital";
    static int totalPatient = 0;
    String name;
    int age;
    String ailment;
    public Patient(String name, int age, String ailment) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatient++; 
    }
    public static void getTotalPatient() {
        System.out.println("Total Patient: " + totalPatient); 
    }
    public void display() {
        if(this instanceof Patient){
        System.out.println("Patient Name: " + name);
        System.out.println("Patient Age: " + age);
        System.out.println("Patient Ailment: " + ailment);
    }
}
public static void main(String[] args) {
    Patient patient1 = new Patient("John Doe", 25, "Headache");
    patient1.display();
    Patient.getTotalPatient();
}

}
