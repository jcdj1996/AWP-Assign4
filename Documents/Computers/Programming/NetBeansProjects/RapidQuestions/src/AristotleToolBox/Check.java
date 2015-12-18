package AristotleToolBox;

import java.util.regex.Pattern;

/**
 * A set of tools to do boolean validation.
 * These methods are often written over and over again so they can be used globally
 * instead of typing them out over and over again
 *
 * @author Ari
 */
public class Check {

    public static final boolean isWholeNumber(int number) {
        if (number >= 0) {
            return true;
        }
        DRY.errorMsg(new String[]{"You have to enter a value greater than 0", "Negative dollar value Entered"});
        return false;
    }

    public static final boolean isInteger(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (Exception e) {
            DRY.errorMsg(new String[]{"Sorry, you didn't enter and Integer", "Invalid Number"});
            return false;
        }
    }

    public static final boolean isRealNumber(String input) {
        try {
            Double.parseDouble(input);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static final boolean isBetweenIntegerRange(int test, int low, int high) {
        if (test >= low && test <= high) {
            return true;
        }
        DRY.errorMsg(new String[]{String.format("You have to input a number bewtten %d and %d", low, high), "Bad Entry"});
        return false;

    }

    public static final boolean isBetweenRealRange(double test, double low, double high) {
        if (test >= low && test <= high) {
            return true;
        }
        DRY.errorMsg(new String[]{String.format("You have to input a number bewtten %f and %f", low, high), "Bad Entry"});
        return false;
    }

    /**
     * isNotEmptyString is a boolean check to show the user an error message if the input is an 
     * empty String.
     * @param checkVariable - variable to be checked
     * @param errorReport - error message to be shown must be new String[]{a,b}
     * @return true if the String is not empty shows an error message if false
     */
    public static final boolean isNotEmptyString(String checkVariable, String[] errorReport) {
        if (!checkVariable.isEmpty()) {
            return true;
        }
        DRY.errorMsg(errorReport);
        return false;
    }

    public static final boolean isRegex(String checkVariable, String regex, String[] invalidAnswer, String[] errorReport) {
        if (!checkVariable.isEmpty()) {
            if (Pattern.matches(regex, checkVariable)) {
                return true;
            }
            DRY.errorMsg(invalidAnswer);
            return false;
        }
        DRY.errorMsg(errorReport);
        return false;
    }

    public static boolean isDateYYYYMMDD(String date) {
        return Check.isRegex(date,
                "(19|20){1}\\d{2}/(0?[1-9]|1[0-2])/([12]\\d|[0]?[1-9]|[3][01])",
                new String[]{"Sorry, you didn't enter a valid format please try (YYYY/MM/DD)", "Invalid Formata"},
                new String[]{"Sorry you didn't enter informaiton", "Empty Entry"});
    }
}
