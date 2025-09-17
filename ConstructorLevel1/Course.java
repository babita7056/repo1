//2 Online Course Management
package ConstructorLevel1;

public class Course {
    String courseName;
    double duration;
    double fee;
    static String instituteName;
   public Course(String courseName, double duration, double fee ) {
       this.courseName = courseName;
       this.duration = duration;
       this.fee = fee;
      instituteName="ABC Institute";
   }
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration);
        System.out.println("Fee: " + fee);
        System.out.println("Institute Name: " + instituteName);
    }
    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }
    public static void main(String[] args) {
        Course course1 = new Course("Java Programming", 6.0, 50000.0);
        course1.displayCourseDetails();
        Course.updateInstituteName("XYZ Institute");
        course1.displayCourseDetails();
    }
}
