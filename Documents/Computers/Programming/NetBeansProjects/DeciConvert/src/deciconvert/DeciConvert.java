/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deciconvert;

import java.util.Scanner;

/**
 *
 * @author Ari
 */
public class DeciConvert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create dow variables that store a random number
        Scanner input = new Scanner(System.in);
        long number;
        while (true) {
            System.out.print("Please enter a number between 0 and 2147483647: ");
            number = input.nextInt();
            System.out.println("     Binary: " + binary(number));
            octal(binary(number));
            hexidecimal(binary(number));
            System.out.println();
        }

    }

    public static String binary(long a) {
        String bin, counter;
        bin = "";
        while (a != 0) {
            if (a % 2 == 1) {
                bin = 1 + bin;
            }else{bin = 0 + bin;
            }
            a = a / 2;
        }
        return bin;
    }

    public static String octal(String binIn) {
        String octOut;
        octOut = "";
        if (binIn.length() % 3 != 0) {
            while (binIn.length() % 3 != 0) {
                binIn = "0" + binIn;
            }

        }

        for (int i = 1; i <= binIn.length() / 3; i++) {
            switch (binIn.substring(binIn.length() - 3 * i, binIn.length() - 3 * (i - 1))) {
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
        return "";
    }

    public static String hexidecimal(String binIn) {
        String hexOut;
        hexOut = "";
        if (binIn.length() % 4 != 0) {
            while (binIn.length() % 4 != 0) {
                binIn = "0" + binIn;
            }

        }

        for (int i = 1; i <= binIn.length() / 4; i++) {
            switch (binIn.substring(binIn.length() - 4 * i, binIn.length() - 4 * (i - 1))) {
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
        return "";
    }
}