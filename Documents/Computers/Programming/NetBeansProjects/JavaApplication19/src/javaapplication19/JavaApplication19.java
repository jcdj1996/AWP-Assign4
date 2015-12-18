/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

import java.util.Scanner;

/**
 *
 * @author Ari
 */
public class JavaApplication19 {

    /**
     *
     * Create the pseudocode and flow chart diagram of a program that Gets a
     * String and a letter from a user and then output how many times the letter
     * appears
     *
     * @param args
     */
    public static void main(String[] args) {
        //step1();
        //step2();
        step3();
    }

    public static void step1() {
        /**
         * get sentence get character loop through letters check if letter is in
         * the sentence increment
         */
        Scanner userInput = new Scanner(System.in);
        System.out.format("Please enter a sentence: ");
        String sentence = userInput.nextLine();
        System.out.format("Please enter a letter: ");
        String character = userInput.nextLine();
        char letter = character.charAt(0);
        int counter = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (letter == sentence.charAt(i)) {
                counter++;
            }
        }
        System.out.format("The letter %c is found %d times%n", letter, counter);
    }

    public static void step2() {
        /**
         * create a program that gets a sentence from the user and then displays
         * how many times each letter of the alphabet appears in the sentence
         */
        Scanner userInput = new Scanner(System.in);
        System.out.format("Please enter a sentence: ");
        String sentence = userInput.nextLine();
        int[] letters = new int[26];
        for (int i = 0; i < sentence.length(); i++) {
            if ((int) sentence.charAt(i) >= 97) {
                letters[(int) sentence.charAt(i) - 97]++;
            } else if ((int) sentence.charAt(i) >= 65) {
                letters[(int) sentence.charAt(i) - 65]++;
            }
        }
        for (int i = 0; i < 26; i++) {
            System.out.format("the letter %s appears %d times.%n", (char) (i + 97), letters[i]);

        }
    }

    public static void step3() {
        int[][] numbers = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                numbers[i][j] = i * 10 + j;
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.format("%2d ", numbers[i][j] );
            }
            System.out.format("%n");
        }
    }

}
