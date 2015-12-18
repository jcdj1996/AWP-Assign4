package employee;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import util.GuiUtil;
import salesapp.MainGUI;

/**
 * Creates an interface for managing employees
 */
public class EmployeeGUI extends JPanel {

    Employee emp;
    final int TEXTFIELD_WIDTH = 20;
    final int HEADER_POS = SwingConstants.CENTER;
    final int LABEL_POS = SwingConstants.RIGHT;

    GridBagConstraints c = new GridBagConstraints();
    GuiUtil gu = new GuiUtil(c);

    // personal details
    JLabel personalHeader = new JLabel("Personal Information", HEADER_POS);
    JLabel fNameLabel = new JLabel("First Name", LABEL_POS);
    JTextField fNameText = new JTextField(TEXTFIELD_WIDTH);
    private final String FNAME_NAME = "firstName";
    JLabel lNameLabel = new JLabel("Last Name", LABEL_POS);
    JTextField lNameText = new JTextField(TEXTFIELD_WIDTH);
    private final String LNAME_NAME = "lastName";
    JLabel dobLabel = new JLabel("Date of Birth (yy/mm/dd)", LABEL_POS);
    JTextField dobText = new JTextField(TEXTFIELD_WIDTH);
    private final String DOB_NAME = "dob";
    JLabel genderLabel = new JLabel("Gender", LABEL_POS);
    JRadioButton maleRadioButton = new JRadioButton("Male");
    private final String MALE_NAME = "male";
    JRadioButton femaleRadioButton = new JRadioButton("Female");
    private final String FEMALE_NAME = "female";
    JRadioButton neutralRadioButton = new JRadioButton("Undisclosed");
    private final String NEUTRAL_NAME = "neutral";
    ButtonGroup bg = new ButtonGroup();

    // contact details
    JLabel contactHeader = new JLabel("Contact Information", HEADER_POS);
    JLabel phoneLabel = new JLabel("Phone Number", LABEL_POS);
    JTextField phoneText = new JTextField(TEXTFIELD_WIDTH);
    private final String PHONE_NAME = "phone";
    JLabel emailLabel = new JLabel("Email Address", LABEL_POS);
    JTextField emailText = new JTextField(TEXTFIELD_WIDTH);
    private final String EMAIL_NAME = "email";

    // address
    JLabel adressHeader = new JLabel("Address Information", HEADER_POS);
    JLabel addrLabel = new JLabel("Street Address", LABEL_POS);
    JTextField addrText = new JTextField(TEXTFIELD_WIDTH);
    private final String ADDR_NAME = "addr";
    JLabel aptLabel = new JLabel("Aptartment", LABEL_POS);
    JTextField aptText = new JTextField(TEXTFIELD_WIDTH);
    private final String APT_NAME = "apt";
    JLabel cityLabel = new JLabel("City", LABEL_POS);
    JTextField cityText = new JTextField(TEXTFIELD_WIDTH);
    private final String CITY_NAME = "city";
    JLabel postalLabel = new JLabel("Postal", LABEL_POS);
    JTextField postalText = new JTextField(TEXTFIELD_WIDTH);
    private final String POSTAL_NAME = "postal";
    JLabel provinceLabel = new JLabel("Province", LABEL_POS);
    JTextField provinceText = new JTextField(TEXTFIELD_WIDTH);
    private final String PROVINCE_NAME = "province";
    JLabel countryLabel = new JLabel("Country", LABEL_POS);
    JTextField countryText = new JTextField(TEXTFIELD_WIDTH);
    private final String COUNTRY_NAME = "country";

