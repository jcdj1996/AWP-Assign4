/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package check;

import java.util.Scanner;

/**
 * This is the Tester Class for Test Scores
 * @author Ari
 */
public class TestScoresTester {

    /**
     * Runs the test program for question 3
     * @param args
     */
    public static void main(String[] args) {
        
        final int CLASS_SIZE = 3;

        double d;
        String s;
        boolean b = true;

        String message;
        
        TestScores studentMarks = new TestScores(CLASS_SIZE);
        Scanner userInput = new Scanner(System.in);

        System.out.format("Please enter %d students test scores.%n", CLASS_SIZE);
        for (int i = 0; i < CLASS_SIZE; i++) {
            message = "Please enter the test score for student "+ (i + 1) + " ";
            
            
            studentMarks.setScore(DRY.positiveDouble(message),i);

            
        }
        System.out.format("Thank you.%n");
        System.out.format("The average for the course is %.2f.", studentMarks.average());
    }  
        
}
