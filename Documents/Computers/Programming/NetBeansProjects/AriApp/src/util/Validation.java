package util;

import AristotleToolBox.Check;
import AristotleToolBox.EntityInformation;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * Provides methods for input validation
 */
public class Validation {

    /**
     * Passes the component of an action event, plus it's validation criteria,
     * to the appropriate validator for validation.
     *
     * This function will change the border colour of the component being
     * validated to red if validation fails, and remove the border if validation
     * is successful.
     *
     * @param e
     * @return String is invalid, empty otherwise
     */
    public Optional<String> validate(JComponent comp, String[] v_Common, HashMap<String, String[]> validations, boolean showMsg) {

        // get component name
        String name = comp.getName();
        Optional<String> result;

        // validate text fields
        if (comp.getClass().getTypeName().equals("javax.swing.JTextField")) {
            result = validateTextField((JTextField) comp, v_Common, validations.get(name), showMsg);

            // there is nothing to update
        } else {
            result = Optional.empty();
        }

        // validation failed
        if (result.isPresent()) {

            // redden the border
            comp.setBorder(BorderFactory.createLineBorder(Color.red));
            if (showMsg) {
                JOptionPane.showMessageDialog(null, result.get(), "Input Error", JOptionPane.ERROR_MESSAGE);
            }
            return Optional.of(result.get());

        } else {

            // reset the border
            comp.setBorder(BorderFactory.createEtchedBorder());
            return Optional.empty();
        }

    }

    /**
     * Validates a text field
     *
     * @param textField The text field to validate
     * @return String of error, or empty otherwise
     */
    public Optional<String> validateTextField(JTextField textField, String[] commonValidations, String[] specificValidations, boolean showMsg) {

        // component details
        String text = textField.getText();
        String name = textField.getName();

        // holds the list of requested validations
        ArrayList<String> vList = new ArrayList<String>();

        // combine the common and specific validations
        if (commonValidations != null) {
            vList.addAll(Arrays.asList(commonValidations));
        }
        if (specificValidations != null) {
            vList.addAll(Arrays.asList(specificValidations));
        }
        
        
        if (vList.contains("email")) {
            if (EntityInformation.checkEmail(text)) {
                return Optional.empty();
            } else {
                return Optional.of("Please enter a valid email\nexample@javamart.com");
            }
        }

        if (vList.contains("date")) {
            if (Check.isDateYYYYMMDD(text)) {
                return Optional.empty();
            } else {
                return Optional.of("Please enter a valid Date\nYYYY/MM/DD");
            }
        }
        if (vList.contains("phone")) {
            if (EntityInformation.checkPhoneNumber(text)) {
                return Optional.empty();
            } else {
                return Optional.of("Please enter a valid Phone number\n(###) ### ####");
            }
        }
        if (vList.contains("postal")) {
            if (EntityInformation.checkPostal(text)) {
                return Optional.empty();
            } else {
                return Optional.of("Please enter a valid postal code\nA1B 2C3");
            }
        }
        if (vList.contains("salaryRange")) {
            if (Check.isRealNumber(text) && Check.isBetweenRealRange(Float.parseFloat(text), 0, 100000)) {
                return Optional.empty();
            } else {
                return Optional.of("Please enter a valid salary between $0 and $100000");
            }

        }
        if (vList.contains("commissionRange")) {
            if (Check.isRealNumber(text) && Check.isBetweenRealRange(Float.parseFloat(text), 0, 1)) {
                return Optional.empty();
            } else {
                return Optional.of("Please enter a valid decimal between 0 and 1");
            }

        }

        // filter out the requested characters, if anything is left,
        // validation failed
        // nonBlank
        if (vList.contains("nonBlank")) {
            if (text.isEmpty()) {
                return Optional.of(name + " cannot be blank");
            }
        }

        // charOnly
        if (vList.contains("char")) {
            text = text.chars()
                    .filter(x -> !Character.isAlphabetic(x))
                    .mapToObj(c -> Character.toString((char) c))
                    .collect(Collectors.joining());
        }

        // alphaNumSpace
        if (vList.contains("space")) {
            text = text.chars()
                    .filter(x -> !Character.isSpaceChar(x))
                    .mapToObj(c -> Character.toString((char) c))
                    .collect(Collectors.joining());
        }

        // number only
        if (vList.contains("num")) {
            text = text.chars()
                    .filter(x -> !Character.isDigit(x))
                    .mapToObj(c -> Character.toString((char) c))
                    .collect(Collectors.joining());
        }
            
        // if text has chars remaining, compile error message
        if (text.length() == 0) {
            return Optional.empty();
            // validation succeeded
        } else {

            String errMsg = "";

            errMsg = name + " can only contain the following:";
            if (vList.contains("char")) {
                errMsg += " 'letters'";
            }

            if (vList.contains("num")) {
                errMsg += " 'numbers'";
            }

            if (vList.contains("space")) {
                errMsg += " 'spaces'";
            }

            return Optional.of(errMsg);
        }

    }

    /**
     * Validates a string to ensure it only contains characters, not including
     * spaces
     *
     * @param s The string to validate
     * @return True if the string only contains characters, false otherwise
     */
    public boolean validateCharOnly(String s) {
        return s.chars().allMatch(x -> Character.isLetter(x));
    }

    /**
     * Checks if a string is empty or not
     *
     * @param s The string to check
     * @return True if empty, false otherwise
     */
    public boolean validateNonEmpty(String s) {
        return s.isEmpty();
    }

    /**
     * Checks that the string only contains letters, numbers or spaces
     *
     * @param s The string to check
     * @return True if string only contains letters, numbers or spaces, false
     * otherwise
     */
    public boolean validateAlphaNumSpace(String s) {
        for (char c : s.toCharArray()) {
            if (!Character.isAlphabetic(c) && !Character.isDigit(c) && !Character.isSpaceChar(c)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Checks if all digits are numbers
     *
     * @param s The string to validate
     * @return True is string is all digits, false otherwise
     */
    public boolean validateNumOnly(String s) {
        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

}
