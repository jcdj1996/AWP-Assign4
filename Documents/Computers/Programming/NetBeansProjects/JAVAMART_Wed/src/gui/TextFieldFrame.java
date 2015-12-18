package gui;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author Tony
 */
public class TextFieldFrame extends JFrame
{
    //declare labels
    private final JLabel firstNameLabel, userNameLabel, passwordLabel;
    
    //declare textboxes
    private final JTextField firstNameTextField, userNameTextField;
    private final JTextField passwordTextField;
    
    public TextFieldFrame()
    {
        
        super("Text and Password Fields");
        setLayout(new FlowLayout());
        
        //initializing the labels
        firstNameLabel = new JLabel("First Name:");
        userNameLabel = new JLabel("User Name:");
        passwordLabel = new JLabel("Password");
        
        //initialize the text fields
        firstNameTextField = new JTextField(10);
        userNameTextField = new JTextField("Enter User Name");
        passwordTextField = new JPasswordField("***");
        
        //add the labels and text fields
        add(firstNameLabel);
        add(firstNameTextField);
        add(userNameLabel);
        add(userNameTextField);
        //add the label and password field
        
        add(passwordLabel);
        add(passwordTextField);
        
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
            String string = "";
            
            if(event.getSource()==firstNameTextField)
            {
                string = String.format("firstNameTextField: %s",
                        event.getActionCommand());
            }
            else if(event.getSource()==userNameTextField)
            {
                string = String.format("firstNameTextField: %s",
                        event.getActionCommand());
            }
            else if(event.getSource()==passwordTextField)
            {
                string = String.format("firstNameTextField: %s",
                        event.getActionCommand());
            }
            
            JOptionPane.showMessageDialog(null,string);
        }
    }
    
}
