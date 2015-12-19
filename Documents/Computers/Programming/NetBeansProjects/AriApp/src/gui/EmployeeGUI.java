package gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import util.Validation;

import AristotleToolBox.EntityInformation;
import employee.Employee;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;
import javax.swing.border.LineBorder;
import util.DB;

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

    Validation v = new Validation();
    DB db = new DB();

    //labels
    JLabel personalHeader = new JLabel("Personal Information", HEADER_POS),
            fNameLabel = new JLabel("First Name", LABEL_POS),
            lNameLabel = new JLabel("Last Name", LABEL_POS),
            dobLabel = new JLabel("Date of Birth (yy/mm/dd)", LABEL_POS),
            genderLabel = new JLabel("Gender", LABEL_POS),
            contactHeader = new JLabel("Contact Information", HEADER_POS),
            phoneLabel = new JLabel("Phone Number", LABEL_POS),
            emailLabel = new JLabel("Email Address", LABEL_POS),
            adressHeader = new JLabel("Address Information", HEADER_POS),
            addrLabel = new JLabel("Street Address", LABEL_POS),
            aptLabel = new JLabel("Aptartment", LABEL_POS),
            cityLabel = new JLabel("City", LABEL_POS),
            postalLabel = new JLabel("Postal", LABEL_POS),
            provinceLabel = new JLabel("Province", LABEL_POS),
            countryLabel = new JLabel("Country", LABEL_POS),
            employeeHeader = new JLabel("Employee Information", HEADER_POS),
            hireDateLabel = new JLabel("Hire Date", LABEL_POS),
            salaryLabel = new JLabel("Hourly Salary", LABEL_POS),
            commLabel = new JLabel("Commission", LABEL_POS),
            deptLabel = new JLabel("Department", LABEL_POS),
            controlHeader = new JLabel("Employee Controls", HEADER_POS);

    JTextField fNameText = new JTextField(TEXTFIELD_WIDTH),
            lNameText = new JTextField(TEXTFIELD_WIDTH),
            dobText = new JTextField(TEXTFIELD_WIDTH),
            phoneText = new JTextField(TEXTFIELD_WIDTH),
            emailText = new JTextField(TEXTFIELD_WIDTH),
            addrText = new JTextField(TEXTFIELD_WIDTH),
            aptText = new JTextField(TEXTFIELD_WIDTH),
            cityText = new JTextField(TEXTFIELD_WIDTH),
            postalText = new JTextField(TEXTFIELD_WIDTH),
            countryText = new JTextField(TEXTFIELD_WIDTH),
            hireDateText = new JTextField(TEXTFIELD_WIDTH),
            salaryText = new JTextField(TEXTFIELD_WIDTH),
            commText = new JTextField(TEXTFIELD_WIDTH);

    JRadioButton maleRadioButton = new JRadioButton("Male"),
            femaleRadioButton = new JRadioButton("Female"),
            neutralRadioButton = new JRadioButton("Undisclosed");
    ButtonGroup bg = new ButtonGroup();

    JComboBox provinceBox = new JComboBox(EntityInformation.PROVINCES_LONG),
            deptBox = new JComboBox(new String[]{"Hardware", "Software", "Services",});

    // employee controls

    String SAVE_BTN_TEXT = "Update Employee",
            NEW_BTN_TEXT = "Create Employee";

    JCheckBox newEmp = new JCheckBox("New Employee");

    private final String NEWEMPCHECK_NAME = "newEmp";

    JButton saveButton = new JButton(SAVE_BTN_TEXT),
            clearButton = new JButton("Clear Form"),
            findButton = new JButton("Find Employee");

    private final String SAVEBTN_NAME = "save",
            CLEARBTN_NAME = "clear",
            FINDBTN_NAME = "find";

    public EmployeeGUI() {

        setLayout(new GridBagLayout());

        // set the names of each component
        fNameText.setName(Employee.FNAME_NAME);
        lNameText.setName(Employee.LNAME_NAME);
        dobText.setName(Employee.DOB_NAME);
        maleRadioButton.setName(Employee.MALE_NAME);
        femaleRadioButton.setName(Employee.FEMALE_NAME);
        neutralRadioButton.setName(Employee.NEUTRAL_NAME);
        addrText.setName(Employee.ADDR_NAME);
        aptText.setName(Employee.APT_NAME);
        cityText.setName(Employee.CITY_NAME);
        postalText.setName(Employee.POSTAL_NAME);
        provinceBox.setName(Employee.PROVINCE_NAME);
        countryText.setName(Employee.COUNTRY_NAME);
        phoneText.setName(Employee.PHONE_NAME);
        emailText.setName(Employee.EMAIL_NAME);
        hireDateText.setName(Employee.HIRE_NAME);
        salaryText.setName(Employee.SALARY_NAME);
        commText.setName(Employee.COMM_NAME);
        deptBox.setName(Employee.DEPT_NAME);
        newEmp.setName(NEWEMPCHECK_NAME);
        saveButton.setName(SAVEBTN_NAME);
        clearButton.setName(CLEARBTN_NAME);
        findButton.setName(FINDBTN_NAME);

        FocusHandler focusHandler = new FocusHandler();

        //----------------------------------------------------------------------
        // personal info header                
        gu.addHeader(this, c, personalHeader);
        gu.addComponent(this, c, fNameLabel, fNameText);
        fNameText.addFocusListener(focusHandler);

        // first name
        gu.addComponent(this, c, lNameLabel, lNameText);
        lNameText.addFocusListener(focusHandler);

        // last name
        gu.addComponent(this, c, dobLabel, dobText);
        dobText.addFocusListener(focusHandler);

        // gender radio buttons
        bg.add(maleRadioButton);
        bg.add(femaleRadioButton);
        bg.add(neutralRadioButton);
        gu.addComponent(this, c, genderLabel, maleRadioButton, femaleRadioButton, neutralRadioButton);

        //----------------------------------------------------------------------
        // address header                
        gu.addHeader(this, c, adressHeader);

        gu.addComponent(this, c, addrLabel, addrText);
        addrText.addFocusListener(focusHandler);

        gu.addComponent(this, c, aptLabel, aptText);
        aptText.addFocusListener(focusHandler);

        gu.addComponent(this, c, cityLabel, cityText);
        cityText.addFocusListener(focusHandler);

        gu.addComponent(this, c, postalLabel, postalText);
        postalText.addFocusListener(focusHandler);

        gu.addComponent(this, c, provinceLabel, provinceBox);

        gu.addComponent(this, c, countryLabel, countryText);
        countryText.addFocusListener(focusHandler);

        //----------------------------------------------------------------------
        // second column
        gu.addSecondColumn(this, c);

        //----------------------------------------------------------------------
        // contact details header                
        gu.addHeader(this, c, contactHeader);

        // phone number
        gu.addComponent(this, c, phoneLabel, phoneText);
        phoneText.addFocusListener(focusHandler);

        // email address
        gu.addComponent(this, c, emailLabel, emailText);
        emailText.addFocusListener(focusHandler);

        //----------------------------------------------------------------------
        // employee info header                
        gu.addHeader(this, c, employeeHeader);

        // hire date
        gu.addComponent(this, c, hireDateLabel, hireDateText);
        hireDateText.addFocusListener(focusHandler);

        // salary
        gu.addComponent(this, c, salaryLabel, salaryText);
        salaryText.addFocusListener(focusHandler);

        // commission
        gu.addComponent(this, c, commLabel, commText);
        commText.addFocusListener(focusHandler);

        // department
        gu.addComponent(this, c, deptLabel, deptBox);

        //----------------------------------------------------------------------
        // control header
        gu.addHeader(this, c, controlHeader);

        // buttons
        gu.addComponent(this, c, newEmp, saveButton, clearButton, findButton);
        newEmp.addActionListener(ACTION_LISTENER);
        saveButton.addActionListener(ACTION_LISTENER);
        clearButton.addActionListener(ACTION_LISTENER);
        findButton.addActionListener(ACTION_LISTENER);

        // Create a new employee to work with until one is loaded from the search
        emp = new Employee();
    }

    /**
     * Validates changes on text fields when they lose focus
     */
    public class FocusHandler implements FocusListener {

        @Override
        public void focusGained(FocusEvent e) {
        }

        @Override
        public void focusLost(FocusEvent e) {
            
            // do not attempt to validate blank fields
            if (((JTextField) e.getSource()).getText().isEmpty()) {
                return;
            }
            
            // validate non-blank fields
            if (!v.validate((JTextField) e.getSource(), Employee.v_Common, Employee.validations, true).isPresent()) {
                String name = ((JTextField) e.getSource()).getName();
                String text = ((JTextField) e.getSource()).getText();
                switch (name) {
                    case Employee.FNAME_NAME:
                        emp.setFirstName(text);
                        break;
                    case Employee.LNAME_NAME:
                        emp.setLastName(text);
                        break;
                    case Employee.DOB_NAME:
                        emp.setDateOfBirth(text);
                        break;
                    case Employee.GENDER_NAME:
                        emp.setGender(text);
                        break;
                    case Employee.ADDR_NAME:
                        emp.setAddress(text);
                        break;
                    case Employee.APT_NAME:
                        emp.setApartment(text);
                        break;
                    case Employee.CITY_NAME:
                        emp.setCity(text);
                        break;
                    case Employee.POSTAL_NAME:
                        emp.setPostal(text);
                        break;
                    case Employee.PROVINCE_NAME:
                        emp.setProvince(text);
                        break;
                    case Employee.COUNTRY_NAME:
                        emp.setCountry(text);
                        break;
                    case Employee.PHONE_NAME:
                        emp.setPhone(text);
                        break;
                    case Employee.EMAIL_NAME:
                        emp.setEmail(text);
                        break;
                    case Employee.HIRE_NAME:
                        emp.setHireDate(text);
                        break;
                    case Employee.SALARY_NAME:
                        emp.setSalary(text);
                        break;
                    case Employee.COMM_NAME:
                        emp.setCommission(text);
                        break;
                    case Employee.DEPT_NAME:
                        emp.setDepartment(text);
                        break;
                }

            }
        }
    }

    /**
     * Dispatches action events to the appropriate methods
     */
    public final ActionListener ACTION_LISTENER = (ActionEvent ae) -> {

        // try to call the appropriatae set method
        try {
            switch (((JComponent) ae.getSource()).getName()) {
                case NEWEMPCHECK_NAME:
                    if (newEmp.isSelected()) {
                        saveButton.setText(NEW_BTN_TEXT);
                    } else {
                        saveButton.setText(SAVE_BTN_TEXT);
                    }
                    break;
                case SAVEBTN_NAME:
                    
                    // validate all fields before saving
                    if (!validateAll()) {
                        JOptionPane.showMessageDialog(null, "There are multiple input errors.\nPlease fix them before submitting the form", "Input Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                    
                        switch (JOptionPane.showConfirmDialog(null, "Please confirm your submission")) {
                            case JOptionPane.YES_OPTION:
                                emp.save();
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Action Aborted");
                        }
                    }
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
     * Defines the interface for the employee loader dependency
     */
    public interface EmployeeLoader {

        Employee load(String id, boolean load);
    }

    /**
     * Loads an employees details from the database into an employee object Pass
     * true to the "load" variable if you also want to load the details into the
     * employee tab
     */
    public EmployeeLoader empLoader = (String id, boolean load) -> {

        // show unsaved changes error
        // load the new employee
        if (!db.loadResultSet(Employee.Q_ONE_EMP.replace(":id", id))) {
            System.out.println("shit didn't load");
        }

        // make sure we got a result back
        if (!db.getRSSize().isPresent()) {
            System.out.println("no results");
        }

        // check that all fields are present
        HashMap<String, String> newEmp = db.getResults().get(0);

        emp = new Employee(
                newEmp.get("empID"),
                newEmp.get("fName"),
                newEmp.get("lName"),
                newEmp.get("dob"),
                newEmp.get("gender"),
                newEmp.get("addr"),
                newEmp.get("apt"),
                newEmp.get("city"),
                newEmp.get("postal"),
                newEmp.get("province"),
                newEmp.get("country"),
                newEmp.get("phone"),
                newEmp.get("email"),
                newEmp.get("hireDate"),
                newEmp.get("salary"),
                newEmp.get("comm"),
                newEmp.get("dept")
        );

        if (load) {
            loadEmployee(emp);
        }
        return emp;
    };

    /**
     * Loads an employees details into the form
     *
     * @param e The employee
     */
    public void loadEmployee(Employee e) {

        emp = e;

        // personal info
        fNameText.setText(e.getFirstName());
        lNameText.setText(e.getLastName());
        dobText.setText(e.getDateOfBirth());
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
        addrText.setText(e.getAddress());
        aptText.setText(e.getApartmentNo());
        cityText.setText(e.getCity());
        postalText.setText(e.getPostal());
        provinceBox.setSelectedItem(e.getProvince());
        countryText.setText(e.getCountry());

        // contact
        phoneText.setText(e.getPhone());
        emailText.setText(e.getEmail());

        // employee info
        hireDateText.setText(e.getHireDate());
        salaryText.setText(e.getSalaryAsString());
        commText.setText(e.getCommAsString());
        deptBox.setSelectedItem(e.getDepartment());
    }

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
        provinceBox.setSelectedIndex(0);
        countryText.setText("");

        // contact info
        phoneText.setText("");
        emailText.setText("");

        // employee info
        hireDateText.setText("");
        salaryText.setText("");
        commText.setText("");
        deptBox.setSelectedIndex(0);
        newEmp.setSelected(true);
    }
    
    private boolean validateAll() {
        
        // holds the list of error messages
        // we only want one of these
        ArrayList<String> errMsgs = new ArrayList<String>();
        
        // validate all fields
        errMsgs.add(v.validate(fNameText, Employee.v_Common, Employee.validations, false).orElse(null));
        errMsgs.add(v.validate(lNameText, Employee.v_Common, Employee.validations, false).orElse(null));
        errMsgs.add(v.validate(dobText, Employee.v_Common, Employee.validations, false).orElse(null));
        errMsgs.add(v.validate(addrText, Employee.v_Common, Employee.validations, false).orElse(null));
        errMsgs.add(v.validate(aptText, Employee.v_Common, Employee.validations, false).orElse(null));
        errMsgs.add(v.validate(cityText, Employee.v_Common, Employee.validations, false).orElse(null));
        errMsgs.add(v.validate(postalText, Employee.v_Common, Employee.validations, false).orElse(null));
        errMsgs.add(v.validate(phoneText, Employee.v_Common, Employee.validations, false).orElse(null));
        errMsgs.add(v.validate(emailText, Employee.v_Common, Employee.validations, false).orElse(null));
        errMsgs.add(v.validate(hireDateText, Employee.v_Common, Employee.validations, false).orElse(null));
        errMsgs.add(v.validate(salaryText, Employee.v_Common, Employee.validations, false).orElse(null));
        errMsgs.add(v.validate(commText, Employee.v_Common, Employee.validations, false).orElse(null));
        
        // show first error message
        for (String s : errMsgs) {
            if (s != null) {
                return false;
            }
        }
        return true;
        
    }
        
}
