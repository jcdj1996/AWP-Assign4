package general;
import java.util.ArrayList;
import ap.*;
import hr.*;
       
/**
 *
 * @author Tony
 */
public class PayableDemo 
{
    public static void main(String[] args)
    {
        ArrayList<Payable> payableObjects = new ArrayList();
        
        payableObjects.add(new Invoice("1234","pillow",2,49.00));
        payableObjects.add(new Invoice("5678","bed",1,349.00));
        payableObjects.add(new CommissionSalesEmployee("Joe","Smith",35,0.0,
                    "Sales",2015,06,12,500.00,0.22));
        
        System.out.println("Polymorphic display of Invoices and EMployees:");
        
        for(Payable current: payableObjects)
        {
            System.out.println(current.toString() + " " + current.getPaymentAmount());
        }
        

    }
}
