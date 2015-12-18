/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euler;

import java.util.ArrayList;

/**
 *
 * @author Ari
 */
public class Problem0001_MultiplesOf3And5 {

    //Loops
    //original answer
    public static int answer0000(String limit) {
        int numericLimit = Integer.valueOf(limit);
        int sum = 0;
        for (int checkNumber = 1; checkNumber < numericLimit; checkNumber++) {
            sum += ((checkNumber % 3 == 0 || checkNumber % 5 == 0) ? checkNumber : 0);
        }
        return sum;
    }

    //created for efficientcy check
    @SuppressWarnings("empty-statement")
    public static int answer0001(String limit) {
        int numericLimit = Integer.valueOf(limit);
        int sum = 0;
        for (int checkNumber = 1;
                checkNumber < numericLimit;
                sum += ((checkNumber % 3 == 0 || checkNumber % 5 == 0) ? checkNumber : 0), checkNumber++);
        return sum;
    }

    // created for eficientcy check
    public static int answer0002(String limit) {
        int numericLimit = Integer.valueOf(limit);
        int sum = 0;
        int checkNumber = 0;
        while (++checkNumber < numericLimit) {
            sum += ((checkNumber % 3 == 0 || checkNumber % 5 == 0) ? checkNumber : 0);
        }
        return sum;
    }
    //THERE IS NO DISTINGUISHABLE DIFFERENCE BETWEEN THE LOOPS

    //funtional answer
//    public static int answer0003(String limit) {
//        int numericLimit = Integer.valueOf(limit);
//        return factorSum(3, numericLimit)
//                + factorSum(5, numericLimit)
//                - factorSum(15, numericLimit);
//    }
//    
//    public static int answer0004 (int limit){
//                return factorSum(3, limit)
//                + factorSum(5, limit)
//                - factorSum(15, limit);
//    }
//
//    //GENERAL ANSWER
//    public static ArrayList<Integer> findAllfactors(int[] userFactors) {
//        ArrayList<Integer> factors = new ArrayList<>();
//
//        //all factors are prime numbers
//        //get all prime numbers to the limit/2
//        return factors;
//    }
//
//    //prime seive
//    //series formula conversion (n^2+n)/2 multiplied by factor
//    public static int factorSum(int factor, int limit) {
//        int seriesConversion = (limit - 1) / factor;
//        return factor * (seriesConversion * (seriesConversion + 1) / 2);
//    }
//
//    void answer0003() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}
