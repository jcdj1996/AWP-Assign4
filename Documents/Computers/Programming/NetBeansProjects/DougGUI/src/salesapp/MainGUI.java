package salesapp;

import employee.EmployeeGUI;
import product.ProductGUI;
import search.SearchGUI;
import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;
import javax.swing.*;
import util.DB;

/**
 * The main GUI of the application
 * 
 * This GUI holds the other components of the application
 */
public class MainGUI extends JFrame {
    
    public static final int HR_TAB      = 0;
    public static final int PRODUCT_TAB = 1;
    public static final int SEARCH_TAB  = 2;
    private static JTabbedPane appTabs = new JTabbedPane();
        
    /**
     * Sets up the main application gui and supporting infrastructure
     */
    public MainGUI() {
        super("Main GUI");
        
        // establish database connection
//        try {
//            DB.INSTANCE.connect();
//        } catch (SQLException ex) {
//            System.out.println("A connection to the database could not be established. Exiting program.");
//            System.out.println("Error Message " + ex.getMessage());
//            System.exit(-1);
//        }
        
        // set properties of main GUI
        setLayout(new BorderLayout());
        
        // create main frame components
        JLabel greetingLabel = new JLabel("Welcome to Java Mart", SwingConstants.CENTER);
        JButton exitButton = new JButton("Exit");
        
        // set attributes of main gui and components
        this.getContentPane().setBackground(Color.decode("#1c1c1c"));
        greetingLabel.setForeground(Color.decode("#c2c2c2"));
        exitButton.setBackground( Color.decode("#d95250"));
        exitButton.setForeground(Color.decode("#cfcfcf"));
        
        // Gather the app GUI components
        EmployeeGUI eg = new EmployeeGUI();
        ProductGUI pg = new ProductGUI();
        SearchGUI sg = new SearchGUI();
        
        // Add components to tabbed pane
        appTabs.add("HR", eg);
        appTabs.add("Product", pg);
        appTabs.add("Search", sg);
        
        // Add event listener
        exitButton.addActionListener(new MainGUIHandler());
        
        // Add the major sections to the main GUI
        this.add(greetingLabel, BorderLayout.NORTH);
        this.add(exitButton, BorderLayout.SOUTH);
        this.add(appTabs, BorderLayout.CENTER);
        
        // Prepare and show main gui
        this.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
        //this.setPreferredSize(new Dimension(800,400));
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        
    }
    
    /**
     * Exits the application when the exit button is pressed
     */
    private class MainGUIHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {           
            System.exit(0);
        }
        
    }
    
    public static void setTab(int tab) {
        appTabs.setSelectedIndex(tab);
    }
}
