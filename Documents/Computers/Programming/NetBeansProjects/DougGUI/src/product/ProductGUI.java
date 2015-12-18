package product;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import util.GuiUtil;

/**
 * Creates an interface for managing products
 */
public class ProductGUI extends JPanel {

    final int TEXTFIELD_WIDTH = 20;
    final int HEADER_POS = SwingConstants.CENTER;
    final int LABEL_POS = SwingConstants.RIGHT;

    GridBagConstraints c = new GridBagConstraints();
    GuiUtil gu = new GuiUtil(c);

    // product info
    JLabel productHeaderLabel = new JLabel("Product Information", HEADER_POS);
    JLabel nameLabel = new JLabel("Name", LABEL_POS);
    JTextField nameText = new JTextField(TEXTFIELD_WIDTH);
    JLabel colourLabel = new JLabel("Colour", LABEL_POS);
    JTextField colourText = new JTextField(TEXTFIELD_WIDTH);
    JLabel weightLabel = new JLabel("Weight", LABEL_POS);
    JTextField weightText = new JTextField(TEXTFIELD_WIDTH);
    JLabel heightLabel = new JLabel("Height", LABEL_POS);
    JTextField heightText = new JTextField(TEXTFIELD_WIDTH);
    JLabel widthLabel = new JLabel("Width", LABEL_POS);
    JTextField widthText = new JTextField(TEXTFIELD_WIDTH);
    JLabel lengthLabel = new JLabel("Length", LABEL_POS);
    JTextField lengthText = new JTextField(TEXTFIELD_WIDTH);

    // logistics info
    JLabel logisticsHeaderLabel = new JLabel("Logistics Information", HEADER_POS);
    JLabel inStockLabel = new JLabel("In Stock", LABEL_POS);
    JLabel inStockText = new JLabel("YES");
    JLabel reOrderLevelLabel = new JLabel("Reorder Level", LABEL_POS);
    JTextField reOrderLevelText = new JTextField(TEXTFIELD_WIDTH);
    JLabel destinationLabel = new JLabel("Shipping Destinations", LABEL_POS);
    JComboBox destinationBox = new JComboBox(new String[]{"North America", "South America", "Europe", "Asia", "Africa", "Oceania"});
    JLabel shippingLabel = new JLabel("Shipping Options ", LABEL_POS);
    JCheckBox exportTaxCheckBox = new JCheckBox("Charge Export Tax");
    JCheckBox priorityShippingCheckBox = new JCheckBox("Priority Shipping");

    // sales info
    JLabel salesHeaderLabel = new JLabel("Sales Information", HEADER_POS);
    JLabel salesRepLabel = new JLabel("Sales Rep", LABEL_POS);
    JComboBox salesRepBox = new JComboBox(new String[]{"Bob", "Alice"});

    // manufacturer
    JLabel manuHeaderLabel = new JLabel("Manufacturer Information", HEADER_POS);
    JLabel manuNameLabel = new JLabel("Name", LABEL_POS);
    JTextField manuNameText = new JTextField(TEXTFIELD_WIDTH);

    JLabel manuPhoneLabel = new JLabel("Phone", LABEL_POS);
    JTextField manuPhoneText = new JTextField(TEXTFIELD_WIDTH);

    JLabel manuEmailLabel = new JLabel("Email", LABEL_POS);
    JTextField manuEmailText = new JTextField(TEXTFIELD_WIDTH);

    // product controls
    String SAVE_BTN_TEXT = "Update Product";
    String NEW_BTN_TEXT = "Create Product";
    JLabel controlHeaderLabel = new JLabel("Product Controls", HEADER_POS);
    JCheckBox newPro = new JCheckBox("New Product");
    JButton saveButton = new JButton(SAVE_BTN_TEXT);
    JButton newButton = new JButton("New Product");
    JButton findButton = new JButton("Find Product");

