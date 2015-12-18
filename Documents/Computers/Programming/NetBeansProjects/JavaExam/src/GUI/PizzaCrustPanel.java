package GUI;

import javax.swing.*;
import java.awt.*;

/**
 * @author Aristotle Rovithis 200209726
 */
public class PizzaCrustPanel extends JPanel {

    private double cost = 0;

    private final double WHITE_CRUST = 4.00;
    private final double WHEAT_CRUST = 5.50;

    private JRadioButton whiteCrust, wheatCrust;
    private ButtonGroup buttonGroup;

    //constructor
    public PizzaCrustPanel() {
        //set an appropriate layout
        setLayout(new GridLayout(2, 1));
        //initliaize the required components
        whiteCrust = new JRadioButton("White Crust");
        wheatCrust = new JRadioButton("Wheat Crust");
        buttonGroup = new ButtonGroup();
        buttonGroup.add(whiteCrust);
        buttonGroup.add(wheatCrust);

        add(whiteCrust);
        add(wheatCrust);
        //create a border
        setBorder(BorderFactory.createTitledBorder("Crust"));

    }

    public double getCost() {
        return (whiteCrust.isSelected()
                ? this.WHITE_CRUST
                : (wheatCrust.isSelected()
                        ? this.WHEAT_CRUST
                        : 0));
    }
}
