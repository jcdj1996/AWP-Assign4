package javaassignement1;

import java.util.Scanner;

/**
 * 200209736
 *
 * @author Ari
 */
public class JavaAssignement1 {

    public static void main(String[] args) {
//        Scanner user_input = new Scanner(System.in);
//        int select;
//        while (true) {
//            System.out.print("Which Subroutine would you like to run? ");
//            select = user_input.nextInt();
//            if (select == 1) {
        Ordered();
//            } else if (select == 2) {
        RGBtoCMYK();
//            } else if (select == 3) {
        Checkerboard();
//            } else if (select == 4) {
        RandomWalker();
//            } else if (select == 5) {
        RandomWalkers();
//            }
//        }
    }

    public static void Ordered() {
        Scanner user_input = new Scanner(System.in);
        int x, y, z;
        boolean isOrdered = false;
        System.out.print("% java Ordered ");
        x = user_input.nextInt();
        y = user_input.nextInt();
        z = user_input.nextInt();
        if (x >= y && y >= z) {
            isOrdered = true;
        }
        if (z >= y && y >= x) {
            isOrdered = true;
        }
        System.out.println(isOrdered);
    }

    public static void RGBtoCMYK() {
        Scanner user_input = new Scanner(System.in);
        int red, green, blue;
        double white;
        System.out.print("% java RGBtoCMYK ");
        red = user_input.nextInt();
        green = user_input.nextInt();
        blue = user_input.nextInt();
        white = (double) Math.max(Math.max(red, green), blue) / 255;
        System.out.printf("Cyan:    %f\n", 1 - (double) red / (255 * white));
        System.out.printf("Magenta: %f\n", 1 - (double) green / (255 * white));
        System.out.printf("Yellow:  %f\n", 1 - (double) blue / (255 * white));
        System.out.printf("Black:   %f\n", 1 - white);
    }

    public static void Checkerboard() {
        Scanner user_input = new Scanner(System.in);
        int N;
        System.out.print("% java Checkerboard ");
        N = user_input.nextInt();
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N * 2; j++) {
                if (i % 2 == 1 && j % 2 == 0 || i % 2 == 0 && j % 2 == 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }

    public static void RandomWalker() {
        Scanner user_input = new Scanner(System.in);
        int steps, direction, x = 0, y = 0;
        System.out.print("% java RandomWalker ");
        steps = user_input.nextInt();
        for (int i = 1; i <= steps; i++) {
            direction = (int) (Math.random() * 4);
            if (direction == 0) {
                y++;
            } else if (direction == 1) {
                x++;
            } else if (direction == 2) {
                y--;
            } else if (direction == 3) {
                x--;
            }
            System.out.printf("(%d,%d)\n", x, y);
        }
        System.out.println("Squared distance = " + (int) (Math.pow(x, 2) + Math.pow(y, 2)));
    }

    public static void RandomWalkers() {
        Scanner user_input = new Scanner(System.in);
        int n, t, direction, x, y;
        double holder = 0;
        System.out.print("% java RandomWalkers ");
        n = user_input.nextInt();
        t = user_input.nextInt();
        for (int i = 1; i <= t; i++) {
            x = 0;
            y = 0;
            for (int j = 1; j <= n; j++) {
                direction = (int) (Math.random() * 4);
                if (direction == 0) {
                    y++;
                } else if (direction == 1) {
                    x++;
                } else if (direction == 2) {
                    y--;
                } else if (direction == 3) {
                    x--;
                }
            }
            holder = holder + Math.pow(x, 2) + Math.pow(y, 2);
        }
        holder = holder / t;
        System.out.printf("mean squared distance = %f\n", holder);
    }
}
/* ReadMe! 
 *******************************************************************************
 * Name: Aristotle Rovithis
 * Student # 200209736
 * Hours to complete assignment (optional): 2
 *******************************************************************************
 * How does the mean squared distance of a random walker grow as a function of the 
 * number of steps N? Briefly justify your answer based on computational experiments.
 * (Describe the experiments and/or list several data points.) 
 *------------------------------------------------------------------------------
 The mean square distance of a random walker grows at f(n) = ~n | n != 1. 
 These are my results: when I ran 5 times with 100000 iterations

 a) f(1) = 1.0
 b) f(2) = 1.99444
 c) f(100) = 99.9775
 d) f(250) = 251.2606
 e) f(500) = 500.94386
 f) f(1000) = 1004.25378
 g) f(2500) = 2498.26398

 Theory behind this is that the sum of all the possible distances multplied
 by their frequency divided by the total number of outcomes is eqaul to the average
 distance. therefore f(n) ~ n

 *******************************************************************************
 * Did you receive help from classmates, past COMP1030 students, or anyone else?
 * Please list their names.
 *------------------------------------------------------------------------------

 No I figured this out on my own.

 *******************************************************************************
 * Describe any serious problems you encountered.
 *------------------------------------------------------------------------------

 figuring out how to calculate the random walker value distribution

 *******************************************************************************
 * List any other comments here.
 * ------------------------------------------------------------------------------

 This was a fun thing to do and really interesting to calculate.

 */
