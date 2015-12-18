
package gui;

import javax.swing.JFrame;

/**
 *
 * @author Tony Persson
 */
public class FirstGuiTestClass 
{

    public static void main(String[] args)
    {
        /*
        FirstGui gui = new FirstGui();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(400,550);
        gui.setVisible(true);
                */
        
        //Textbox test
        TextFieldFrame gui = new TextFieldFrame();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.pack();
        gui.setVisible(true);
        
        Buttons btn = new Buttons();
        btn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        btn.pack();
        btn.setVisible(true);
                
        CheckBoxes ckbGui = new CheckBoxes();
        ckbGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ckbGui.pack();
        //ckbGui.setVisible(true);
        
    }

}