    // employee information
    JLabel employeeHeader = new JLabel("Employee Information", HEADER_POS);
    JLabel hireDateLabel = new JLabel("Hire Date", LABEL_POS);
    JTextField hireDateText = new JTextField(TEXTFIELD_WIDTH);
    private final String HIRE_DATE_NAME = "hiredate";
    JLabel payTypeLabel = new JLabel("Pay Type", LABEL_POS);
    JComboBox payTypeComboBox = new JComboBox(new String[]{"Salaried", "Commissioned"});
    private final String PAY_TYPE_NAME = "payType";
    JLabel salaryLabel = new JLabel("Hourly Salary", LABEL_POS);
    JTextField salaryText = new JTextField(TEXTFIELD_WIDTH);
    private final String SALARY_NAME = "salary";
    JLabel commLabel = new JLabel("Commission", LABEL_POS);
    JTextField commText = new JTextField(TEXTFIELD_WIDTH);
    private final String COMM_NAME = "comm";
    JLabel positionLabel = new JLabel("Position", LABEL_POS);
    JTextField positionText = new JTextField(TEXTFIELD_WIDTH);
    private final String POSITION_NAME = "pos";
    JLabel deptLabel = new JLabel("Department", LABEL_POS);
    JComboBox deptBox = new JComboBox(new String[]{"Hardware", "Software", "Services",});
    private final String DEPT_NAME = "dept";

    // employee controls
    String SAVE_BTN_TEXT = "Update Employee";
    String NEW_BTN_TEXT = "Create Employee";
    JLabel controlHeader = new JLabel("Employee Controls", HEADER_POS);
    JCheckBox newEmp = new JCheckBox("New Employee");
    private final String NEWEMPCHECK_NAME = "newEmp";
    JButton saveButton = new JButton(SAVE_BTN_TEXT);
    private final String SAVEBTN_NAME = "save";
    JButton clearButton = new JButton("Clear Form");
    private final String CLEARBTN_NAME = "clear";
    JButton findButton = new JButton("Find Employee");
    private final String FINDBTN_NAME = "find";

