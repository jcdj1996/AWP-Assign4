package GUI;

import javax.swing.*;
import java.awt.*;

/**
 * @author Aristotle Rovithis 200209726
 */
public class PizzaToppingsPanel extends JPanel {

    private final double 
            EXTRA_CHEESE = 2.00, 
            GREEN_OLIVES = 2.00,
            PEPPERONI = 1.50, 
            HAM = 1.50;

    private double cost = 0;

    private JCheckBox extraCheese, greenOlives, pepperoni, ham;

    public PizzaToppingsPanel() {

        //set an appropriate layout
        setLayout(new GridLayout(4, 1));
        //initialize the components
        extraCheese = new JCheckBox("Extra Cheese");
        greenOlives = new JCheckBox("Green Olives");
        pepperoni = new JCheckBox("Pepperoni");
        ham = new JCheckBox("Ham");

        add(extraCheese);
        add(greenOlives);
        add(pepperoni);
        add(ham);

        //create a border
        setBorder(BorderFactory.createTitledBorder("Toppings"));
    }//end of main

    public double getCost() {
        return (extraCheese.isSelected() ? EXTRA_CHEESE : 0)
                + (greenOlives.isSelected() ? GREEN_OLIVES : 0)
                + (pepperoni.isSelected() ? PEPPERONI : 0)
                + (ham.isSelected() ? HAM : 0);
    }
}
