package euler;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Ari
 */
public class DisplayAnswers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Problem0001_MultiplesOf3And5 p = new Problem0001_MultiplesOf3And5();
        int tests = 0;
        while (++tests < 1000000) {
            MeasureExecutionTime(p);
        }
    }

    private static String MeasureExecutionTime(Object o) {
        Class c = o.getClass();
        long startTime;
        long endTime;
        startTime = System.nanoTime();
        for (Method m : c.getDeclaredMethods()){
            try {
               m.invoke(c, "1000");
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                Logger.getLogger(DisplayAnswers.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        endTime = System.nanoTime();
        System.out.println((endTime - startTime));
        return "" + (endTime - startTime);
    }

}
