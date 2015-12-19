package AristotleToolBox;

import java.util.Arrays;

/**
 * These are a set of validation checks for information related to Entities (Nouns) in Canada. Class
 * contains validation for names, addresses, contact information, and a method to exchange an
 * integer array into a String for currency formatting
 *
 * This will be expanded in the future by Name conventions for people and addresses research all
 * valid entries form Canada post
 *
 * Th money part should probably go in its own class like Accounting, but since there is only one
 * method related to money its still appropriate to leave it here
 *
 * @author Ari
 */
public class EntityInformation {

    public static final String[] PROVINCES_SHORT = {
        "AB", "BC", "MN", "NFLD", "NB", "NS", "NU", "NWT", "ON", "PEI", "QC", "SK", "YK"
    };

    public static final String[] PROVINCES_LONG = {
        "Alberta", "British Columbia", "Manitoba", "Newfoundland and Labrador", "New Brunswick",
        "Nova Scotia", "Nunavut", "North West Territories", "Ontario", "Prince Edward Island",
        "Quebec", "Saskatchewan", "Yukon"
    };

    /**
     * Setter for first name, ensures the field was not left blank.
     *
     * @param name - first name of the employee
     * @return true if the update was successful, else false.
     */
    public static final boolean checkName(String name) {
        return Check.isRegex(name,
                "[A-Z]?[a-z]{0,20}",
                new String[]{"You need to have a valid name", "Name Error"},
                new String[]{"Sorry, you didn't enter a name", "Please tell me your name "}
        );
    }

    /**
     * changes the province to ensure it is in the short form
     *
     * @param province the province to be checked
     * @return short province if there is a match, else ""
     */
    public static String changeProvince(String province) {
        for (String p : PROVINCES_SHORT) {
            if (province.equals(p)) {
                return province;
            }
        }
        for (String p : PROVINCES_LONG) {
            if (province.equals(p)) {
                return PROVINCES_SHORT[Arrays.asList(PROVINCES_LONG).indexOf(p)];
            }
        }
        return "";
    }

    /**
     * sets the unit number of an employees address if one is inputted else it remains blank
     *
     * @param unitNumber
     * @return true if the unit number is empty else false
     */
    public static final boolean checkUnitNumber(String unitNumber) {
        return !unitNumber.isEmpty();
    }

    /**
     * sets the street number of the employees address information
     *
     * @param streetNumber street number/house number of the employee
     * @return true if the record was updates else false
     */
    public static final boolean checkStreetNumber(int streetNumber) {
        return Check.isNotEmptyString(String.valueOf(streetNumber),
                new String[]{"You need to have a Street Number", "Street Number Error"}
        );
    }

    /**
     * sets the street name portion on and employees address
     *
     * @param streetName
     * @return true if the record was updated else false
     */
    public static final boolean checkStreetName(String streetName) {
        return Check.isRegex(streetName,
                "[A-Z]?[a-z]{0,20}",
                new String[]{"You need to have a valid street name", "Street Name Error"},
                new String[]{"Sorry, I didn't receive a street name", "Empty Street name"}
        );
    }

    /**
     * sets the street type of the employees address
     *
     * @param streetType - the street type to e updated
     * @return true if the record was updated else false.
     */
    // this list will refer to this website in the future 
    // https://www.canadapost.ca/tools/pg/manual/PGaddress-e.asp?ecid=murl10006450#1423617
    public static final boolean checkStreetType(String streetType) {
        return Check.isRegex(streetType,
                "[A-Z]?[a-z]{0,10}",
                new String[]{"You need to have a valid Street Type", "Street Type Error"},
                new String[]{"You need to have a Street Type", "Empty Type Error"}
        );
    }

    /**
     * sets the city portion of an employees address
     *
     * @param city the city to be stored
     * @return true if the record was updated else false
     */
    public static final boolean checkCity(String city) {
        return Check.isRegex(city,
                "[A-Z]?[a-z]{2,20}",
                new String[]{"You need to have a valid City", "Invalid City Error"},
                new String[]{"Sorry, You need to have a City", "Blank City Error"}
        );
    }

    /**
     * sets the state/province portion of an employee's address
     *
     * @param stateOrProvince the state/province to be entered
     * @return true if the record was updated, else false
     */
    public static final boolean checkStateOrProvince(String stateOrProvince) {
        stateOrProvince = EntityInformation.changeProvince(stateOrProvince);
        return Check.isNotEmptyString(stateOrProvince,
                new String[]{"You need to have a valid province", "incorrect Province Error"});
    }

    /**
     * sets the postal code portion of the employee's address
     *
     * @param postal the postal code to be stored
     * @return ture if the record updated successfully, else false
     */
    public static final boolean checkPostal(String postal) {
        return Check.isRegex(postal,
                "\\p{Alpha}\\d\\p{Alpha}[ ]?\\d\\p{Alpha}\\d",
                new String[]{"Sorry, you didn't enter a valid postal code format",
                    "invalid postal code format Entereed"},
                new String[]{"Sorry, you didn't enter a postal code",
                    "Please don't go postal on me"});
    }

    /**
     * sets the employees phone number
     *
     * @param phoneNumber - the phone number to be stored
     * @return true if record is set, else false
     */
    public static final boolean checkPhoneNumber(String phoneNumber) {
        return Check.isRegex(phoneNumber,
                "[+]?[\\d]?[' '-]?[(]?[\\d]{3}[)]?[' '-]?[\\d]{3}[-' ']?[\\d]{4}",
                new String[]{"Sorry, you didn't enter a valid phone number format",
                    "invalid Phone number format Entereed"},
                new String[]{"Sorry, you didn't enter a phone number",
                    "Blank Phone number Entereed"}
        );
    }

    /**
     * sets the email record for the employee
     *
     * @param email the email to be recorded
     * @return true if successful else false
     */
    public static final boolean checkEmail(String email) {
        return Check.isRegex(email,
                "[\\p{Alnum}'.']++@\\p{Alnum}++['.']\\p{Alnum}++",
                new String[]{"You need to have a valid email i.e.\nexample@javamart.com",
                    "Invalid Email Entereed"},
                new String[]{"You need to enter an email address",
                    "Blank email Entered"}
        );
    }

    public static final String changeMoneyToString(int[] pay) {
        return String.format("$%d.%d", pay[0], pay[1]);
    }

    //Holiday Generator
    //Fixed - if date ==
    //New Year's Day    01 01 XXXX
    //Christmas Day     25 12 XXXX
    //Boxing Day    26 12 XXXX
    //Rememberence Day 11 11 XXXX
    //Calendar Dependant if DOW ==
    //Canada Day        01 07 XXXX unless 01 is sunday
    //Labour Day        first monday 09 XXXX
    //Victoria Day  Mon May 24 or monday before
    //Thanksgiving second monday in october
    //Family Day        third monday in feb
    //Civic Holiday     first monday in August
    //Easter  lol EASTER AGAIN
    //Good Friday       friday before easter
    //Easter Monday
    //Provincial
}
