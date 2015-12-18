/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package check;

import java.text.DateFormatSymbols;

/**
 * This class does some calendar arithmetic necessary to answer question 3
 * @author Ari
 */
public class MonthDays {

    final int[] DAYS_IN_MONTHS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    final String[] NAME_OF_MONTH = new DateFormatSymbols().getMonths();

    /**
     * contains the month inputted by the user
     */
    public int month;

    /**
     * Contains the year inputted by the user
     */
    public int year;

    /**
     * Constructs a new MonthDays Object
     */
    public MonthDays() {
    }

    /**
     * Constructs a new MonthDays Object with a month and year initialized
     *
     * @param month
     * @param year
     */
    public MonthDays(int month, int year) {
        this.setMonth(month);
        this.setYear(year);
    }

    /**
     * returns the numerical value of the month
     *
     * @return Returns the array value of the month
     */
    public int getMonth() {
        return month;
    }

    /**
     * Sets the value of the month
     *
     * @param month - 0 = Jan 11 = Dec
     * @return true if method updates the month, else false
     */
    public final boolean setMonth(int month) {
        if (month >= 0 && month <= 11) {
            this.month = month;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of the year inputted by the user
     *
     * @return The year stored in the object
     */
    public int getYear() {
        return year;
    }

    /**
     * Sets the year of the MonthDays object
     *
     * @param year - the year to be updated
     * @return true if the update succeeds, else false.
     */
    public final boolean setYear(int year) {
        if (year > 0) {
            this.year = year;
            return true;
        }
        return false;
    }

    /**
     * Returns the number of days in a month 

     * @return number of days in the month
     */
    public int getNumberOfDays() {
        return (month == 2 && leapYear(year)) ? DAYS_IN_MONTHS[month] + 1 : DAYS_IN_MONTHS[month];
    }

    /**
     * Returns the English name of the month
     * @return name of the month
     */
    public String getMonthName() {
        return NAME_OF_MONTH[month];
    }

    /**
     * Determines if the year is a leap year based on Georgian dates
     * @param year
     * @return true if the year is a leap year, else false
     */
    private boolean leapYear(int year) {
        return ((year % 400 == 0) | (year % 4 == 0 && year % 100 != 0));
    }

}
