package GUI;
import javax.swing.*;
/**
 * @author Aristotle Rovithis 200209726
 */
public class PizzaHouseGreetingsPanel extends JPanel
{
    private JLabel lblGreeting;
    
    public PizzaHouseGreetingsPanel()
    {
        //create a label for the main frame
        lblGreeting = new JLabel ("Welcome to Kirby's Pizza");
        add(lblGreeting);
    }        
}
