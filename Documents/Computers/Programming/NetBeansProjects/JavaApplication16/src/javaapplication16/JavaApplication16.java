/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16;

import java.util.Random;

/**
 *
 * @author Ari
 */
public class JavaApplication16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] the100integers = new int[100];

        for (int i = 0; i < 100; i++) {
            the100integers[i] = -1;
        }
        the100integers[6] = 7;

        printArray(the100integers);

        char[] charSaying = new char["Hi there".length()];
        for (int i = 0; i < "Hi there".length(); i++) {
            charSaying[i] = "Hi there".charAt(i);
        }
        System.out.format("%n");
        for (int i = 0; i < "Hi There".length(); i++) {
            System.out.format("%c ", charSaying[i]);
        }
        System.out.format("%n");
        for (int i = 0; i < "Hi".length(); i++) {
            System.out.format("%c", charSaying[i]);
        }
        rollDice();
    }

    public static void printArray(int[] array1) {
        for (int i = 0; i < array1.length; i++) {
            if (i > 0 && i % 20 == 0) {
                System.out.format("%n");
            }
            System.out.format("%d ", array1[i]);
        }
    }

    public static void rollDice() {
        //new random class variable
        Random rnd = new Random();
        /**
         * size of array (max dice 1+ max dice 2) - minimum sum + 1 (starting
         * value)
         */
        int sides1 = 6;
        int sides2 = 6;
        int dice = 2;
        int size = ((sides1 +sides2) - dice + 1);
        //number of rolls
        int rolls = 36000;
        //initialize the distribution array
        int distribution[] = new int[size];

        //Roll the dice
        for (int i = 0; i < rolls; i++) {
            //counts the distribution
            distribution[rnd.nextInt(sides1) + rnd.nextInt(sides2)]++;
        }
        //Display results
        System.out.format("%n%s%10s%11s ", "Sum", "Frequency", "Percentage");
        for (int i = 0; i < size; i++) {
            System.out.format("%n%2d%7d%10.2f", i + dice, distribution[i], ((float) distribution[i] / rolls) * 100);
        }

    }

}
