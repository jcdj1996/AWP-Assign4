/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Ari
 */
public class Buttons extends JFrame {

    private final JButton firstButton, secondButton;

    public Buttons() {
        super("JButtons");
        setLayout(new FlowLayout());

        firstButton = new JButton("First Button");
        secondButton = new JButton("Second Button");

        add(firstButton);
        add(secondButton);
        //replace and handle with the butto  ns

        ButtonHandler bHandler = new ButtonHandler();
        firstButton.addActionListener(bHandler);
        secondButton.addActionListener(bHandler);
    }

    //private inner class
    private class ButtonHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            JOptionPane.showMessageDialog(Buttons.this, String.format(
                    "You passed %s",event.getActionCommand()));
        }
    }
}
