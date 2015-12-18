/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euler;

/**
 *
 * @author Ari
 */
public class Problem2_EvenFibonacciNumbers {

    public static void main(String[] args) {
        answer0000(4000000);
    }

    public static long answer0000(long limit) {
        long number1 = 1;
        long number2 = 1;
        long total = number1 + number2;
        long eventotal = 0;

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(total);
        do {
            if (total %2 ==0){
                eventotal += total;
            }
            number1 = number2;
            number2 = total;
            total = number1 + number2;
            System.out.println(number1+number2);
        } while (number1 + number2 < limit);

        return eventotal;
    }
}
