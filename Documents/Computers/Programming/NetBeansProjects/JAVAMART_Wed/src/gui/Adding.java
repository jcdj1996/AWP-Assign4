package gui;
import javax.swing.*;
import java.awt.*;
import java.util.*;


public class Adding 
{
    public static void main(String[] args)
    {
        try
        {
        int firstNum = Integer.parseInt(
                JOptionPane.showInputDialog("Please enter your first number:")),
            secondNum = Integer.parseInt(
                JOptionPane.showInputDialog("Please enter your second number:"));
        
        JOptionPane.showMessageDialog(null,"Sum: " +
                (firstNum + secondNum), "The Sum of Two Integers.",
                JOptionPane.PLAIN_MESSAGE);

        }
        catch(NumberFormatException | InputMismatchException error)
        {
            JOptionPane.showMessageDialog(null, error.getMessage(),"Error!", 
                    JOptionPane.ERROR_MESSAGE);
        }
                
        
    }
}
