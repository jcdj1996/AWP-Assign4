package gui;

import javax.swing.*;
import java.awt.*;
import java.util.*;

/**
 *
 * @author Marco Duarte
 */
public class GuiLab extends JFrame
{
    private final JLabel firstLabel;
    private final JLabel firstIcon;

    
    public GuiLab()
    {
        super("GUI Lab");
        
        setLayout(new FlowLayout());
        
        //first label
        firstLabel = new JLabel("JAVA");
        
        add(firstLabel);
        
        //first icon     
        firstIcon = new JLabel();
        //edit the font object
        firstIcon.setFont(new Font("Times New Roman", Font.BOLD, 20));  

    
        firstIcon.setText("I <3 Java");
        ImageIcon icon = new ImageIcon(getClass().getResource("images/java.png"));
        
        firstIcon.setIcon(icon);
        //set the posiotion
        firstIcon.setHorizontalTextPosition(SwingConstants.CENTER);
        firstIcon.setVerticalTextPosition(SwingConstants.BOTTOM);
        //set the tool tip
        firstIcon.setToolTipText("I <3 Java");
        
        add(firstIcon);
        
        //third label
        
        
    }
}
