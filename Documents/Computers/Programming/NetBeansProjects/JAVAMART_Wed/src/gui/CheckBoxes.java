package gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Tony
 */
public class CheckBoxes extends JFrame {

    private final JTextField myTextField;
    //checkboxes
    private final JCheckBox boldCheckBox, italCheckBox;

    //radio buttons
    private final JRadioButton firstFont, secondFont;
    private final ButtonGroup radioGroup;

    //Drop DownList/Comboboxes
    private final JComboBox<String> fontSize;
    private static final String[] numbers = {"14", "20"};

    public CheckBoxes() {
        super("Java Checkboxes");
        setLayout(new FlowLayout());

        //create text field
        myTextField = new JTextField("Sample Text", 20);
        myTextField.setFont(new Font("Serif", Font.PLAIN, 14));
        add(myTextField);

        //check boxes
        boldCheckBox = new JCheckBox("Bold");
        italCheckBox = new JCheckBox("Italics");
        add(boldCheckBox);
        add(italCheckBox);

        //radio buttons
        firstFont = new JRadioButton("Arial", true);
        secondFont = new JRadioButton("Serif", false);
        radioGroup = new ButtonGroup();
        radioGroup.add(firstFont);
        radioGroup.add(secondFont);
        add(firstFont);
        add(secondFont);

        //Comboboxes/Drop downList
        fontSize = new JComboBox<String>(numbers);
        fontSize.setMaximumRowCount(2);

        //register handler with the component
        fontSize.addItemListener(
                new ItemListener() {
            int index;

            @Override
            public void itemStateChanged(ItemEvent event) {
                if (event.getStateChange() == ItemEvent.SELECTED) {
                    String selectedItem
                            = (String) fontSize.getSelectedItem();

                    index = Integer.parseInt(selectedItem);
                    // myTextField.setFont(new Font("Arial",Font.PLAIN,index));

                    if (index == 14) {
                        myTextField.setFont(new Font("Arial", Font.PLAIN, 14));
                    } else if (index == 20) {
                        myTextField.setFont(new Font("Arial", Font.PLAIN, 20));
                    }
                }
            }
        }
        );
        add(fontSize);

        //register the components with the handler
        CheckBoxHandler ckHandler = new CheckBoxHandler();
        boldCheckBox.addItemListener(ckHandler);
        italCheckBox.addItemListener(ckHandler);

        //register the rb handler
        firstFont.addItemListener(
                new RadioButtonHandler(new Font("Arial", Font.PLAIN, 14)));
        secondFont.addItemListener(
                new RadioButtonHandler(new Font("Serif", Font.PLAIN, 14)));

    }//end of constructor

    //private inner class
    private class CheckBoxHandler implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent event) {
            Font font = null;

            if (boldCheckBox.isSelected() && italCheckBox.isSelected()) {
                font = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
            } else if (boldCheckBox.isSelected()) {
                font = new Font("Serif", Font.BOLD, 14);
            } else if (italCheckBox.isSelected()) {
                font = new Font("Serif", Font.ITALIC, 14);
            } else {
                font = new Font("Serif", Font.PLAIN, 14);
            }

            myTextField.setFont(font);

        }
    }//end of checkbox handler

    //inner class for radio button events
    private class RadioButtonHandler implements ItemListener {

        private Font font;
        //inner class constructor

        public RadioButtonHandler(Font font) {
            this.font = font;
        }

        @Override
        public void itemStateChanged(ItemEvent event) {
            myTextField.setFont(font);
        }

    }

}
