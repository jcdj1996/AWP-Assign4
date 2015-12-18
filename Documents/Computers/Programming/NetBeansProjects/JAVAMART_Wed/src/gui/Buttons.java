package gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Tony
 */
public class Buttons extends JFrame
{
    private final JButton firstButton, secondButton;
    
    public Buttons()
    {
        super("JButtons");
        setLayout(new FlowLayout());
        
        firstButton = new JButton("First Button");
        secondButton = new JButton("Second Button");
        
        add(firstButton);
        add(secondButton);
        
        //register a handler with the buttons
        ButtonHandler btnHandler = new ButtonHandler();
        firstButton.addActionListener(btnHandler);
        secondButton.addActionListener(btnHandler);
        
    }
    
    //private inner class as a handler
    private class ButtonHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent event)
        {
            JOptionPane.showMessageDialog(Buttons.this,String.format(
            "You pressed: %s", event.getActionCommand()));
        }
    }
           
}
