/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assignment_two;
import java.util.Scanner;

/**
 *
 * @author Jia Jian
 */
public class Assignment_two {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        long studentID;
        int menuChoice = 0;

        
        while (menuChoice != 1){
            displayMenu();
            menuChoice = input.nextInt();
            switch (menuChoice){
                case 1:
                    System.out.println("Exiting the Program, Goodbye");
                    break;
                case 2:
                    input.nextLine();
                    System.out.println("Enter a name: ");
                    studentID = input.nextLong();
                    choice2(studentID);
                    break;
                case 3:
                    choice3();
                    break;
                case 4:
                    choice4();
                    break;
                case 5:
                    input.nextLine();
                    System.out.println("Enter a name: ");
                    studentID = input.nextLong();
                    choice5(studentID);
                    break;
                case 6:
                    choice6();
                    break;
                case 7:
                    choice7();
                    break;
                default:
                    System.out.println("Invalid Value");
                    break;
            }
        }
    }
    
    
    private static void displayMenu(){
    System.out.println("\n1. Exit Program");
    System.out.println("2. Remove Student Record (Student Number Required)");
    System.out.println("3. Display All Student Records");
    System.out.println("4. Display The Statistics Of The Overall Average Marks");
    System.out.println("5. Display The Student Grade (Student Number Required)");
    System.out.println("6. Sort The Student Records In Ascending Order Based On Student Numbers");
    System.out.println("7. Export CSV File");
    }
    
    private static void choice2(long studentID){
        System.out.println("Are you sure you want to delete the following student record:");
        System.out.println();
    } 
    
    private static void choice3(){
        
    }

    private static void choice4(){
        
    }

    private static void choice5(long studentID){
        
    }

    private static void choice6(){
        
    }

    private static void choice7(){
        
    }    
    
}
