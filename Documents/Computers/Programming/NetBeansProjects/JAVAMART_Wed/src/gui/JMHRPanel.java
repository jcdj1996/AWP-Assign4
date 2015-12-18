package gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Tony
 */
public class JMHRPanel extends JPanel 
{
    //components
    //labels
    private final JLabel lblFirstName, lblLastName, lblAge, lblPosition,
            lblHireYear,lblHireMonth,DateOfHireJLabel,lblCommissionRate;
    
    //text fields
    private final JTextField txtFirstName, txtLastName,txtAge, txtCommissionRate;
    
    //radio buttons
    private ButtonGroup bg;
    private final JRadioButton rdbGenderMale, rdbGenderFemale;
    
    //drop down lists
    private final JComboBox<String> cmbYear, cmbMonth, cmbDay, cmbPosition;
    
    private static final String[] 
            year = {"2014","2015","2016"},
            month = {"January","February","March","April","May","June","July","August","September","October","November","December"},
            day = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14",
                "15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31",},
            position = {"Sales","Shipping","Administration","Management"};
    
    
            
    
    
    
    public JMHRPanel()
    {
        //set layout
        setLayout(new GridLayout(5,2));
        
        //initialize the labels
        lblFirstName = new JLabel("First Name:");
        lblLastName = new JLabel("Last Name:");
        lblAge = new JLabel("Age:");
        lblPosition = new JLabel("Position:");
        lblHireYear = new JLabel("Hire Year");
        lblHireMonth = new JLabel("Hire Month");
        DateOfHireJLabel = new JLabel("Hire Day");
        lblCommissionRate = new JLabel("Commission Rate:");
        
        //initialize the text felds
        txtFirstName = new JTextField(15);
        txtLastName = new JTextField(15);
        txtAge = new JTextField(2);
        txtCommissionRate = new JTextField(15);
        
        //radio buttons
        rdbGenderMale = new JRadioButton("Male");
        rdbGenderFemale = new JRadioButton("Female");
        bg = new ButtonGroup();
        bg.add(rdbGenderMale);
        bg.add(rdbGenderFemale);
        
        //combo boxes
        cmbYear = new JComboBox<String>(year);
        cmbMonth = new JComboBox<String>(month);
        cmbDay = new JComboBox<String>(day);
        cmbPosition = new JComboBox<String>(position);
        
        setBorder(BorderFactory.createTitledBorder("Employee Information"));
        
        add(lblFirstName);
        add(txtFirstName);
        add(lblLastName);
        add(txtLastName);
        add(lblAge);
        add(txtAge);
        add(rdbGenderMale);
        add(rdbGenderFemale);
        add(lblHireYear);
        add(cmbYear);
        add(lblHireMonth);
        add(cmbMonth);
        add(DateOfHireJLabel);
        add(cmbDay);
        add(lblPosition);
        add(cmbPosition);
        add(lblCommissionRate);
        add(txtCommissionRate);
    }
    
}
