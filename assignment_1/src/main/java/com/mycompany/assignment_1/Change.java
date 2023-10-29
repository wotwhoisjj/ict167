/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment_1;

/**
 *
 * @author Jia Jian
 */



public class Change {
    
    private String name = "";
    private int changeAmt = 0;
    
    private int oneDollar = 100;
    private int fiftyCents = 50;
    private int twentyCents = 20;
    private int tenCents = 10;
    private int fiveCents = 5;
    
    public static Change[] ChangeArray = new Change[10];
    
    // Default constructor
    public Change(){
    name = "";
    changeAmt = 0;
    }
    
    // Constructor with paramters
    public Change(String username, int change){
        name = username;
        changeAmt = change;
    }
    
    //get and set methods so that other classes can retrieve the variables in this class
    public String getName(){
        return name;
    }
    
    public void setName(String newName){
        this.name = newName;
    }
    
    public int getChangeAmt(){
        return changeAmt;
    }
    
    public void setChangeAmt(int newChangeAmt){
        this.changeAmt = newChangeAmt;
    }
    
    public int getOneDollar(){
        return oneDollar;
    }
    
    public int getFiftyCents(){
        return fiftyCents;
    }
    
    public int getTwentyCents(){
        return twentyCents;
    }
    
    public int getTenCents(){
        return tenCents;
    }
    
    public int getFiveCents(){
        return fiveCents;
    }
}
