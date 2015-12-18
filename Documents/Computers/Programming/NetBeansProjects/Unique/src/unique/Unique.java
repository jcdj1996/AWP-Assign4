/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unique;

/**
 *
 * @author Ari
 */
// Lab 1: Unique.java
// Reads in 5 unique numbers.
import java.util.Scanner;

public class Unique {

    // gets 5 unique numbers from the user
    public static void getNumbers() {
        Scanner input = new Scanner(System.in);

        /* Create an array of five elements*/
        int[] numbers = new int[5];
        int count = 0; // number of uniques read
        int entered = 0; // number of entered numbers

        while (entered < numbers.length) {
            System.out.print("Enter number: ");
            /* Write code here to retrieve the input from the user */
            int number = input.nextInt();

            // validate the input
         /* Write an if statement that validates the input */
            if (number >= 10 && number <= 100) {
                // flags whether this number already exists
                boolean containsNumber = false;

                // increment number of entered numbers
                entered++;

                /* Compare the user input to the unique numbers in the array using a for 
                 statement. If the number is unique, store new number */
                for (int i = 0; i < count; i++) {
                    if (number == numbers[i]) {
                        containsNumber = true;
                        break;
                    }
                }
                /* add the user input to the array only if the number is not already 
                 in the array */
                if (!containsNumber) {
                    /* Write code to add the number to the array and increment 
                     unique items input */
                    numbers[count] = number;
                    count++;
                } // end if
                else {
                    System.out.printf("%d has already been entered\n", number);
                }
            } // end if
            else {
                System.out.println("number must be between 10 and 100");
            }

            // print the list of unique values
            for (int i = 0; i < count; i++) {
                System.out.format("%d%n", numbers[i]);
            }

            /* Write code to output the contents of the array */
        } // end while      
    } // end method getNumbers

    public static void main(String[] args) {
        getNumbers();
    }

} // end class Unique

/**
 * ************************************************************************
 * (C) Copyright 1992-2012 by Deitel & Associates, Inc. and * Pearson Education,
 * Inc. All Rights Reserved. * * DISCLAIMER: The authors and publisher of this
 * book have used their * best efforts in preparing the book. These efforts
 * include the * development, research, and testing of the theories and programs
 * * to determine their effectiveness. The authors and publisher make * no
 * warranty of any kind, expressed or implied, with regard to these * programs
 * or to the documentation contained in these books. The authors * and publisher
 * shall not be liable in any event for incidental or * consequential damages in
 * connection with, or arising out of, the * furnishing, performance, or use of
 * these programs. *
 * ***********************************************************************
 */
