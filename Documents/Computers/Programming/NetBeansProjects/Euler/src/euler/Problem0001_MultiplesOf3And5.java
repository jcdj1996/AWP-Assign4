package euler;

import java.util.ArrayList;

/**
 * @since 2015-NOV-06
 * @author Ari
 */
public class Problem0001_MultiplesOf3And5 {
    //Loops
    //original answer
    public int answer0000(int limit) {
        int sum = 0;
        for (int checkNumber = 1; checkNumber < limit; checkNumber++) {
            sum += ((checkNumber % 3 == 0 || checkNumber % 5 == 0) ? checkNumber : 0);
        }
        return sum;
    }

    //created for efficientcy check
    @SuppressWarnings("empty-statement")
    public int answer0001(int limit) {
        int sum = 0;
        for (int checkNumber = 1;
                checkNumber < limit;
                sum += ((checkNumber % 3 == 0 || checkNumber % 5 == 0) ? checkNumber : 0), checkNumber++);
        return sum;
    }

    // created for eficientcy check
    public int answer0002(int limit) {
        int sum = 0;
        int checkNumber = 0;
        while (++checkNumber < limit) {
            sum += ((checkNumber % 3 == 0 || checkNumber % 5 == 0) ? checkNumber : 0);
        }
        return sum;
    }
    //THERE IS NO DISTINGUISHABLE DIFFERENCE BETWEEN THE LOOPS
    
    
    //funtional answer
    public int answer0003(int limit) {
        return factorSum(3,limit) + factorSum(5,limit) - factorSum(15,limit);
    }
    

    
    //GENERAL ANSWER
    public ArrayList<Integer> findAllfactors(int[] userFactors){
        ArrayList<Integer> factors = new ArrayList<>();
        
        //all factors are prime numbers
            //get all prime numbers to the limit/2
        return factors;
    }
    
    //prime seive

    
        //series formula conversion (n^2+n)/2 multiplied by factor
    public int factorSum(int factor, int limit) {
        int seriesConversion = (limit-1) / factor;
        return factor * (seriesConversion * (seriesConversion + 1) / 2);
    }
    
}
