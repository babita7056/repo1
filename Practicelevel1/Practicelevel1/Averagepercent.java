//Sam’s mark in Maths is 94, Physics is 95 and Chemistry is 96 out of 100. Find the average percent mark in PCM

package Practicelevel1;

import java.util.Scanner;

public class Averagepercent {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter marks in Maths: ");
    int maths = sc.nextInt();
    System.out.print("Enter marks in Physics: ");
    int physics = sc.nextInt();     
    System.out.print("Enter marks in Chemistry: ");
    int chemistry = sc.nextInt();   
    int totalMarks = maths + physics + chemistry;
    double average = totalMarks / 3.0;
    System.out.println("Sam's average mark in PCM is " + average);
}
    
}
