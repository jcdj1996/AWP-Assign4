/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jahnaveemahesh;

//import java.util.Scanner;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;


/**
 *
 * @author Ari
 */
public class JahnaveeMahesh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Scanner keyboard = new Scanner(System.in);
//        int i;
//
//        while (true) {
//            i = keyboard.nextInt();
//            System.out.println(i);
//
//            if (i == 8) {
//                System.out.println("you \0inputted an 8" + "\0");
//            } else if (i > 9) {
//                System.out.println("Your input is greater than 9");
//                if (i == 12) {
//                    System.out.println("You\0 inputted a 12");
//                }
//            }
//        }

        //Commenting Ctrl+/
//        Undo and Redo Ctrl+Z Ctrl+y
//        Difference between print and println
//        System.out.print("1");
//        System.out.println("2");

//        System.out.println("3");
        
//        System.out.format("%c %s %n", 'F', "Format");
//                System.out.format("%d %d %n", 255, 1234123456);
//                System.out.format("%f %f %n", 22345678654323456789876543234567854323456755.0, 1234123456.987);
//                System.out.format("%b %b %n", 1, 0);
//                System.out.format("%b %b %n", true, false);
//                System.out.format("%b %b %n", 1, 0);
               

    }
    public void paint (Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
                g2.draw(new Line2D.Double(1, 1, 100, 1000));

}

}
