/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment_two;

/**
 *
 * @author Jia Jian
 */
public class Unit_Course {
    String UnitID = "";
    int unitLevel = 0;
    
    int assignmentOne = 0;
    int assignmentTwo = 0;
    
    int finalExam = 0;
    
        
    public static double calculation_unit(int assignmentOne, int assignmentTwo, int finalExam){
        double total = 0;
        total = (assignmentOne + assignmentTwo)*0.5;
        total += finalExam * 0.5;
        return total;
    }
    
    double overallScore = calculation_unit(assignmentOne, assignmentTwo, finalExam);
}
