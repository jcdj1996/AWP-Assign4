
package javaapplication30;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author Devlin 200328925
 * This should create a list of a person top 5 favorite apps
 */
public class LabD {
    public static void main(String[] args){
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Please state Your #1 App ");
        String A1;
        A1 = keyboard.nextLine();
        
        System.out.print("\n Please state Your #2 App ");
        String A2;
        A2 = keyboard.nextLine();
        
        System.out.print("\n Please state Your #3 App ");
        String A3;
        A3 = keyboard.nextLine();
        
        System.out.print("\n Please state Your #4 App ");
        String A4;
        A4 = keyboard.nextLine();
        
        System.out.print("\n Please state Your #5 App ");
        String A5;
        A5 = keyboard.nextLine();
        
        System.out.printf("\nYour 5 fav Apps are: %s , %s, %s, %s, %s", A5, A4, A3, A2, A1);
    }
}
