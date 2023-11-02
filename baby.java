/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.session_five;
import java.util.Scanner;
/**
 *
 * @author Jia Jian
 */
public class Baby {
     
    String babyName = "nil";
    int babyAge = 1;
    
    public Baby(){
        babyName = "nil";
        babyAge = 1;
        
    }
    
    public Baby(String newName,int newAge){
        setBabyName(newName);
        setBabyAge(newAge);
    }
    
    public String getBabyName(){
        return babyName;
    }
    
    public int getBabyAge(){
        return babyAge;
    }
    
    public void setBabyName(String newName){
        if (newName != null && !newName.trim().isEmpty()){
            this.babyName = newName;
        }
    }
    
    public void setBabyAge(int newAge){
        if (newAge >= 1 && newAge <= 4){
            this.babyAge = newAge;
        }
    }
    
    private boolean equals(Baby otherbabies){
        if (otherbabies == null){
            return false;
        }
        return this.babyName.equalsIgnoreCase(otherbabies.getBabyName()) && this.babyAge == otherbabies.getBabyAge();
    }
    
    
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); 
        Baby[] babies = new Baby[4];
        
        /*
        for (int x = 0; x < babies.length; x++){
            System.out.println("Please enter the baby name: ");
            String inputName = input.nextLine();
            System.out.println("Please enter the baby age: ");
            int inputAge = input.nextInt();
            babies[x] = new Baby(inputName, inputAge);
            input.nextLine();
        }
*/
        
        
        
        babies[0] = new Baby("wilson", 2);
        babies[1] = new Baby("jason", 4);
        babies[2] = new Baby("ashley", 2);
        babies[3] = new Baby("wayne", 3);
        
        
        for (int x = 0; x < babies.length; x++){
            System.out.println("Baby Name: " + babies[x].getBabyName() + " / Baby Age: " + babies[x].getBabyAge());
        }
        
        System.out.println("The average age of the babies: " + averageAge(babies));
        
        sameBabies(babies);
    }
    
    public static int averageAge(Baby[] babyArray){
        int avgAge = 0;
        for (int x = 0; x < babyArray.length ; x++){
            avgAge += babyArray[x].getBabyAge();
        }
        avgAge /= babyArray.length;
        return avgAge;
    }
    
    public static void sameBabies(Baby[] babies){
        Baby baby0 = babies[0];
        for (int x = 1; x < babies.length; x++){
            if (baby0.equals(babies[x])){
            System.out.println("Baby 0" + " and Baby " + x + " is the same");
            }
        }
    }
    
}
