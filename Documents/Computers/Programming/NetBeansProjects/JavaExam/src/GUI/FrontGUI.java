package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * @author Aristotle Rovithis 200209726
 */
public class FrontGUI extends JFrame {

    //create all the required components and variables
    private JPanel high, southPanel;
    private PizzaCrustPanel crust;
    private PizzaToppingsPanel toppings;
    private JButton exitButton, calculateButton;
    private JCheckBox addTaxCheckBox;
    private JTextField costTextField;
    private JLabel costLabel;

    private double pizzaCost = 0.0;

    //constructor
    public FrontGUI() {
        //set title, close operation and the required layout
        super("Order Calculator");
        setLayout(new BorderLayout());

        //create panels
        crust = new PizzaCrustPanel();
        toppings = new PizzaToppingsPanel();
        high = new PizzaHouseGreetingsPanel();

        add(high, BorderLayout.NORTH);
        add(crust, BorderLayout.WEST);
        add(toppings, BorderLayout.EAST);

        //call a method to build the bottom panel
        //that contains all the required components
        buildButtonPanel();
        add(southPanel, BorderLayout.SOUTH);

    }

    //enable a way to build the bottom panel and all the required components
    //ensure to add all required event listeners. Event listeners can either 
    //be inner, private classes OR anonymous classes. 
    private void buildButtonPanel() {
        southPanel = new JPanel();
        costLabel = new JLabel("Total:");
        costTextField = new JTextField(7);
        addTaxCheckBox = new JCheckBox("Add Tax");
        calculateButton = new JButton("Calculate");
        exitButton = new JButton("Exit");

        southPanel.add(costLabel);
        southPanel.add(costTextField);
        southPanel.add(addTaxCheckBox);
        southPanel.add(calculateButton);
        southPanel.add(exitButton);
        addTaxCheckBox.addActionListener(new AddTaxCheckBoxButtonHandler());
        calculateButton.addActionListener(new CalculateButtonHandler());
        exitButton.addActionListener(new ExitButtonHandler());
    }

    private class ExitButtonHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            System.exit(0);
        }
    }

    private class CalculateButtonHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            pizzaCost = (crust.getCost() + toppings.getCost())
                    * (addTaxCheckBox.isSelected() ? 1.13 : 1);
            costTextField.setText(String.format("$%.2f", pizzaCost));

        }
    }

    private class AddTaxCheckBoxButtonHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            pizzaCost *= (addTaxCheckBox.isSelected()) ? 1.13 : 1 / 1.13;
            costTextField.setText(String.format("$%.2f", pizzaCost));
        }
    }

    public static void main(String[] args) {
        FrontGUI gui = new FrontGUI();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.pack();
        gui.setVisible(true);
    }
}
