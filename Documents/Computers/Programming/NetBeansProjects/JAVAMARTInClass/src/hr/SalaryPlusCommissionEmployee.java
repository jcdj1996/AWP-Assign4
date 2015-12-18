
package hr;

/**
 *
 * @author Marco Duarte
 */
public class SalaryPlusCommissionEmployee extends CommisionSalesEmployee
{
    private double baseSalary;
    
    public SalaryPlusCommissionEmployee(   
            String firstName, String lastName, int age, double baseSalary, 
            String position, int year, int month, int day, double grossSales, 
            double commissionRate)
    {
        super(firstName, lastName, age, position, year, month, day,
                    grossSales, commissionRate);
        
        this.baseSalary = baseSalary;
    }
    
    @Override
    public double getPaymentAmount()
    {
        return this.baseSalary + (super.getCommissionRate() * super.getGrossSales());
    }

    @Override
    public String toString()
    {
        return super.toString() + "\nBase Salary:\t" + baseSalary;
    }    
        
}
