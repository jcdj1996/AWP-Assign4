package gui;

import javax.swing.*;
import java.awt.*;
import java.util.*;

/**
 *
 * @author Ari
 */
public class FirstGUI extends JFrame {


    private final JLabel firstLabel;
    private final JLabel secondLabel;
    private final JLabel thridLabel;

    public FirstGUI() {
        super ("Ou First GUI");
        setLayout(new FlowLayout());
        firstLabel = new JLabel("Our First JLabel");
        firstLabel.setToolTipText("Tooltip for your Label");
        add(firstLabel);
        
        
        ImageIcon icon = new ImageIcon(getClass().getResource("images/Java_avatar.png"));
        secondLabel = new JLabel("Label with Icon", icon, SwingConstants.LEFT);
        secondLabel.setToolTipText("2nd label with an icon");
        add(secondLabel);
       
        
        thridLabel = new JLabel("Label with images and text below");
        thridLabel.setIcon(icon);
        thridLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        thridLabel.setVerticalTextPosition(SwingConstants.BOTTOM);
        thridLabel.setToolTipText("3rd Label with icon and text below");

        add(thridLabel);
    }

           

}