    public EmployeeGUI() {

        setLayout(new GridBagLayout());

        // set the names of each component
        fNameText.setName(FNAME_NAME);
        lNameText.setName(LNAME_NAME);
        dobText.setName(DOB_NAME);
        maleRadioButton.setName(MALE_NAME);
        femaleRadioButton.setName(FEMALE_NAME);
        neutralRadioButton.setName(NEUTRAL_NAME);
        addrText.setName(ADDR_NAME);
        aptText.setName(APT_NAME);
        cityText.setName(CITY_NAME);
        postalText.setName(POSTAL_NAME);
        provinceText.setName(PROVINCE_NAME);
        countryText.setName(COUNTRY_NAME);
        phoneText.setName(PHONE_NAME);
        emailText.setName(EMAIL_NAME);
        hireDateText.setName(HIRE_DATE_NAME);
        payTypeComboBox.setName(PAY_TYPE_NAME);
        salaryText.setName(SALARY_NAME);
        commText.setName(COMM_NAME);
        positionText.setName(POSITION_NAME);
        deptBox.setName(DEPT_NAME);
        newEmp.setName(NEWEMPCHECK_NAME);
        saveButton.setName(SAVEBTN_NAME);
        clearButton.setName(CLEARBTN_NAME);
        findButton.setName(FINDBTN_NAME);

        //----------------------------------------------------------------------
        // personal info header                
        gu.addHeader(this, c, personalHeader);
        gu.addComponent(this, c, fNameLabel, fNameText);
        fNameText.addActionListener(LISTENER);

        // first name
        gu.addComponent(this, c, lNameLabel, lNameText);
        lNameText.addActionListener(LISTENER);

        // last name
        gu.addComponent(this, c, dobLabel, dobText);
        dobText.addActionListener(LISTENER);

        // gender radio buttons
        maleRadioButton.addActionListener(LISTENER);
        femaleRadioButton.addActionListener(LISTENER);
        neutralRadioButton.addActionListener(LISTENER);
        bg.add(maleRadioButton);
        bg.add(femaleRadioButton);
        bg.add(neutralRadioButton);
        gu.addComponent(this, c, genderLabel, maleRadioButton, femaleRadioButton, neutralRadioButton);

        //----------------------------------------------------------------------
        // address header                
        gu.addHeader(this, c, adressHeader);

        gu.addComponent(this, c, addrLabel, addrText);
        addrText.addActionListener(LISTENER);

        gu.addComponent(this, c, aptLabel, aptText);
        aptText.addActionListener(LISTENER);

        gu.addComponent(this, c, cityLabel, cityText);
        cityText.addActionListener(LISTENER);

        gu.addComponent(this, c, postalLabel, postalText);
        postalText.addActionListener(LISTENER);

        gu.addComponent(this, c, provinceLabel, provinceText);
        provinceText.addActionListener(LISTENER);

        gu.addComponent(this, c, countryLabel, countryText);
        countryText.addActionListener(LISTENER);

        //----------------------------------------------------------------------
        // second column
        gu.addSecondColumn(this, c);

        //----------------------------------------------------------------------
        // contact details header                
        gu.addHeader(this, c, contactHeader);

        // phone number
        gu.addComponent(this, c, phoneLabel, phoneText);
        phoneText.addActionListener(LISTENER);

        // email address
        gu.addComponent(this, c, emailLabel, emailText);
        emailText.addActionListener(LISTENER);

        //----------------------------------------------------------------------
        // employee info header                
        gu.addHeader(this, c, employeeHeader);

        // hire date
        gu.addComponent(this, c, hireDateLabel, hireDateText);
        hireDateText.addActionListener(LISTENER);

        // pay type
        gu.addComponent(this, c, payTypeLabel, payTypeComboBox);
        payTypeComboBox.addActionListener(LISTENER);

        // salary
        gu.addComponent(this, c, salaryLabel, salaryText);
        salaryText.addActionListener(LISTENER);

        // commission
        gu.addComponent(this, c, commLabel, commText);
        commText.addActionListener(LISTENER);

        // position
        gu.addComponent(this, c, positionLabel, positionText);
        positionText.addActionListener(LISTENER);

        // department
        gu.addComponent(this, c, deptLabel, deptBox);
        deptBox.addActionListener(LISTENER);

        //----------------------------------------------------------------------
        // control header
        gu.addHeader(this, c, controlHeader);

        // buttons
        gu.addComponent(this, c, newEmp, saveButton, clearButton, findButton);
        newEmp.addActionListener(LISTENER);
        saveButton.addActionListener(LISTENER);
        clearButton.addActionListener(LISTENER);
        findButton.addActionListener(LISTENER);

        // Create a new employee to work with until one is loaded from the search
        emp = new Employee();

    }

