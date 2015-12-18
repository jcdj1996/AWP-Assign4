/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

import java.security.SecureRandom;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Ari
 */
public class Week5 {

    public static void printRect(char c, int h, int w) {
        //for loop for number of rows
        for (int i = 1; i <= h; i++) {
            //for loop for number of columns
            for (int j = 1; j <= w; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static int rollTwoDice() {
        SecureRandom random = new SecureRandom();
        int die1, die2;
        die1 = random.nextInt(6) + 1;
        die2 = random.nextInt(6) + 1;
        return die1 + die2;
    }

    public static boolean isPrime(int num) {
        for (int z = 2; z < num; z++) {
            if (num % z == 0) {
                return false;
            }
        }
        return (true);
    }

    public static void main(String[] args) {
        //create dow variables that store a random number
        Scanner input = new Scanner(System.in);
        int number, temp, bin, counter;
        String hexChange, hexOut;
        String octChange, octOut;
        while (true) {
            System.out.print("Please input a number under 0-1023: ");
            number = input.nextInt();
            temp = number;
            bin = 0;
            counter = 0;
            hexOut = "";
            hexChange = "";
            octOut = "";
            octChange = "";
            while (temp != 0) {
                bin += (temp % 2) * Math.pow(10, counter);
                temp = temp / 2;
                counter += 1;
            }
            System.out.println("     Binary: " + bin);
            hexChange = "" + bin;
            octChange = "" + bin;
            if (octChange.length() % 3 != 0) {
                while (octChange.length() % 3 != 0) {
                    octChange = "0" + octChange;
                }

            }

            for (int i = 1; i <= octChange.length() / 3; i++) {
                switch (octChange.substring(octChange.length() - 3 * i, octChange.length() - 3 * (i - 1))) {
                    case "000":
                        octOut = "0" + octOut;
                        break;
                    case "001":
                        octOut = "1" + octOut;
                        break;
                    case "010":
                        octOut = "2" + octOut;
                        break;
                    case "011":
                        octOut = "3" + octOut;
                        break;
                    case "100":
                        octOut = "4" + octOut;
                        break;
                    case "101":
                        octOut = "5" + octOut;
                        break;
                    case "110":
                        octOut = "6" + octOut;
                        break;
                    case "111":
                        octOut = "7" + octOut;
                        break;
                }
            }
            System.out.println("      Octal: " + octOut);

            if (hexChange.length() % 4 != 0) {
                while (hexChange.length() % 4 != 0) {
                    hexChange = "0" + hexChange;
                }

            }

            for (int i = 1; i <= hexChange.length() / 4; i++) {
                switch (hexChange.substring(hexChange.length() - 4 * i, hexChange.length() - 4 * (i - 1))) {
                    case "0000":
                        hexOut = "0" + hexOut;
                        break;
                    case "0001":
                        hexOut = "1" + hexOut;
                        break;
                    case "0010":
                        hexOut = "2" + hexOut;
                        break;
                    case "0011":
                        hexOut = "3" + hexOut;
                        break;
                    case "0100":
                        hexOut = "4" + hexOut;
                        break;
                    case "0101":
                        hexOut = "5" + hexOut;
                        break;
                    case "0110":
                        hexOut = "6" + hexOut;
                        break;
                    case "0111":
                        hexOut = "7" + hexOut;
                        break;
                    case "1000":
                        hexOut = "8" + hexOut;
                        break;
                    case "1001":
                        hexOut = "9" + hexOut;
                        break;
                    case "1010":
                        hexOut = "A" + hexOut;
                        break;
                    case "1011":
                        hexOut = "B" + hexOut;
                        break;
                    case "1100":
                        hexOut = "C" + hexOut;
                        break;
                    case "1101":
                        hexOut = "D" + hexOut;
                        break;
                    case "1110":
                        hexOut = "E" + hexOut;
                        break;
                    case "1111":
                        hexOut = "F" + hexOut;
                        break;
                }
            }
            System.out.println("Hexidecimal: " + hexOut);
        }
        /*int height, width;
         height = random.nextInt(10)+1;
         width = random.nextInt(10)+1;
        
         printRect('$',height, width);
         int counter = 0,holder=0,temp=0;
         while (true) {
         temp = rollTwoDice();
         holder += temp;
                    
         counter = counter +1;
         System.out.printf("you rolled a %d your average is %d%n ",temp,holder/counter);
        
         for (int i = 2; i <= 100; i++) {
         if (isPrime(i)){
         System.out.printf("%d is a prime%n", i);
         }
         } */
    }
}
