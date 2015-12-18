
package hr;

/**
 *
 * @author The Raven
 */
public class CommisionSalesEmployee extends Employee
{
    private double commissionRate, grossSales;
    
    public CommisionSalesEmployee(String firstName,String lastName,int age, 
            String position, int year,int month, int day, double grossSales, double commissionRate)
    {
        super(firstName, lastName, age, position, year, month, day);
        
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }
    
    //methods
    public double getCommissionRate()
    {
        return this.commissionRate;
    }
    
    public double getGrossSales()
    {
        return this.grossSales;
    }
    
    public void setCommissionRate(double commissionRate)
    {
        if(commissionRate > 0.0 && commissionRate < 1.0)
        {
            this.commissionRate = commissionRate;
        }
    }
    @Override
    public double getPaymentAmount()
    {
        return getCommissionRate() * getGrossSales();
    }
    
    @Override
    public String toString() 
    {
        return super.toString() + "\nCommission:\t" + getCommissionRate()
                                + "\nGross Sales:\t" + getGrossSales()
                                + "\nTotal Earnings:\t" + getPaymentAmount();  
    }
}
    