    /**
     * Dispatches form events to the appropriate methods
     */
    public final ActionListener LISTENER = (ActionEvent ae) -> {

        // try to call the appropriatae set method
        try {

            switch (((JComponent) ae.getSource()).getName()) {
                case FNAME_NAME:
                    emp.setfName(fNameText.getText());
                    break;
                case LNAME_NAME:
                    emp.setlName(lNameText.getText());
                    break;
                case DOB_NAME:
                    emp.setDob(dobText.getText());
                    break;
                case MALE_NAME:
                    emp.setGender("male");
                    break;
                case FEMALE_NAME:
                    emp.setGender("female");
                    break;
                case NEUTRAL_NAME:
                    emp.setGender("neutral");
                    break;
                case ADDR_NAME:
                    emp.setAddr(addrText.getText());
                    break;
                case APT_NAME:
                    emp.setApt(aptText.getText());
                    break;
                case CITY_NAME:
                    emp.setCity(cityText.getText());
                    break;
                case POSTAL_NAME:
                    emp.setPostal(postalLabel.getText());
                    break;
                case PROVINCE_NAME:
                    emp.setProvince(provinceText.getText());
                    break;
                case COUNTRY_NAME:
                    emp.setCountry(countryText.getText());
                    break;
                case PHONE_NAME:
                    emp.setPhone(phoneText.getText());
                    break;
                case EMAIL_NAME:
                    emp.setEmail(emailText.getText());
                    break;
                case HIRE_DATE_NAME:
                    emp.setHireDate(hireDateText.getText());
                    break;
                case PAY_TYPE_NAME:
                    emp.setPayType(payTypeComboBox.getSelectedItem().toString());
                    break;
                case SALARY_NAME:
                    emp.setSalary(salaryText.getText());
                    break;
                case COMM_NAME:
                    emp.setComm(commText.getText());
                    break;
                case POSITION_NAME:
                    emp.setPosition(positionText.getText());
                    break;
                case DEPT_NAME:
                    emp.setDepartment(deptBox.getSelectedItem().toString());
                    break;
                case NEWEMPCHECK_NAME:
                    if (newEmp.isSelected()) {
                        saveButton.setText(NEW_BTN_TEXT);
                    } else {
                        saveButton.setText(SAVE_BTN_TEXT);
                    }
                    break;
                case SAVEBTN_NAME:
                    System.out.println("saving employee");
                    break;
                case CLEARBTN_NAME:
                    clearForm();
                    break;
                case FINDBTN_NAME:
                    MainGUI.setTab(MainGUI.SEARCH_TAB);
                    break;

            }

            // show an error and set the focus to the component
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            ((JComponent) ae.getSource()).requestFocus();
        }

    };

    /**
     * Clears the form fields and creates a new employee object
     */
    private void clearForm() {

        // destroy the employee (muahaha)
        emp = new Employee();

        // reset personal info
        fNameText.setText("");
        lNameText.setText("");
        dobText.setText("");
        maleRadioButton.setSelected(false);
        femaleRadioButton.setSelected(false);
        neutralRadioButton.setSelected(true);

        // address
        addrText.setText("");
        aptText.setText("");
        cityText.setText("");
        postalText.setText("");
        provinceText.setText("");
        countryText.setText("");

        // contact info
        phoneText.setText("");
        emailText.setText("");

        // employee info
        hireDateText.setText("");
        payTypeComboBox.setSelectedIndex(0);
        salaryText.setText("");
        commText.setText("");
        positionText.setText("");
        deptBox.setSelectedIndex(0);
        newEmp.setSelected(true);
    }

    /**
     * Saves the employees details to the database
     */
    public final void save() {
        emp.saveEmployee();
    }

    /**
     * Loads an employees details into the form
     *
     * @param e The employee
     */
    public void loadEmployee(Employee e) {

        emp = e;

        // personal info
        fNameText.setText(e.getfName());
        lNameText.setText(e.getlName());
        dobText.setText(e.getDob());
        if (e.getGender().equalsIgnoreCase("male")) {
            maleRadioButton.setSelected(true);
            femaleRadioButton.setSelected(false);
            neutralRadioButton.setSelected(false);
        } else if (e.getGender().equalsIgnoreCase("female")) {
            maleRadioButton.setSelected(false);
            femaleRadioButton.setSelected(true);
            neutralRadioButton.setSelected(false);
        } else if (e.getGender().equalsIgnoreCase("neutral")) {
            maleRadioButton.setSelected(false);
            femaleRadioButton.setSelected(false);
            neutralRadioButton.setSelected(true);
        }

        // address
        addrText.setText(e.getAddr());
        aptText.setText(e.getApt());
        cityText.setText(e.getCity());
        postalText.setText(e.getPostal());
        provinceText.setText(e.getProvince());
        countryText.setText(e.getCountry());

        // contact
        phoneText.setText(e.getPhone());
        emailText.setText(e.getEmail());

        // employee info
        hireDateText.setText(e.getHireDate());
        payTypeComboBox.setSelectedItem(e.getPayType());
        salaryText.setText(e.getSalaryAsString());
        commText.setText(e.getCommAsString());
        positionText.setText(e.getPosition());
        deptBox.setSelectedItem(e.getDepartment());

    }
}
