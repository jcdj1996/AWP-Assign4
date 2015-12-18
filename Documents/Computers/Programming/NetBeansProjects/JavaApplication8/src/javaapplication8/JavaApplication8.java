/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Ari
 */
public class JavaApplication8 {

    public static void main(String[] args) {
        int counter, number, guess;
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        while (true) {
            counter = 1;
            number = rand.nextInt((1000 - 1) + 1) + 1;
            do {
                counter++;
                System.out.print("Please guess a number between 1-1000: ");
                guess = input.nextInt();
                if (guess > number) {
                    System.out.println("Your number is too high!");
                } else if (guess < number) {
                    System.out.println("Your number is too low!");
                } else {
                    System.out.printf("That's the right number! Time for a new game \n\n");
                }

            } while (guess != number && counter <= 10);
            if (counter > 10) {
                System.out.printf("Too many guesses! Time for a new game \n\n");
            }

        }
    }

}
