package gui;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Tony
 */
public class JMGreetingsPanel extends JPanel
{
    private final JLabel greeting;
    
    public JMGreetingsPanel()
    {
        greeting = new JLabel("Welcome to JavaMart");
        greeting.setFont(new Font("Arial", Font.BOLD,24));
        add(greeting);
        setBorder(BorderFactory.createRaisedBevelBorder());
    }
    
}