    public ProductGUI() {

        setLayout(new GridBagLayout());

        //----------------------------------------------------------------------
        // product info
        gu.addHeader(this, c, productHeaderLabel);
        gu.addComponent(this, c, nameLabel, nameText);
        nameText.addActionListener(NAME_AL);

        gu.addComponent(this, c, colourLabel, colourText);
        colourText.addActionListener(COLOUR_AL);

        gu.addComponent(this, c, weightLabel, weightText);
        weightText.addActionListener(WEIGHT_AL);

        gu.addComponent(this, c, heightLabel, heightText);
        heightText.addActionListener(HEIGHT_AL);

        gu.addComponent(this, c, widthLabel, widthText);
        widthText.addActionListener(WIDTH_AL);

        gu.addComponent(this, c, lengthLabel, lengthText);
        lengthText.addActionListener(LENGTH_AL);

        //----------------------------------------------------------------------
        // manufacturer
        gu.addHeader(this, c, manuHeaderLabel);
        gu.addComponent(this, c, manuNameLabel, manuNameText);
        manuNameText.addActionListener(MANU_NAME_AL);
        gu.addComponent(this, c, manuPhoneLabel, manuPhoneText);
        manuPhoneText.addActionListener(MANU_PHONE_AL);
        gu.addComponent(this, c, manuEmailLabel, manuEmailText);
        manuEmailText.addActionListener(MANU_EMAIL_AL);

        //----------------------------------------------------------------------
        // second column
        gu.addSecondColumn(this, c);

        //----------------------------------------------------------------------
        // sales
        gu.addHeader(this, c, salesHeaderLabel);
        gu.addComponent(this, c, salesRepLabel, salesRepBox);
        salesRepBox.addActionListener(SALESREP_AL);

        //----------------------------------------------------------------------
        // logistics header
        gu.addHeader(this, c, logisticsHeaderLabel);
        gu.addComponent(this, c, inStockLabel, inStockText);
        gu.addComponent(this, c, reOrderLevelLabel, reOrderLevelText);
        reOrderLevelText.addActionListener(REORDER_AL);
        gu.addComponent(this, c, destinationLabel, destinationBox);
        destinationBox.addActionListener(DEST_AL);
        gu.addComponent(this, c, shippingLabel, exportTaxCheckBox, priorityShippingCheckBox);
        exportTaxCheckBox.addActionListener(PRIORITY_AL);
        priorityShippingCheckBox.addActionListener(PRIORITY_AL);

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
     * Listens for actions on the name text field
     */
    public static final ActionListener NAME_AL = (ActionEvent ae) -> {
        System.out.println("An action occured on the name text field");
    };

    /**
     * Listens for actions on the colour text field
     */
    public static final ActionListener COLOUR_AL = (ActionEvent ae) -> {
        System.out.println("An action occured on the colour text field");
    };

    /**
     * Listens for actions on the weight text field
     */
    public static final ActionListener WEIGHT_AL = (ActionEvent ae) -> {
        System.out.println("An action occured on the weight text field");
    };

    /**
     * Listens for actions on the height text field
     */
    public static final ActionListener HEIGHT_AL = (ActionEvent ae) -> {
        System.out.println("An action occured on the height text field");
    };

    /**
     * Listens for actions on the width text field
     */
    public static final ActionListener WIDTH_AL = (ActionEvent ae) -> {
        System.out.println("An action occured on the widh text field");
    };

    /**
     * Listens for actions on the length text field
     */
    public static final ActionListener LENGTH_AL = (ActionEvent ae) -> {
        System.out.println("An action occured on the length text field");
    };

    /**
     * Listens for actions on the reorder text field
     */
    public static final ActionListener REORDER_AL = (ActionEvent ae) -> {
        System.out.println("An action occured on the reorder text field ");
    };

    /**
     * Listens for actions on the manufacturer name text field
     */
    public static final ActionListener MANU_NAME_AL = (ActionEvent ae) -> {
        System.out.println("An action occured on the manufacturer name text field ");
    };

    /**
     * Listens for actions on the manufacturer phone text field
     */
    public static final ActionListener MANU_PHONE_AL = (ActionEvent ae) -> {
        System.out.println("An action occured on the manufacturer phone text field ");
    };

    /**
     * Listens for actions on the manufacturer email text field
     */
    public static final ActionListener MANU_EMAIL_AL = (ActionEvent ae) -> {
        System.out.println("An action occured on the manufacturer email text field ");
    };

    /**
     * Listens for actions on the destination field
     */
    public static final ActionListener DEST_AL = (ActionEvent ae) -> {
        System.out.println("An action occured on the destination text field");
    };

    /**
     * Listens for actions on the export check box
     */
    public static final ActionListener EXPORT_AL = (ActionEvent ae) -> {
        System.out.println("An action occured on the export checkbox");
    };

    /**
     * Listens for actions on the priority checkbox
     */
    public static final ActionListener PRIORITY_AL = (ActionEvent ae) -> {
        System.out.println("An action occured on the priority");
    };

    /**
     * Listens for actions on the sales rep combo box
     */
    public static final ActionListener SALESREP_AL = (ActionEvent ae) -> {
        System.out.println("An action occured on the sales rep combo box");
    };

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
