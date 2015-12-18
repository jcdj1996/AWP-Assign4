package euler;

/**
 *
 * @author Ari
 */
public class Euler {

    public static void main(String[] args) {
        Problem0001_MultiplesOf3And5 p = new Problem0001_MultiplesOf3And5();

        int tests = 100;
        long total = 0;
        long startTime;
        long endTime;
        long duration;

        System.out.println(Long.MAX_VALUE);
        
        for (int i = 0; i < tests; i++) {
            startTime = System.nanoTime();
            p.answer0003(1000);
            endTime = System.nanoTime();
            duration = endTime - startTime;
            //System.out.println(endTime + " " + startTime + " " + duration);
            total += (duration);

        }
        System.out.println(total);
        System.out.println(total / tests);
    }

    private static long MeasureExecutionTime(Runnable function) {
        long startTime;
        long endTime;
        startTime = System.nanoTime();
        function.run();
        endTime = System.nanoTime();
        return endTime - startTime;
    }

}
