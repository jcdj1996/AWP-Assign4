package gui;

import javax.swing.*;
import java.awt.*;
import java.util.*;

/**
 *
 * @author Ari
 */
public class SecondGUI extends JFrame {

    private final JLabel firstLabel;
    private final JLabel secondLabel;
    private final JLabel thridLabel;

    public SecondGUI() {
        super("GUI LAB");
        setLayout(new FlowLayout());
        
        ImageIcon icon = new ImageIcon(getClass().getResource("images/Java_avatar.png"));
        
        firstLabel = new JLabel("JAVA");
        firstLabel.setFont(new Font("Arial",Font.PLAIN,10));
        add(firstLabel);
        
        secondLabel = new JLabel(icon);
        secondLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        secondLabel.setVerticalTextPosition(SwingConstants.BOTTOM);
        add(secondLabel);
        
        thridLabel = new JLabel("I <3 Java");

        thridLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        thridLabel.setVerticalTextPosition(SwingConstants.BOTTOM);
        thridLabel.setFont(new Font("Arial",Font.BOLD,32));

        add(thridLabel);

    }
}
