/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.JFrame;

/**
 *
 * @author Ari
 */
public class SecondGUITester {
    public static void main(String[]args){
        SecondGUI gui = new SecondGUI();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(300, 500);
        gui.setVisible(true);
    }
}
