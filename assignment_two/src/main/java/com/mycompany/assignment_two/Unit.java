/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment_two;

/**
 *
 * @author Jia Jian
 */
public class Unit extends Student {
    char course_work = 'C';
    char research = 'R';
    
    private void reportGrade(){
        System.out.println("NA");
    }
    
    String finalGrade = "";
    
    Unit_Course unitcourse = new Unit_Course();
    
    
    public String calculateFinalGrade(double overallScore){
        String grade;
        if (overallScore >= 80){
            grade = "HD";
        }
        
        else if (overallScore >= 70 && overallScore < 80){
            grade = "D";
        }
        
        else if (overallScore >= 60 && overallScore < 70){
            grade = "C";
        }
        
        else if (overallScore >= 50 && overallScore < 60){
            grade = "P";
        }
        
        else {
            grade = "N";
        }
        return grade;
    }
    
}
