package gui;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Marco Duarte
 */
public class FirstGui extends JFrame
{
    private final JLabel firstLabel;
    private final JLabel secondLabel;
    private final JLabel thirdLabel;
    
    public FirstGui()
    {
        super("Our First GUI");
        
        //start out with a fresh flow layout
        setLayout(new FlowLayout());
        
        //first label
        firstLabel = new JLabel("Our First JLabel");
        //add a tool tip
        firstLabel.setToolTipText("Tooltip for our label.");
        //add the label to the jframe
        add(firstLabel);
        
        //second label
        //create an icon  example
        ImageIcon icon = new ImageIcon(getClass().getResource("images/java.png"));
        //create second label with the icon and a swing constant location
        secondLabel = new JLabel("Label with icon", icon, SwingConstants.LEFT);
        //add a tool tip
        secondLabel.setToolTipText("Our second label with an icon");
        //add the label to the jframe
        add(secondLabel);
        
        //third label
        thirdLabel = new JLabel();
        thirdLabel.setText("Label with image and text below");
        thirdLabel.setIcon(icon);
        //set the posiotion
        thirdLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        thirdLabel.setVerticalTextPosition(SwingConstants.BOTTOM);
        //set the tool tip
        thirdLabel.setToolTipText("This is our label with icon and text below");
        
        add(thirdLabel);
        
    }
}
