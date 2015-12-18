package gui;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author Marco Duarte
 */
public class TextFieldFrame extends JFrame
{
    //declare labels
    private final JLabel firstNameLabel, userNameLabel, passwordLabel;
    
    //declare text boxes
    private final JTextField firstNameTextField, userNameTextField;
    private final JTextField passwordTextField;
    
    public TextFieldFrame()
    {
        super("Text and Password Fields");
        setLayout(new FlowLayout());
        
        //initialize the labels
        firstNameLabel = new JLabel("First Name");
        userNameLabel = new JLabel("User Name");
        passwordLabel = new JLabel("Password");
        
        //initializa the text fields
        firstNameTextField = new JTextField(10);
        userNameTextField = new JTextField("Enter User Name");
        passwordTextField = new JPasswordField("***");
        
        //add labels and text fields
        add(firstNameLabel);
        add(firstNameTextField);
        add(userNameLabel);
        add(userNameTextField);
        
        //add password label and field
        add(passwordLabel);
        add(passwordTextField);
        
        //below is the bond between the action listener and take the event object
        TextFieldHandler tfHandler = new TextFieldHandler();
        
        firstNameTextField.addActionListener(tfHandler);
        userNameTextField.addActionListener(tfHandler);
        passwordTextField.addActionListener(tfHandler);
    }
    
    //private inner class
    private class TextFieldHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent event)
        {
            String  string = "";
            
            if(event.getSource() == firstNameTextField)
            {
                string = String.format("firstNameTextField: %s", 
                        event.getActionCommand());
            }
            
            else if(event.getSource() == userNameTextField)
            {
                string = String.format("userNameTextField: %s", 
                        event.getActionCommand());
            }    
            
            else if(event.getSource() == passwordTextField)
            {
                string = String.format("passwordTextField: %s", 
                        event.getActionCommand());
            }
            
            JOptionPane.showMessageDialog(rootPane, string);
        }
    }
    
}//end of TextFieldFrame class
