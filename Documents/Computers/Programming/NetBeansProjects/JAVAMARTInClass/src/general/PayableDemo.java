package general;

import java.util.*;
import ap.*;
import hr.*;
/**
 *
 * @author Marco Duarte
 */
public class PayableDemo 
{
    public static void main(String[] args)
    {
        ArrayList<Payable> payableObjects = new ArrayList();
        
        payableObjects.add(new Invoice("1234", "pillow", 2, 49.00));
        payableObjects.add(new Invoice("5678", "bed", 1, 349.00));
        payableObjects.add(new CommisionSalesEmployee("Joe","Smith",35,
        "Sales",2015,06,12,500.00,0.22));
        
        System.out.println("Polymorphic display of Invoice and Employee");
        
        for(Payable current: payableObjects)
        {
            System.out.println(current.toString() + " " + current.getPaymentAmount());
        }
    }
}
