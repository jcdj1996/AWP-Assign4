package gui;

import javax.swing.JFrame;

/**
 *
 * @author The Raven
 */
public class FirstGuiTestClass 
{
    public static void main(String[] args)
    {
        /**
        //FirstGui gui = new FirstGui();
    //exit program on close
        //gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //gui.setSize(300,400);
    //make frame visible
        //gui.setVisible(true);
        GuiLab gui = new GuiLab();
        
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(300,400);
        
        gui.setVisible(true);
        */
        
        //Textbox Test
        TextFieldFrame gui = new TextFieldFrame();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.pack();
        gui.setVisible(true);
        
        Buttons btn = new Buttons();
        btn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        btn.pack();
        btn.setVisible(true);
    }
}
