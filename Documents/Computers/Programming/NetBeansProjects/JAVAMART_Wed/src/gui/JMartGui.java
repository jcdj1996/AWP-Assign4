package gui;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Tony
 */
public class JMartGui extends JFrame
{
    private JPanel centerPanel, northPanel, southPanel;
    private JButton exitButton;
    
    public JMartGui()
    {
        super("JMart");
        setLayout(new BorderLayout());
        
        //create the tab container
        JTabbedPane tabPane = new JTabbedPane();
        
        //tab one
        JLabel lblPanelOne = new JLabel("",SwingConstants.CENTER);
        JPanel hrPanel = new JMHRPanel();
        hrPanel.add(lblPanelOne);
        tabPane.addTab("HR Tab",null,hrPanel,"First Panel");
        
        //second tab 
        JLabel lblPanelTwo = new JLabel("Sales",SwingConstants.CENTER);
        JPanel salesPanel = new JPanel();
        salesPanel.add(lblPanelTwo);
        tabPane.addTab("Sales Tab",null,salesPanel,"Second Panel");
        
        //build the panels
        northPanel = new JMGreetingsPanel();
        buildButtonPanel();
        
        add(northPanel, BorderLayout.NORTH);
        add(tabPane, BorderLayout.CENTER);
        add(southPanel, BorderLayout.SOUTH);
        
        
        
        
    }//end of constructor
    
    private void buildButtonPanel()
    {
        southPanel = new JPanel();
        exitButton = new JButton("Exit");
        exitButton.addActionListener(new ExitButtonHandler());
        
        southPanel.add(exitButton);
    }
    
    private class ExitButtonHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            System.exit(0);
        }
    }
    //main method
    public static void main(String[] args)
    {
        JMartGui gui = new JMartGui();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.pack();
        gui.setVisible(true);
    }
}
