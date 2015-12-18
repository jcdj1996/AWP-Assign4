package gui;
import javax.swing.*;
import java.awt.*;
import java.util.*;

public class FirstGui extends JFrame
{
    private final JLabel firstLabel;
    private final JLabel secondLabel;
    private final JLabel thirdLabel;

    public FirstGui()
    {
        super("Our First GUI");
        setLayout(new FlowLayout());
        
        //first Label
        firstLabel = new JLabel("Our first JLabel!");
        firstLabel.setToolTipText("Tooltip for our label.");
        add(firstLabel);
        
        //second label
        ImageIcon icon = new ImageIcon(getClass().getResource("images/java.png"));
        secondLabel = new JLabel("Label with icon", icon,
                        SwingConstants.LEFT);
        secondLabel.setToolTipText("Our second label with an icon");
        add(secondLabel);
        
        //third label
        thirdLabel = new JLabel();
        thirdLabel.setText("Label with image and text below");
        thirdLabel.setIcon(icon);
        thirdLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        thirdLabel.setVerticalTextPosition(SwingConstants.BOTTOM);
        thirdLabel.setToolTipText("This is out label with icon and text below");
        add(thirdLabel);
    }

}