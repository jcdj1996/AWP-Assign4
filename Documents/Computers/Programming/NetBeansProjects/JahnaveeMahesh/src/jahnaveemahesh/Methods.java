/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jahnaveemahesh;

/**
 *
 * @author Ari
 */
public class Methods {

    public static void main(String[] args) {
        //ALWAYS DECLARE VAIRABLES FIRST
        double answer;
        
        double num1,num2;
        
        num1 = 4;
        num2 =4;
        
        answer = exponent(num1, num2);
        
        System.out.println(answer);

        //delete age
    }

    public static double exponent(double number1, double number2) {
        return Math.pow(number1,number2);
    }



}
