/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package check;

/**
 *This is the tester class for MonthDays
 * @author Ari
 */
public class TestMonthDays {

    /**
     * main method runs through the steps of question 3
     * @param args
     */
    public static void main(String[] args) {

        int month;
        int year;

        do {
            month = DRY.positiveInteger("Enter a month (1-12): ") - 1;
            if (month > 12) {
                System.out.format("Please remember that the highest month number"
                        + " is 12.%nPlease Try again.%n");
            }
        } while (month > 12);
        year = DRY.positiveInteger("Enter a year: ");

        MonthDays howManyDaysAreThere = new MonthDays(month, year);

        System.out.format("There are %d days in %s in the year %d",
                howManyDaysAreThere.getNumberOfDays(),
                howManyDaysAreThere.getMonthName(), year);

    }
}
