/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Ari
 */
public class JavaApplication1 {


    public static void main(String[] args) {

        Scanner user_input = new Scanner(System.in);

        int number, holder, temp;

        while (true) {

            System.out.print("Please input a 5 digit number: ");

            number = user_input.nextInt();

            if (String.valueOf(number).length() != 5) {

                System.out.printf("The number %d is not the correct length\n", number);

            } else {

                holder = number;

                temp = 0;

                for (int i = 1; i <= String.valueOf(number).length(); i++) {

                    temp = temp * 10 + holder % 10;

                    holder = holder / 10;

                }

                if (temp == number) {

                    System.out.printf("The number %d is a palindrome\n", number);

                } else {

                    System.out.printf("The number %d is not a palindrome\n", number);

                }

            }

        }

    }

 
    
    

}

/*
 public static void main(String[] args) {
 Scanner user_input = new Scanner(System.in);
 int number;
 while (true) {
 System.out.print("Please Enter a number: ");
 number = user_input.nextInt();
 if (number % 2 == 0) {
 System.out.println("The number is even");
 } else {
 System.out.println("The number is odd");
 }
 }
 }
 */
/*
 public static void main(String[] args) {
 Scanner user_input = new Scanner(System.in);
 int high1, high2, temp, counter;
 while (true) {
 high1 = Integer.MIN_VALUE;
 high2 = Integer.MIN_VALUE;
 counter = 0;
 do {
 counter++;
 System.out.print("Please enter a number between 0 and 1000: ");
 temp = user_input.nextInt();
 if (temp >= high1) {
 high2 = high1;
 high1 = temp;
 } else if (temp >= high2) {
 high2 = temp;
 }
 } while (counter < 10);
 System.out.printf("The largest number is %d, the next largest number is %d\n", high1, high2);
 }
 }
 */

/*
 public static void main(String[] args) {
 Scanner user_input = new Scanner(System.in);
 int number, holder, temp;
 while (true) {
 System.out.print("Please input a number: ");
 number = user_input.nextInt();
 if (String.valueOf(number).length() == 1) {
 System.out.printf("The number %d is not a palindrome\n", number);
 } else {
 holder = number;
 temp = 0;
 for (int i = 1; i <= String.valueOf(number).length(); i++) {
 temp = temp * 10 + holder % 10;
 holder = holder / 10;
 }
 if (temp == number) {
 System.out.printf("The number %d is a palindrome\n", number);
 } else {
 System.out.printf("The number %d is not a palindrome\n", number);
 }
 }
 }
 }
 */
/*
 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 int  length;
 String left, right,  new_string;
 while (true) {
 left = "";
 right = "";
 System.out.print("Please enter anything: ");
 new_string = input.next();
 length = String.valueOf(new_string).length();
 if (length % 2 == 0) {
 for (int i = 1; i <= (length / 2); i++) {
 //build the checks
 left += new_string.charAt(i - 1);
 right += new_string.charAt(length - i);
 }
 } else {
 for (int i = 1; i <= ((length - 1) / 2); i++) {
 left += new_string.charAt(i - 1);
 right += new_string.charAt(length - i);
 }
 }
 if (length > 1) {
 if (right.equals(left)) {
 System.out.println("Palindrome");
 } else {
 System.out.println("!Palindrome");
 }
 } else {
 System.out.println("!Long Enough");
 }
 }
 }
 */
