/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main1_1;

import java.util.Scanner;

class Student {
    
    static String university = "ULAB University";
    static int count = 0;

  
    int id;
    String name;
    String dept;
    double cgpa;

    Student(int ID, String Name, String Department, double CGPA) {
        this.id = ID;
        this.name = Name;
        this.dept = Department;
        this.cgpa = CGPA;
    }

    void displayStudentDetails() {
        System.out.println("ID = " + id);
        System.out.println("Name = " + name);
        System.out.println("Department = " + dept);
        System.out.println("CGPA = " + cgpa);
        System.out.println("University = " + university);
        System.out.println();
    }
    
    public static void displayTotalStudents() {
        System.out.println("Total number of students = " + count);
    }
}

public class Main1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create 3 student objects
        Student s1 = new Student(Integer.parseInt(getInput("Input 1st student ID = ")),
                getInput("Input 1st Student name = "), getInput("Input 1st Student department = "), 
                Double.parseDouble(getInput("Input 1st Student CGPA = ")));
        Student s2 = new Student(Integer.parseInt(getInput("Input 2nd Student ID = ")), 
                getInput("Input 2nd Student name = "), getInput("Input 2nd student department= "), 
                Double.parseDouble(getInput("Input 2nd Student CGPA = ")));
        Student s3 = new Student(Integer.parseInt(getInput("Input 3rd Student ID = ")), 
                getInput("Input 3rd Student name = "), getInput("Input 3rd Student department = "), 
                Double.parseDouble(getInput("Input 3rd Student CGPA = ")));

        
        Student.count++;
        Student.count++;
        Student.count++;

        
        System.out.println("Details of 1st student = ");
        s1.displayStudentDetails();
        System.out.println("Details of 2nd student = ");
        s2.displayStudentDetails();
        System.out.println("Details of 3rd student = ");
        s3.displayStudentDetails();

        
        Student.displayTotalStudents();
    }

    static String getInput(String prompt) {
        System.out.print(prompt);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}