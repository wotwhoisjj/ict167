/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment_two;

/**
 *
 * @author Jia Jian
 */
public class Research_Course {
    int proposal = 0;
    int finaldissertation = 0;
    
    public static double calculation_research(int proposal, int finaldissertation){
    double total = 0;
    total = (proposal * 0.3) + (finaldissertation * 0.7);
    return total;
    }
}
