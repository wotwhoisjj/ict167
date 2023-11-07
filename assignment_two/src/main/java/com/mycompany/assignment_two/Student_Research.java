/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment_two;

/**
 *
 * @author Jia Jian
 */
public class Student_Research extends Student {
    
    private String researchTopic;
    
    Student student = new Student();
    
    public Student_Research(String name, long studentNumber, String researchTopic) {
        super(name, studentNumber);
        this.researchTopic = researchTopic;
    }
    
    private void reportGrade(){
        System.out.println("Enrolment Type: " + student.getEnrolmentType());
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Student Number: " + student.getStudentID());
        System.out.println("Student Overall Marks: ");
        System.out.println("Student Final Grade: ");
    }
    
}
