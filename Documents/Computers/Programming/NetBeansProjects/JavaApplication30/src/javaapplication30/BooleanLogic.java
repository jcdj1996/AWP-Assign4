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
public class BooleanLogic {
    
    public static void main(String[] args){
        
        boolean answer = true;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter true or false and I'll show you some logic");
        boolean userInput = keyboard.nextBoolean();
        
        System.out.printf("\n%b && %b is %b", answer, userInput, answer&&userInput);
        System.out.printf("\n%s || %s is %s", answer, userInput, answer||userInput);
        System.out.printf("\n!%s is %s\n", userInput, !userInput);
        
        
    }
    
    
    
    
    
    
    
    
}
