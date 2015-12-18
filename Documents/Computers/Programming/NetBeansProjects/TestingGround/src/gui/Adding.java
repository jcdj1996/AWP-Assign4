package gui;

import AristotleToolBox.Check;
import javax.swing.*;
import java.awt.*;
import java.util.*;

/**
 *
 * @author Ari
 */
public class Adding {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {

        String transfer;
        int num1;
        int num2;

        while (true) {
            transfer = JOptionPane.showInputDialog("Please enter a number");
            if (Check.isInteger(transfer)) {
                num1 = Integer.parseInt(transfer);
                transfer = "";
                break;
            }
        }
        while (true) {
            transfer = JOptionPane.showInputDialog("Please enter a number");
            if (Check.isInteger(transfer)) {
                num2 = Integer.parseInt(transfer);
                transfer = "";
                break;
            }
        }
        JOptionPane.showMessageDialog(null, 
                "Sum: "+(num1+num2)+"", 
                "The sum of two integers", 
                JOptionPane.PLAIN_MESSAGE);
        
    }



}
