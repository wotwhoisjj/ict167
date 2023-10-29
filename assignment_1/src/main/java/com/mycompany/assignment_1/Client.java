/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment_1;
import java.util.Scanner;

/**
 *
 * @author superidol
 */
public class Client {
    
    
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);       
        
        // Comment it to manually enter test data
        sampleData();    
        
        System.out.println("Recommendation: Please enter at least 8 records to test the program.");
        String nameInput;
        int changeAmt;
        String continueInput = "Y";
        int currentInputIndex = 0;

        // Does not end the input prompt unless Y" is entered
        while (continueInput.equalsIgnoreCase("Y")){
            System.out.print("Please enter the name of the person: ");
            nameInput = input.nextLine();
            
            // Validate that the name is only one word
            if (isValidOneWordName(nameInput)){
            int storedName = isNameExist(Change.ChangeArray, nameInput);
            if (storedName != -1) {
                    
            // Name already exists
            System.out.println("Name already exists.");

            System.out.print("Please enter the coin value for the person (multiple of 5): ");           

            //Validate that the amount is integer
            while (!input.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid integer.");
            input.nextLine(); // Consume the invalid input
            System.out.print("Please enter the coin value for the person (multiple of 5): ");
                }
            int additionalChange = input.nextInt();
            input.nextLine();

            if (validateCoin(additionalChange)) {
                Change.ChangeArray[storedName].setChangeAmt(
                        Change.ChangeArray[storedName].getChangeAmt() + additionalChange);
            }                  
            else {
                System.out.println("Incorrect coin value. Must be multiple of 5.");
                System.out.print("Please enter the coin value for the person (multiple of 5): ");

                changeAmt = input.nextInt();
                input.nextLine();
            }  
            }
            else {
                // Name does not exist, proceed with adding a new entry
                 currentInputIndex = findFirstEmptyIndex(Change.ChangeArray);
                
                 if (currentInputIndex != -1) {
                    
                    // The array has space, proceed with adding a new entry
                    System.out.print("Please enter the coin value for the person (multiple of 5): ");
           
                    //Validate that the amount is integer
                    while (!input.hasNextInt()) {
                        System.out.println("Invalid input. Please enter a valid integer.");
                        input.nextLine(); // Consume the invalid input
                        System.out.print("Please enter the coin value for the person (multiple of 5): ");
                    }
                    changeAmt = input.nextInt();
                    input.nextLine();

                    if (validateCoin(changeAmt)) {   
                        
                        // Find the first available slot in the array
                        int index = 0;
                        while (index < Change.ChangeArray.length && Change.ChangeArray[index] != null) {
                            index++;
                        }
                        
                        // Check if there is space in the array
                        if (index < Change.ChangeArray.length) {
                            // Insert the new Change object at the found index
                            Change change = new Change(nameInput, changeAmt);
                            Change.ChangeArray[index] = change;
                        } 
                        
                    }
                    else{
                        System.out.println("Incorrect coin value. Must be a multiple of 5.");
                        System.out.print("Please enter the coin value for the person (multiple of 5): ");
                        
                        changeAmt = input.nextInt();
                        input.nextLine();
                    
                     }
                 }
                        else {
                            System.out.println("Array is full. Cannot add more elements.");
                        
                        break;
                     }
                }       
                
                System.out.println("Do you have more person to enter (Y/N): ");
                continueInput = input.nextLine();
                if (continueInput.equalsIgnoreCase("N")){
                    break;
                }
            }
            else{               
               System.out.println("Invalid name format. Please enter only one word.");
            }
        }
    
        
        int menuChoice = 0;
        while (menuChoice != 6){
            displayMenu();
            menuChoice = input.nextInt();
            switch (menuChoice){
                case 1:
                    input.nextLine();
                    System.out.println("Enter a name: ");
                    String menuName = input.nextLine();
                    choice1(menuName);
                    break;
                case 2:
                    choice2();
                    break;
                case 3:
                    choice3();
                    break;
                case 4:
                    choice4();
                    break;
                case 5:
                    choice5();
                    break;
                case 6:
                    System.out.println("Exiting the Program, Goodbye");
                    break;
                default:
                    System.out.println("Invalid Value");
                    break;
                }
            }
    }

    
    private static void sampleData(){
        Change.ChangeArray[0] = new Change("aaa",10);
        Change.ChangeArray[1] = new Change("bbb",10);
        Change.ChangeArray[2] = new Change("ccc",520);
        Change.ChangeArray[3] = new Change("ddd",30);
        Change.ChangeArray[4] = new Change("eee",420);
        Change.ChangeArray[5] = new Change("fff",10);
        Change.ChangeArray[6] = new Change("ggg",520);
        Change.ChangeArray[7] = new Change("hhh",65);
        Change.ChangeArray[8] = new Change("iii",225);
        // Change.ChangeArray[9] = new Change("jjj",305);
    }
    
    private static boolean validateCoin(int amount){
        return amount % 5 == 0;
    }
    
    private static void displayMenu(){
        System.out.println("\n1. Enter a name and display change to be given for each denomination");
        System.out.println("2. Find the name with the largest amount and display change to be given for each denomination");
        System.out.println("3. Find the name with the smallest amount and display change to be given for each denomination");
        System.out.println("4. Calculate and display the total number of coins for each denomination");
        System.out.println("5. Calculate and display the total amount (i.e. NOT the total number of coins) for the sum of all denominations");
        System.out.println("6. Exit");
    }
    
    private static void denominationBreakdown(int changeAmt){
            Change change = new Change();
            String breakdownMsg = "Change:";
            int oneDollar = changeAmt / change.getOneDollar();
            changeAmt %= 100;
            if (oneDollar > 0){
                breakdownMsg += "\n1 dollar: " + oneDollar;
            }
            int fiftyCents = changeAmt / change.getFiftyCents();
            changeAmt %= 50;
            if (fiftyCents > 0){
                breakdownMsg += "\n50 cents: " + fiftyCents;
            }
            int twentyCents = changeAmt / change.getTwentyCents();
            changeAmt %= 20;
            if (twentyCents > 0){
                breakdownMsg += "\n20 cents: " + twentyCents;
            }
            int tenCents = changeAmt / change.getTenCents();
            changeAmt %= 10;
            if (tenCents > 0){
                breakdownMsg += "\n10 cents: " + tenCents;
            }
            int fiveCents = changeAmt / 5;
            if (fiveCents > 0){
                breakdownMsg += "\n5 cents: " + fiveCents;
            }
            System.out.println(breakdownMsg);
        }
    
    private static int isNameExist(Change[] array, String name) {
    for (int i = 0; i < array.length; i++) {
        if (array[i] != null && array[i].getName().equalsIgnoreCase(name)) {
            return i;  // Name found at index i
        }
    }
    return -1;  // Name not found in the array
}     
    private static int findFirstEmptyIndex(Change[] array) {
    for (int i = 0; i < array.length; i++) {
        if (array[i] == null) {
            return i;  // Found an empty slot at index i
        }
    }
    return -1;  // No empty slots found in the array
}
    
    // Add a new method to validate one-word names
    private static boolean isValidOneWordName(String name) {
        // Use a simple check to ensure there are no spaces in the name
        return !name.contains(" ");
    }
    
    private static void choice1(String menuName){
        boolean isFound = false;
            for (Change i : Change.ChangeArray){
                if (i.getName().equalsIgnoreCase(menuName)){
                    isFound = true;
                    System.out.println("\nCustomer:\n" + menuName + " " + i.getChangeAmt() + " cents\n");
                    denominationBreakdown(i.getChangeAmt());
                    break;
                }
            }   
            if (isFound == false){
                 System.out.println("\nName: " + menuName + "\nNot found");
            }
    }
    
    private static void choice2(){
            Change largestChange = Change.ChangeArray[0];
            for (int i = 1; i < Change.ChangeArray.length; i++) {
                if (Change.ChangeArray[i] != null) {
                if (largestChange == null || Change.ChangeArray[i].getChangeAmt() >= largestChange.getChangeAmt()) {
                    largestChange = Change.ChangeArray[i];
                }
              }
            }

            for (int j = 0; j < Change.ChangeArray.length; j++){
                if (Change.ChangeArray[j] != null && Change.ChangeArray[j].getChangeAmt() == largestChange.getChangeAmt()){
                    System.out.println("\nName: " + Change.ChangeArray[j].getName());
                    denominationBreakdown(Change.ChangeArray[j].getChangeAmt());
                    }
                }
            }

    private static void choice3(){
        Change smallestChange = Change.ChangeArray[0];
        for (int i = 1; i < Change.ChangeArray.length; i++) {
            if (Change.ChangeArray[i] != null) {
            if (smallestChange == null || Change.ChangeArray[i].getChangeAmt() <= smallestChange.getChangeAmt()) {
                smallestChange = Change.ChangeArray[i];
            }
          }
        }
        for (int j = 0; j < Change.ChangeArray.length; j++){
            if (Change.ChangeArray[j] != null && Change.ChangeArray[j].getChangeAmt() == smallestChange.getChangeAmt()){
                System.out.println("\nName: " + Change.ChangeArray[j].getName());
                denominationBreakdown(Change.ChangeArray[j].getChangeAmt());
            }
        }
    }
    
    private static void choice4(){
        int total100 = 0;
        int total50 = 0;
        int total20 = 0;
        int total10 = 0;
        int total5 = 0;
        Change change = new Change();
        for (Change i : Change.ChangeArray){
            if (i != null) {
            int changeAmt = i.getChangeAmt();
            
            int oneDollar =  changeAmt / change.getOneDollar();
            changeAmt %= 100;
            total100 += oneDollar;
            
            int fiftyCents = changeAmt / change.getFiftyCents();
            changeAmt %= 50;
            total50 += fiftyCents;
            
            int twentyCents = changeAmt / change.getTwentyCents();
            changeAmt %= 20;
            total20 += twentyCents;

            int tenCents = changeAmt / change.getTenCents();
            changeAmt %= 10;
            total10 += tenCents;

            int fiveCents = changeAmt / 5;
            total5 += fiveCents;
        }
      }
        System.out.println("\nTotal Amount of 1 Dollar: " + total100);
        System.out.println("Total Amount of 50 cents: " + total50);
        System.out.println("Total Amount of 20 cents: " + total20);
        System.out.println("Total Amount of 10 cents: " + total10);
        System.out.println("Total Amount of 5 cents: " + total5);
    }
    
    private static void choice5(){
        int total = 0;
        for (Change i : Change.ChangeArray){
            if (i != null) {
            total += i.getChangeAmt();
        }
      }
        System.out.println("\nTotal Amount:\n" + total + " cents");
    }
}
