package gui;

import employee.Employee;
import gui.EmployeeGUI.EmployeeLoader;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import org.javatuples.Pair;
import gui.MainGUI;

/**
 * Creates an interface for searching an employee and or product
 */
public class SearchGUI extends JPanel {
    
    final int TEXTFIELD_WIDTH   = 60,
            HEADER_POS        = SwingConstants.CENTER,
            LABEL_POS         = SwingConstants.LEFT,
            SCROLL_WIDTH      = 750,
            SCROLL_HEIGHT     = 400;
        
    GridBagConstraints c = new GridBagConstraints();
    GuiUtil gu = new GuiUtil(c);
    
    
    JLabel          fNameLabel          = new JLabel("Enter Employee Info");
    JTextField      searchText          = new JTextField(TEXTFIELD_WIDTH);
    JButton         viewButton          = new JButton("View");
    JButton         editButton          = new JButton("Edit");
    
    JComboBox       empList             = employee.Employee.getEmpoyeeList();
    EmployeeLoader  empLoader;
    JPanel resultPanel;
    GridBagConstraints rc = new GridBagConstraints();
    
    // search result labels
    JLabel empIDLbl = new JLabel(),
            empNameLbl = new JLabel(),
            empDOBLbl = new JLabel(),
            empGenderLbl = new JLabel(),
            empAddrLbl = new JLabel(),
            empAptLbl = new JLabel(),
            empCityLbl = new JLabel(),
            empPostalLbl = new JLabel(),
            empProvinceLbl = new JLabel(),
            empCountryLbl = new JLabel(),
            empPhoneLbl = new JLabel(),
            empEmailLbl = new JLabel(),
            empHireDateLbl = new JLabel(),
            empSalaryLbl = new JLabel(),
            empCommLbl = new JLabel(),
            empDeptLbl = new JLabel();
    
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
        this.add(new JLabel("Emplouee ID, Firstname, Lastname", SwingConstants.CENTER), c);
        c.gridwidth = 1;
        c.gridx = 0;
        c.gridy = 1;
        this.add(empList, c);
        searchText.addActionListener(SEARCHT_AL);
        c.gridx = 2;
        c.gridy = 1;
        this.add(viewButton, c);
        viewButton.addActionListener(SEARCHBTN_AL);
        c.gridx = 3;
        c.gridy = 1;
        this.add(editButton, c);
        editButton.addActionListener(EDITBTN_AL);
        
        c.gridwidth = 3;
        c.gridx = 0;
        c.gridy = 2;
        this.add(new JSeparator(),c);
        
        //----------------------------------------------------------------------
        // search results
        
        // set up the panel
        resultPanel = new JPanel();
        
        resultPanel.setLayout(new GridBagLayout());
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
        
        // dob
        rc.gridx = 2;
        rc.gridy = 0;
        resultPanel.add(new JLabel("Date of Birth", LABEL_POS), rc);
        
        // gender
        rc.gridx = 3;
        rc.gridy = 0;
        resultPanel.add(new JLabel("Gender", LABEL_POS), rc);
        
        // addr
        rc.gridx = 4;
        rc.gridy = 0;
        resultPanel.add(new JLabel("Street Address", LABEL_POS), rc);
        
        // apt
        rc.gridx = 5;
        rc.gridy = 0;
        resultPanel.add(new JLabel("Apt", LABEL_POS), rc);
        
        // City
        rc.gridx = 0;
        rc.gridy = 3;
        resultPanel.add(new JLabel("City", LABEL_POS), rc);
        
        // Postal
        rc.gridx = 1;
        rc.gridy = 3;
        resultPanel.add(new JLabel("Postal", LABEL_POS), rc);
        
        // Province
        rc.gridx = 2;
        rc.gridy = 3;
        resultPanel.add(new JLabel("Province", LABEL_POS), rc);
        
        // country
        rc.gridx = 3;
        rc.gridy = 3;
        resultPanel.add(new JLabel("Country", LABEL_POS), rc);
        
        // phone number
        rc.gridx = 4;
        rc.gridy = 3;
        resultPanel.add(new JLabel("Phone number", LABEL_POS), rc);
        
        // email
        rc.gridx = 5;
        rc.gridy = 3;
        resultPanel.add(new JLabel("Email", LABEL_POS), rc);
        
        // hire date
        rc.gridx = 0;
        rc.gridy = 6;
        resultPanel.add(new JLabel("Hire Date", LABEL_POS), rc);
        
        // Salary
        rc.gridx = 1;
        rc.gridy = 6;
        resultPanel.add(new JLabel("Salary", LABEL_POS), rc);
        
