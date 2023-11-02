/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.session_five;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Jia Jian
 */
public class Session_five {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  
        System.out.println("Please enter how many numbers to store within the array:");
        int numberStore = input.nextInt();
        int[] randomArray = new int[numberStore];
    
        Random numGenerator = new Random();
        for (int x = 0; x < randomArray.length; x++){
            int randomNum = numGenerator.nextInt(1000);
            randomArray[x] = randomNum;
            // System.out.println("Number " + x + " is : " + randomArray[x]);
        }
        
        normalOutput(randomArray);
        
        System.out.println("\nSmallest Number is: " + smallestInt(randomArray));
        System.out.println("Biggest Number is: " + biggestInt(randomArray));
        System.out.println("Average Number is: " + averageNum(randomArray));
        
        insertionOutput(randomArray);
    }
    
    private static void normalOutput(int[] randomArray){
        int numPrintLine = 5;
        int printCount = 0;
        
        for (int w = 0 ; w < randomArray.length; w++){
            System.out.print(randomArray[w] + " ");
            printCount ++;
            
            if (printCount == numPrintLine){
                System.out.println();
                printCount = 0;
            }
        }
    }
    
    private static void insertionOutput(int[] randomArray){
        System.out.println("Printing out the array output sorted with insertion sort algorithm:\n");
        for (int i = 1; i < randomArray.length; i++){
            int temp = randomArray[i];
            int j = i - 1;
            while (j >= 0 && randomArray[j] > temp){
                randomArray[j + 1] = randomArray[j];
                j--;
                }
                randomArray[j + 1] = temp;
            }
        
        int numPrintLine = 5;
        int printCount = 0;
        
        for (int w = 0 ; w < randomArray.length; w++){
            System.out.print(randomArray[w] + " ");
            printCount ++;
            
            if (printCount == numPrintLine){
                System.out.println();
                printCount = 0;
            }
        }
        
        }
    
    private static int smallestInt(int[] randomArray){
        int smallestInt = randomArray[0];
        //smallest Int
        for (int y = 1; y < randomArray.length; y++){
            if (randomArray[y] <= smallestInt){
                smallestInt = randomArray[y];
            }
        }
        
        if (smallestInt >= randomArray[0]){
            smallestInt = randomArray[0];
        }
        
        return smallestInt;
    }
    
    private static int biggestInt(int[] randomArray){
        int biggestInt = randomArray[0];
        //biggest Int
        for (int y = 1; y < randomArray.length; y++){
            if (randomArray[y] >= biggestInt){
                biggestInt = randomArray[y];
            }
        }
        
        if (biggestInt <= randomArray[0]){
            biggestInt = randomArray[0];
        }
        
        return biggestInt;
    }
    
    private static int averageNum(int[] randomArray){
        int averageNum = 0;
        for (int z = 0; z < randomArray.length; z++){
            averageNum += randomArray[z];
            }
        averageNum /= randomArray.length;
        
        return averageNum;
        }
    
        
}
