package gui;

import employee.Employee;
import java.awt.*;
import java.awt.event.*;
import java.util.Optional;
import javax.swing.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.plaf.basic.BasicTableUI;
import product.Product;
import util.Validation;

/**
 * Creates an interface for managing products
 */
public class ProductGUI extends JPanel {

    final int   TEXTFIELD_WIDTH     = 20;
    final int   HEADER_POS          = SwingConstants.CENTER;
    final int   LABEL_POS           = SwingConstants.RIGHT;
    
    GridBagConstraints c = new GridBagConstraints();
    GuiUtil gu = new GuiUtil(c);
    
    Product pro = new Product();
    Validation v = new Validation();
    
    // product info
    JLabel          productHeaderLabel  = new JLabel("Product Information", HEADER_POS);
    JLabel          proNameLabel        = new JLabel("Name", LABEL_POS);
    JTextField      proNameText         = new JTextField(TEXTFIELD_WIDTH);
    JLabel          colourLabel         = new JLabel("Colour", LABEL_POS);
    JTextField      colourText          = new JTextField(TEXTFIELD_WIDTH);
    JLabel          weightLabel         = new JLabel("Weight", LABEL_POS);
    JTextField      weightText          = new JTextField(TEXTFIELD_WIDTH);
    
    // logistics info
    JLabel          logisticsHeaderLabel        = new JLabel("Logistics Information", HEADER_POS);
    JLabel          quantityLabel               = new JLabel("Quantity", LABEL_POS);
    JTextField      quantityText                = new JTextField(TEXTFIELD_WIDTH);
    JLabel          shippingLabel               = new JLabel("Shipping Options ", LABEL_POS);
    JCheckBox       taxCheckBox                 = new JCheckBox("Charge Export Tax");
    JCheckBox       shippingCheckBox            = new JCheckBox("Priority Shipping");
    
    // sales info
    JLabel          salesHeaderLabel        = new JLabel("Sales Information", HEADER_POS);
    JLabel          salesRepLabel           = new JLabel("Sales Rep", LABEL_POS);
    JComboBox       salesRepBox             = new JComboBox(new String[] {"Bob", "Alice"});
    
    // manufacturer
    JLabel      manuHeaderLabel    = new JLabel("Manufacturer Information", HEADER_POS);
    JLabel      manuNameLabel      = new JLabel("Name", LABEL_POS);
    JTextField  manuNameText       = new JTextField(TEXTFIELD_WIDTH);
    
    JLabel      manuPhoneLabel     = new JLabel("Phone", LABEL_POS);
    JTextField  manuPhoneText      = new JTextField(TEXTFIELD_WIDTH);
    
    JLabel      manuEmailLabel     = new JLabel("Email", LABEL_POS);
    JTextField  manuEmailText      = new JTextField(TEXTFIELD_WIDTH);
    
    
    // product controls
    String      SAVE_BTN_TEXT       = "Update Product";
    String      NEW_BTN_TEXT        = "Create Product";
    JLabel      controlHeaderLabel  = new JLabel("Product Controls", HEADER_POS);
    JCheckBox   newPro              = new JCheckBox("New Product");
    JButton     saveButton          = new JButton(SAVE_BTN_TEXT);
    JButton     newButton           = new JButton("New Product");
    JButton     findButton          = new JButton("Find Product");
    
    public ProductGUI() {
        
        setLayout(new GridBagLayout());
        
        // set the names of the components
        proNameText.setName(Product.PRODNAME_NAME);
        colourText.setName(Product.COLOUR_NAME);
        weightText.setName(Product.WEIGHT_NAME);
        manuNameText.setName(Product.MANUNAME_NAME);
        manuPhoneText.setName(Product.MANUPHONE_NAME);
        manuEmailText.setName(Product.MANUEMAIL_NAME);
        salesRepBox.setName(Product.SALESREP_NAME);
        quantityText.setName(Product.QUANTITY_NAME);
        taxCheckBox.setName(Product.TAX_NAME);
        shippingCheckBox.setName(Product.SHIPPING_NAME);
        
        FocusHandler focusHandler = new FocusHandler();
        
        //----------------------------------------------------------------------
        // product info
        gu.addHeader(this, c, productHeaderLabel);
        gu.addComponent(this, c, proNameLabel, proNameText);
        proNameText.addFocusListener(focusHandler);
        
        gu.addComponent(this, c, colourLabel, colourText);
        colourText.addFocusListener(focusHandler);
        gu.addComponent(this, c, weightLabel, weightText);
        colourText.addFocusListener(focusHandler);
        
        //----------------------------------------------------------------------
        // manufacturer
        gu.addHeader(this, c, manuHeaderLabel);
        gu.addComponent(this, c, manuNameLabel, manuNameText);
        manuNameText.addFocusListener(focusHandler);
        gu.addComponent(this, c, manuPhoneLabel, manuPhoneText);
        manuPhoneText.addFocusListener(focusHandler);
        gu.addComponent(this, c, manuEmailLabel, manuEmailText);
        manuEmailText.addFocusListener(focusHandler);
        
        //----------------------------------------------------------------------
        // second column
        gu.addSecondColumn(this, c);
        
        //----------------------------------------------------------------------
        // sales
        gu.addHeader(this, c, salesHeaderLabel);
        gu.addComponent(this, c, salesRepLabel, salesRepBox);
        
        //----------------------------------------------------------------------
        // logistics header
        gu.addHeader(this, c, logisticsHeaderLabel);
        gu.addComponent(this, c, quantityLabel, quantityText);
        gu.addComponent(this, c, shippingLabel, taxCheckBox, shippingCheckBox);
        
        //----------------------------------------------------------------------
        // controls
        gu.addHeader(this, c, controlHeaderLabel);
        gu.addComponent(this, c, newPro, saveButton, newButton, findButton);
        newPro.addActionListener(NEWPRODUCT_AL);
        saveButton.addActionListener(SAVE_AL);
        newButton.addActionListener(NEW_AL);
        findButton.addActionListener(FIND_AL);
        
    }
    
    /**
     * Validates changes on text fields when they lose focus
     */
    public class FocusHandler implements FocusListener {

        @Override
        public void focusGained(FocusEvent e) {}

        @Override
        public void focusLost(FocusEvent e) {
            v.validate((JTextField) e.getSource(), Employee.v_Common, Employee.validations, true);
        }
        
    }
    
    /**
     * Listens for actions on the new product check box
     */
    public final ActionListener NEWPRODUCT_AL = (ActionEvent ae) -> {
        if (!newPro.isSelected()) {
            saveButton.setText(SAVE_BTN_TEXT);
        } else {
            saveButton.setText(NEW_BTN_TEXT);
        }
    };
    
    /**
     * Listens for actions on the save button
     */
    public static final ActionListener SAVE_AL = (ActionEvent ae) -> {
        System.out.println("An action occured on the save button");
    };
    
    /**
     * Listens for actions on the new button
     */
    public static final ActionListener NEW_AL = (ActionEvent ae) -> {
        System.out.println("An action occured on the new button");
    };
    
    /**
     * Listens for actions on the find button
     */
    public static final ActionListener FIND_AL = (ActionEvent ae) -> {
        System.out.println("An action occured on the find button");
    };
}
