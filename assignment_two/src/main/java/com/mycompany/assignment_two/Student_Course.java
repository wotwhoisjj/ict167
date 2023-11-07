/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment_two;

/**
 *
 * @author Jia Jian
 */
public class Student_Course extends Student {
    
    private String courseName;
    
    Student student = new Student();
    
    public Student_Course(String name, long studentNumber, String courseName) {
        super(name, studentNumber);
        this.courseName = courseName;
    }
    
    private void reportGrade(){
        System.out.println("Enrolment Type: " + student.getEnrolmentType());
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Student Number: " + student.getStudentID());
        System.out.println("Student Unit ID: ");
        System.out.println("Student Overall Marks: ");
        System.out.println("Student Final Grade: ");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Student otherStudent = (Student) obj;
        return this.getStudentID() == otherStudent.getStudentID();
    }

}

