/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment_two;

/**
 *
 * @author JIAJIAN-ADM
 */
public class Student {
    
    private String studentName;
    private long studentID;
    
    
    // Constructors 
    private Student(){
        
    }
    
    private Student(String name, long ID){
        studentName = name;
        studentID = ID;
    }
    
    private Student(String name){
        studentName = name;
    }
    
    private Student(long ID){
        studentID = ID;
    }
    
    // Getters and Setters
    public long getStudentID(){
        return studentID;
    }
    
    public String getStudentName(){
        return studentName;
    }
    
    public void setStudentName(String newName){
        studentName = newName;
    }
    
    public void setStudentID(long newID){
        studentID = newID;
    }
    
    private static void reportGrade(){
        System.out.println("There is no grade here.");
    }
    
    private boolean equals(Student otherStudent){
        return studentID == otherStudent.getStudentID();
    }
}
