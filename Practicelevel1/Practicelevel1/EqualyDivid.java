package Practicelevel1;

import java.util.Scanner;

public class EqualyDivid {
    public static void main(String[] args) {

 Scanner sc = new Scanner(System.in);
 System.out.print("Enter total number of pens: ");
 int totalPens = sc.nextInt();
 System.out.print("Enter number of students: ");
 int students = sc.nextInt();
 int pensPerStudent = totalPens / students;
 int remainingPens = totalPens % students;
 System.out.println("Each student will get " + pensPerStudent + " pens.");
 System.out.println("Remaining non-distributed pens: " + remainingPens);    
    }
}
