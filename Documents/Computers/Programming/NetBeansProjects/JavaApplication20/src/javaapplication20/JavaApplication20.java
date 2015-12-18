/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication20;

import java.util.Scanner;

/**
 *
 * @author Ari
 */
public class JavaApplication20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice, change, counter = 1;
        boolean[] seats = new boolean[10];
        while (true) {
            for (int i = 0; i < seats.length; i++) {
                seats[i] = false;
            }
            System.out.format("Flight %03d Time: %02d:00%n", counter, (counter - 1) * 3);
            while (true) {
                if (seats[4] && seats[9]) {
                    System.out.format("The plane is full.%nThe next flight leaves in 3 hours.%n");
                    break;
                } else {
                    System.out.format("Please type 1 for First Class%nPlease type 2 for Economy Class%nChoice: ");
                    choice = input.nextInt();
                    if (seats[choice * 5 - 1]) {
                        System.out.format("%s Class is full would you like to switch to %s Class?%nPlease input 1 for Yes%nPlease input 2 for No%nChoice: ", (choice == 1) ? "First" : "Economy", (choice == 2) ? "First" : "Economy");
                        change = input.nextInt();
                        if (change == 1) {
                            choice = (choice == 1) ? 2 : 1;
                        } else if (change == 2) {
                            System.out.format("The next flight leaves in 3 hours.%n");
                        }
                    }
                    if (!seats[choice * 5 - 1]) {
                        for (int i = (choice - 1) * 5; i < choice * 5; i++) {
                            if (seats[i] == false) {
                                seats[i] = true;
                                System.out.format("You are in %s Class seat %d%n", (choice == 1) ? "First" : "Economy", (i + 1));
                                break;
                            }
                        }
                    }
                }
            }
            counter++;
            counter = (counter == 24 / 3 + 1) ? 1 : counter;
        }
        /*//The following code segment should initialize a two-dimensional array, then print its values.
         int a[][] = new int[10][5];
         for (int i = 0; i < a.length; i++) {
         for (int j = 0; j < a[i].length; j++) {
         a[i][j] = j;
         }
         }
         for (int i = 0; i < a.length; i++) {
         for (int j = 0; j < a[i].length; j++) {
         System.out.printf("%d ", a[i][j]);
         }
         System.out.println();
         }

         //The following code segment should assign the value 10 to the array 
         //element that corresponds to the third row and the fourth column. 
         int a[][] = new int[10][5];
         a[2][3] = 10;*/
    }
}
