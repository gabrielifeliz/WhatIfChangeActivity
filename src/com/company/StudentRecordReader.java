package com.company;

/* StudentRecordReader.java
 * The following program is used by your school to process student records.
 * Students enrolled for 12 or more credits are considered fulltime,
 * so change the program so that it only outputs student records
 * for student that are "fulltime".
 */
import java.util.Scanner;

public class StudentRecordReader {

    public static void main(String[] args) {
        String fname, lname, status;
        double gpa;
        int hours;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Student's First Name? ");
        fname = keyboard.next();

        System.out.print("Student's Last Name? ");
        lname = keyboard.next();

        System.out.print("Student's GPA? ");
        gpa = keyboard.nextDouble();

        System.out.print("Student's Current Course Load? ");
        hours = keyboard.nextInt();

        if (hours >= 12) {
            // Assign Full Time to the student's status if course load is 12 hours or greater
            status = "Full Time";

            System.out.println();
            System.out.println("Student Name: " + fname + " " + lname);
            System.out.println("Student GPA: " + gpa);
            // Display student's status, which shows the student is full time
            System.out.println("Student Status: " + status);

            if (gpa >= 3) {
                System.out.println("This student is in good standing.");
            } else if (gpa >= 2) {
                System.out.println("This student needs to study more.");
            } else if (gpa >= 1) {
                System.out.println("This student is on academic probation.");
            } else {
                System.out.println("This student has been expelled.");
            }
        } else {
            // Assign Full Time to the student's status if course load is 12 hours or greater
            status = "Part Time";

            System.out.println();
            /* Display message that lets the user know that
                this program is designed for full-time student only */
            System.out.println("Student Status: " + status + "\n" +
                    "This program only displays student records for student that are full time");

        }
    }
}