package gui;

import javax.swing.*;
import java.*;

/**
 *
 * @author Marco Duarte
 */
public class Adding 
{
    public static void main(String[] args)
    {
        try
        {
            int firstNum =  Integer.parseInt
                (JOptionPane.showInputDialog("Please Enter you first number: ")),
                secondNum = Integer.parseInt
                (JOptionPane.showInputDialog("Please Enter you second number: "));
            
            JOptionPane.showMessageDialog(null,"Sum: " + (firstNum +secondNum),
                    "The Sum Of Two Intergers: ", JOptionPane.PLAIN_MESSAGE);
        }
        catch(NumberFormatException error)
        {
            JOptionPane.showMessageDialog(null, error.getMessage(), "Error!",
                    JOptionPane.ERROR_MESSAGE);
        }
        catch(Exception e)
        {
            System.err.println(e.toString());
        }
        
                
        
    }
    
}//class
