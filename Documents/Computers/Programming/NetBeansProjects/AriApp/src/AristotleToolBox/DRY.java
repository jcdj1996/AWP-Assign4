package AristotleToolBox;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * This set of tools was created to shorten the amount of time it takes to code common solutions
 * Contained here are methods that ask a question and return a value, reducing the line counts of a
 * program by half for question and answer type code.
 *
 * Expect to find anything that can be repeated multiple times here
 *
 * @author Ari
 */
public class DRY {

    /**
     * This method displays a Panel describing an error
     *
     * @param errorReport
     */
    public static final void errorMsg(String[] errorReport) {
        JOptionPane.showMessageDialog(null, errorReport[0], errorReport[1], JOptionPane.ERROR_MESSAGE);
    }

    /**
     * this method formats a date to be in DD MMM YY format
     *
     * @param cal the date to go in
     * @return the formatted date
     */
    public static final String sendDate(GregorianCalendar cal) {
        return String.format("%d %s %d",
                cal.get(Calendar.DAY_OF_MONTH),
                cal.getDisplayName(Calendar.MONTH, Calendar.SHORT, Locale.CANADA),
                //cal.get(Calendar.MONTH),
                cal.get(Calendar.YEAR)
        );
    }

    public static String requestSpecificAnswer(String question) {
        System.out.print(question + ": ");
        return new Scanner(System.in).nextLine();
    }

    public static String requestSpecificAnswerUX(String question, String UXdemo) {
        System.out.format("%s (%s): ", question, UXdemo);
        return new Scanner(System.in).nextLine();
    }

    public static int requestInteger(String question, int low, int high) {
        String carrier;
        do {
            do {
                // ask a question
                // accept an answer
                carrier = requestSpecificAnswerUX(question, low + " to " + high);
                //make sure the answer is an integer
            } while (!Check.isInteger(carrier));
            // check to see if the integer is in range
        } while (!Check.isBetweenIntegerRange(Integer.parseInt(carrier), low, high));
        return Integer.parseInt(carrier);
    }
    
    public static double requestRealNumber(String question, double low, double high) {
        String carrier;
        do {
            do {
                // ask a question
                // accept an answer
                carrier = requestSpecificAnswerUX(question, low + " to " + high);
                //make sure the answer is an double
            } while (!Check.isRealNumber(carrier));
            // check to see if the double is in range
        } while (!Check.isBetweenRealRange(Double.parseDouble(carrier), low, high));
        return Double.parseDouble(carrier);
    }

    public static GregorianCalendar changetoDate(String date) {
        String[] parts = date.split("/");
        return new GregorianCalendar(Integer.parseInt(parts[0]),
                Integer.parseInt(parts[1]) - 1,
                Integer.parseInt(parts[2]));
    }

}
