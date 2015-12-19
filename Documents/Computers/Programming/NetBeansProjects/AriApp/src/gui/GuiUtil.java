package gui;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

/**
 * Automatically positions components on a gridbag layout 
 * 
 * Each component is added vertically from top to bottom in a single column. Users
 * can call createSecondColumn to add an additional column if need be.
 * 
 * The utility assumes that each JLabel is 1 cell wide and that each component
 * is 3 cells wide.
 * 
 */
public final class GuiUtil {
    
    final int   COMPONENT_WIDTH     = 3;
    final int   LABEL_WIDTH         = 1;
    final int   HEADER_WIDTH        = COMPONENT_WIDTH + 1;
    private int curYPos = 0;
    private int curXPos = 0;
    
    /**
     * COnfigures the gridbag constraints
     * @param c The gridbag constraints
     */
    public GuiUtil(GridBagConstraints c){
        c.insets = new Insets(7, 7, 7, 7);          // external padding
        c.ipadx = 5;                                // internal padding
        c.ipady = 5;                                // internal padding
        c.fill = GridBagConstraints.HORIZONTAL;     // components fill horizontal space
    }
        public GuiUtil(){}
    
    /**
     * Adds a header at the requested coordinates
     * 
     * Since each header consumes two vertical cells subsequent elements must
     * be positioned at y+2.
     * 
     * @param header The header label
     */
    public void addHeader(JPanel gui, GridBagConstraints c, JLabel header) {
        c.gridwidth = HEADER_WIDTH;
        c.gridx = curXPos;
        c.gridy = curYPos;
        gui.add(header, c);
        c.gridx = curXPos;
        c.gridy = curYPos+1;
        gui.add(new JSeparator(), c);      
        curYPos += 2;
    }   
    
    /**
     * Adds a component at the requested coordinates
     * 
     * Since each addition requires a label and a component two x-cells are
     * used, meaning that subsequent components must be positioned at x+2.
     * 
     * @param label The label of the component
     * @param component The component to add
     */
    public void addComponent(JPanel gui, GridBagConstraints c, JLabel label, JComponent component) {
        c.gridwidth = LABEL_WIDTH;
        c.gridx = curXPos;  
        c.gridy = curYPos;    
        gui.add(label, c);
        c.gridwidth = COMPONENT_WIDTH;
        c.gridx = curXPos + 1;
        c.gridy = curYPos;                   
        gui.add(component, c);
        curYPos += 1;
    }
    
    /**
     * Adds two components to the layout
     * 
     * @param gui The gui to add the components to
     * @param c The gridbag constraints
     * @param label The label of the component
     * @param c1 The first button/checkbox
     * @param c2 The second component
     */
    public void addComponent(JPanel gui, GridBagConstraints c, JLabel label, JComponent c1, JComponent c2) {
        c.gridwidth = LABEL_WIDTH;
        c.gridx = curXPos;  
        c.gridy = curYPos;    
        c.gridwidth = 1;
        gui.add(label, c);
        c.gridx = curXPos + 1;
        gui.add(c1, c);
        c.gridx = curXPos + 2;
        gui.add(c2, c);
        curYPos += 1;
    }
    
    /**
     * Adds three components to the layout
     * 
     * @param gui The gui to add the components to
     * @param c The gridbag constraints
     * @param label The label of the component
     * @param c1 The first button/checkbox
     * @param c2 The second component
     * @param c3 The third component
     */
    public void addComponent(JPanel gui, GridBagConstraints c, JComponent label, JComponent c1, JComponent c2, JComponent c3) {
        c.gridwidth = LABEL_WIDTH;
        c.gridx = curXPos;  
        c.gridy = curYPos;    
        c.gridwidth = 1;
        gui.add(label, c);
        c.gridx = curXPos + 1;
        gui.add(c1, c);
        c.gridx = curXPos + 2;
        gui.add(c2, c);
        c.gridx = curXPos + 3;
        gui.add(c3, c);
        curYPos += 1;
    }
    
    /**
     * Separates the first and second columns
     * 
     * @param gui The gridbag layout
     * @param c The Grirbag constraints
     */
    public void addSecondColumn(JPanel gui, GridBagConstraints c) {
        c.gridx = HEADER_WIDTH + COMPONENT_WIDTH + 1;
        c.gridy = 0;
        c.gridheight = 18;
        c.fill = GridBagConstraints.BOTH;
        gui.add(new JSeparator(SwingConstants.VERTICAL), c);
        c.gridheight = 1;
        c.fill = GridBagConstraints.HORIZONTAL;
        curYPos = 0;
        curXPos = HEADER_WIDTH + COMPONENT_WIDTH + 2;
    }
    

}
