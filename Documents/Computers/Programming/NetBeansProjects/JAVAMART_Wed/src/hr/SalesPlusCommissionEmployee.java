package hr;

/**
 *
 * @author Tony Persson
 */
public class SalesPlusCommissionEmployee extends CommissionSalesEmployee
{
    private double baseSalary;
    
   public SalesPlusCommissionEmployee(String firstName,String lastName,int age,
            double baseSalary,String position, int year,int month, int day, 
            double grossSales, double commissionRate)
   {
       super(firstName,lastName,age,baseSalary,position,year,month,
               day,grossSales,commissionRate);
       
       this.baseSalary = baseSalary;
   }
  
   public double earnings()
   {
       return this.baseSalary + (super.getPaymentAmount());
   }
 @Override
 public String toString()
 {
     return super.toString() + 
             "\nBase Salary:\t" + this.baseSalary;
            
 }
}