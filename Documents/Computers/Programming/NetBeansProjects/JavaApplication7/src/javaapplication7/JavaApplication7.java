package javaapplication7;

import java.util.Scanner;

/**
 *
 * @author Ari
 */
public class JavaApplication7 {

    public static String season(int month, int day) {
        if (month == 1 || month == 2 || month == 3 && day <= 19 || month == 12 && day >= 21) {
            return ("It's Winter");
        } else if (month == 4 || month == 5 || month == 6 && day <= 20 || month == 3 && day >= 20) {
            return ("It's Spring");
        } else if (month == 7 || month == 8 || month == 9 && day <= 22 || month == 6 && day >= 21) {
            return ("It's Summer");
        } else if (month == 10 || month == 11 || month == 12 && day <= 20 || month == 9 && day >= 23) {
            return ("It's Fall");
        } else {return("");
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give me two integers");
        System.out.println(season(input.nextInt(), input.nextInt()));

    }

}