        // Commission
        rc.gridx = 2;
        rc.gridy = 6;
        resultPanel.add(new JLabel("Commission", LABEL_POS), rc);
        
        // Department
        rc.gridx = 3;
        rc.gridy = 6;
        resultPanel.add(new JLabel("Department", LABEL_POS), rc);
        
        
        
        // these holds the values of the employee
        // employee id
        rc.gridx = 0;
        rc.gridy =1;
        resultPanel.add(empIDLbl, rc);

        // employee name
        rc.gridx = 1;
        rc.gridy = 1;
        resultPanel.add(empNameLbl, rc);
        
        // dob
        rc.gridx = 2;
        rc.gridy = 1;
        resultPanel.add(empDOBLbl, rc);
        
        // gender
        rc.gridx = 3;
        rc.gridy = 1;
        resultPanel.add(empGenderLbl, rc);
        
        // addr
        rc.gridx = 4;
        rc.gridy = 1;
        resultPanel.add(empAddrLbl, rc);
        
        // apt
        rc.gridx = 5;
        rc.gridy = 1;
        resultPanel.add(empAptLbl, rc);
        
        // City
        rc.gridx = 0;
        rc.gridy = 4;
        resultPanel.add(empCityLbl, rc);
        
        // Postal
        rc.gridx = 1;
        rc.gridy = 4;
        resultPanel.add(empPostalLbl, rc);
        
        // Province
        rc.gridx = 2;
        rc.gridy = 4;
        resultPanel.add(empProvinceLbl, rc);
        
        // country
        rc.gridx = 3;
        rc.gridy = 4;
        resultPanel.add(empCountryLbl, rc);
        
        // phone number
        rc.gridx = 4;
        rc.gridy = 4;
        resultPanel.add(empPhoneLbl, rc);
        
        // email
        rc.gridx = 5;
        rc.gridy = 4;
        resultPanel.add(empEmailLbl, rc);
        
        // hire date
        rc.gridx = 0;
        rc.gridy = 7;
        resultPanel.add(empHireDateLbl, rc);
        
        // Salary
        rc.gridx = 1;
        rc.gridy = 7;
        resultPanel.add(empSalaryLbl, rc);
        
        // Commission
        rc.gridx = 2;
        rc.gridy = 7;
        resultPanel.add(empCommLbl, rc);
        
        // Department
        rc.gridx = 3;
        rc.gridy = 7;
        resultPanel.add(empDeptLbl, rc);
        
        
        
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
    public final ActionListener SEARCHT_AL = (ActionEvent ae) -> {
        System.out.println("An action occured on the search text field");
    };
    
    /**
     * Listens for actions on the search button
     */
    public final ActionListener SEARCHBTN_AL = (ActionEvent ae) -> {
        
        // load the employee details
        Pair<String, String> details = (Pair) empList.getSelectedItem();
        
        // try to load the requested employee
        Employee loadedEmp = empLoader.load(details.getValue0(), false);
        
        //empIDLbl.setText(loadedEmp.get
        empIDLbl.setText(loadedEmp.getEmpoyeeID());
        empNameLbl.setText(loadedEmp.getFirstName() + " " + loadedEmp.getLastName());
        empDOBLbl.setText(loadedEmp.getDateOfBirth());
        empGenderLbl.setText(loadedEmp.getGender());
        empAddrLbl.setText(loadedEmp.getAddress());
        empAptLbl.setText(loadedEmp.getApartmentNo());
        empCityLbl.setText(loadedEmp.getCity());
        empPostalLbl.setText(loadedEmp.getPostal());
        empProvinceLbl.setText(loadedEmp.getProvince());
        empCountryLbl.setText(loadedEmp.getCountry());
        empPhoneLbl.setText(loadedEmp.getPhone());
        empEmailLbl.setText(loadedEmp.getEmail());
        empHireDateLbl.setText(loadedEmp.getHireDate());
        empSalaryLbl.setText(loadedEmp.getSalaryAsString());
        empCommLbl.setText(loadedEmp.getCommAsString());
        empDeptLbl.setText(loadedEmp.getDepartment());
        
        
    };
    
    /**
     * Listens for actions on one of the view buttons
     */
    public final ActionListener EDITBTN_AL = (ActionEvent ae) -> {
        
        // load the employee details
        Pair<String, String> details = (Pair) empList.getSelectedItem();
        empLoader.load(details.getValue0(), true);
        MainGUI.setTab(MainGUI.HR_TAB);
    };
        
    /**
     * Sets the employee loader
     * 
     * @param loader The employee loader dependency
     */
    public void setEmpLoader(EmployeeLoader loader) {
        empLoader = loader;
    }
}
    