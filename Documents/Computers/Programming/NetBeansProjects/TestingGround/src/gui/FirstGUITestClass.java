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
public class FirstGUITestClass {
    public static void main(String[]args){
        FirstGUI gui = new FirstGUI();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(300, 800);
        gui.setVisible(true);
    }
}
