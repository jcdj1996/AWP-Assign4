/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication30;

import java.util.Scanner;

/**
 *
 * @author Ari
 */
public class Summinator {
    public static void main(String[] args)
    {
        Scanner keyboard =new Scanner(System.in);
        
        System.out.print("Please enter the first number: ");
        int firstNumber; 
        firstNumber = keyboard.nextInt();
        
        System.out.printf("\nYou typed the number # %d", firstNumber);
        
        System.out.print("Please enter the second number: ");
        int secondNumber;
        secondNumber = keyboard.nextInt();
        
        System.out.printf("%d + %d = %d", firstNumber, secondNumber, firstNumber + secondNumber);
        
        
    }  
     
        
}
