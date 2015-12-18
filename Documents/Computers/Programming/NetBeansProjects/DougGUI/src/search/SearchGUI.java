package search;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import util.GuiUtil;

/**
 * Creates an interface for searching an employee and or product
 */
public class SearchGUI extends JPanel {
    
    final int TEXTFIELD_WIDTH   = 60;
    final int HEADER_POS        = SwingConstants.CENTER;
    final int LABEL_POS         = SwingConstants.CENTER;
    final int SCROLL_WIDTH      = 750;
    final int SCROLL_HEIGHT     = 400;
    
    GridBagConstraints c = new GridBagConstraints();
    GuiUtil gu = new GuiUtil(c);
    
    
    JLabel          fNameLabel          = new JLabel("Enter Employee Info");
    JTextField      searchText          = new JTextField(TEXTFIELD_WIDTH);
    JButton         searchButton        = new JButton("Search");
    
    
    public SearchGUI() {
        
        setLayout(new GridBagLayout());

        GridBagConstraints c = new GridBagConstraints();
        GuiUtil gu = new GuiUtil(c);
        
        // set constraints
        c.insets = new Insets(7, 7, 7, 7);          // external padding
        c.ipadx = 5;                                // internal padding
        c.ipady = 5;                                // internal padding
        c.fill = GridBagConstraints.HORIZONTAL;     // components fill horizontal space
        
        //----------------------------------------------------------------------
        // search box
        c.gridwidth = 3;
        c.gridx = 0;
        c.gridy = 0;
        this.add(new JLabel("Enter any Employee Info", SwingConstants.CENTER), c);
        c.gridwidth = 1;
        c.gridx = 0;
        c.gridy = 1;
        this.add(searchText, c);
        searchText.addActionListener(SEARCHT_AL);
        c.gridx = 2;
        c.gridy = 1;
        this.add(searchButton, c);
        searchButton.addActionListener(SEARCHB_AL);
        
        c.gridwidth = 3;
        c.gridx = 0;
        c.gridy = 2;
        this.add(new JSeparator(),c);
        
        //----------------------------------------------------------------------
        // search results
        
        // set up the panel
        JPanel resultPanel = new JPanel();
        resultPanel.setLayout(new GridBagLayout());
        GridBagConstraints rc = new GridBagConstraints();
        rc.insets = new Insets(7, 7, 7, 7);          // external padding
        rc.ipadx = 5;                                // internal padding
        rc.ipady = 5;                                // internal padding
        rc.fill = GridBagConstraints.HORIZONTAL;     // components fill horizontal space
        
        // create the header
        // employee id
        rc.gridx = 0;
        rc.gridy =0;
        resultPanel.add(new JLabel("Employee ID", LABEL_POS), rc);

        // employee name
        rc.gridx = 1;
        rc.gridy = 0;
        resultPanel.add(new JLabel("Name", LABEL_POS), rc);

        // phone number
        rc.gridx = 2;
        rc.gridy = 0;
        resultPanel.add(new JLabel("Phone number", LABEL_POS), rc);

        // email address
        rc.gridx = 3;
        rc.gridy = 0;
        resultPanel.add(new JLabel("Email Address", LABEL_POS), rc);

        // position
        rc.gridx = 4;
        rc.gridy = 0;
        resultPanel.add(new JLabel("Position", LABEL_POS), rc);

        // dept
        rc.gridx = 5;
        rc.gridy = 0;
        resultPanel.add(new JLabel("Department", LABEL_POS), rc);

        // view employee
        rc.gridx = 6;
        rc.gridy = 0;
        resultPanel.add(new JLabel("View", LABEL_POS), rc);
                
        // separator
        rc.gridx = 0;
        rc.gridy = 1;
        rc.gridwidth = 7;
        resultPanel.add(new JSeparator(), rc);
        rc.gridwidth = 1;
        
        // add the results
        for (int i = 2; i < 20; i++) {
            
            // employee id
            rc.gridx = 0;
            rc.gridy = i;
            resultPanel.add(new JLabel("Emp ID " + i), rc);
            
            // employee name
            rc.gridx = 1;
            rc.gridy = i;
            resultPanel.add(new JLabel("Emp Name " + i), rc);
            
            // phone number
            rc.gridx = 2;
            rc.gridy = i;
            resultPanel.add(new JLabel("Phone number " + i), rc);
            
            // email address
            rc.gridx = 3;
            rc.gridy = i;
            resultPanel.add(new JLabel("email address " + i), rc);
            
            // position
            rc.gridx = 4;
            rc.gridy = i;
            resultPanel.add(new JLabel("position " + i), rc);
            
            // dept
            rc.gridx = 5;
            rc.gridy = i;
            resultPanel.add(new JLabel("department " + i), rc);
            
            // view employee
            rc.gridx = 6;
            rc.gridy = i;
            JButton viewButton = new JButton("test");
            viewButton.setName("employeeID " + i);
            viewButton.addActionListener(VIEW_AL);
            resultPanel.add(viewButton, rc);
        }
        
        JScrollPane scrollpane = new JScrollPane(resultPanel);
        scrollpane.setPreferredSize(new Dimension(SCROLL_WIDTH, SCROLL_HEIGHT));
        scrollpane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollpane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        c.gridx = 0;
        c.gridy = 4;
        c.gridwidth = 7;
        this.add(scrollpane,c);
        
    }
    
    /**
     * Listens for actions on the search text field
     */
    public static final ActionListener SEARCHT_AL = (ActionEvent ae) -> {
        System.out.println("An action occured on the search text field");
    };
    
    /**
     * Listens for actions on the search button
     */
    public static final ActionListener SEARCHB_AL = (ActionEvent ae) -> {
        System.out.println("An action occured on the search button");
    };
    
    /**
     * Listens for actions on one of the view buttons
     */
    public static final ActionListener VIEW_AL = (ActionEvent ae) -> {
        System.out.println(((JButton) ae.getSource()).getName());
    };
    
}
