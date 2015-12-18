/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author Ari
 */
public class JavaApplication2 {

    public static void main(String[] args) {

        for (int i = 1; i <= 500; i++) {

            for (int j = 1; j <= 500; j++) {

                for (int k = 1; k <= 500; k++) {

                    if (Math.pow(i, 2) + Math.pow(j, 2) == Math.pow(k, 2)) {

                        System.out.println(i + " " + j + " " + k);

                    }

                }

            }

        }

    }
}

/*
 Scanner input = new Scanner(System.in);
 int size, colour;
 while (true) {
 System.out.print("How big would you like the square? ");
 size = input.nextInt();
 for (int i = 1; i <= size; i++) {
 for (int j = 1; j <= size; j++) {
 if (j >= 2 && j <= (size - 1) && i > 1 && i < size) {
 System.out.print(" ");
 } else {
 colour = i + j+ size;
 System.out.printf((char) 27 + "[%dm*",colour );
 }
 }
 System.out.println();
 }
 }
 */
/*
 for (int i = 1; i <= 9; i++) {
 for (int j = 2; j <= i; j++) {
 System.out.print(" ");
 }
 for (int j = i; j <= 9; j++) {
 System.out.print("*");
 }
 System.out.println();
 }
 */
/*
 for (int i = 1; i <= 9; i++) {
 for (int j = 1; j <= Math.abs(5 - i); j++) {
 System.out.print(" ");
 }
 for (int j = 1; j <= 8 - 2 * Math.abs(5 - i) + 1; j++) {
 System.out.print("*");
 }
 System.out.println();
 }
 */
/*

 */
