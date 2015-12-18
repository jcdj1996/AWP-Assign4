/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package check;

import java.util.Scanner;

/**
 * This class is specifically used to reduce the amount of time I spend
 * repeating code.
 *
 * @author Ari
 */
public class DRY {

    private static boolean b;
    private static Scanner userInput = new Scanner(System.in);
    private static String s;

    /**
     * positiveDouble returns ensures a positive double data type is returned
     *
     * @param message - a message displayed to the user
     * @return a double value
     */
    public static double positiveDouble(String message) {
        double number = 0;
        do {
            b = true;
            try {
                System.out.format("%s", message);
                s = userInput.nextLine();
                number = Double.parseDouble(s);
                if (number < 0) {
                    throw new NegativeMarkException();
                }
            } catch (NullPointerException | NumberFormatException e) {
                System.out.format("I'm sorry You have to a number.%nPlease try "
                        + "again%n");
                b = false;
            } catch (NegativeMarkException e) {
                System.out.format("Your number has to be positive%n");
                b = false;
            }
        } while (!b);
        return number;
    }

    /**
     * positiveInteger ensures the user types in an integer datatype
     *
     * @param message - message displayed to the user
     * @return an integer data type
     */
    public static int positiveInteger(String message) {
        int number = 0;
        do {
            b = true;
            try {
                System.out.format("%s", message);
                s = userInput.nextLine();

                number = Integer.parseInt(s);

                if (number < 0) {
                    throw new NegativeMarkException();
                }
                if (number % 1 > 0) {
                    throw new InvalidIntegerNumberException();
                }

            } catch (NullPointerException | NumberFormatException e) {
                System.out.format("I'm sorry You have to a number.%nPlease try"
                        + " again%n");
                b = false;
            } catch (NegativeMarkException e) {
                System.out.format("Your number has to be positive%n");
                b = false;
            } catch (InvalidIntegerNumberException e) {
                System.out.format("Your number has to be an Intger %n");
                b = false;
            }
        } while (!b);
        return number;
    }
}
