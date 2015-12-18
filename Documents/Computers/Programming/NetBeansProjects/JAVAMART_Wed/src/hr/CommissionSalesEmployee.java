package hr;
/**
 *
 * @author Tony Persson
 */
public class CommissionSalesEmployee extends Employee
{
    private double commissionRate,grossSales;
    
    public CommissionSalesEmployee(String firstName,String lastName,int age,
            double baseSalary,String position, int year,int month, int day, 
            double grossSales, double commissionRate)
    {
        super(firstName,lastName,age,position,year,month,day);
        
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
        
    }
    
    //GET methods
    public double getCommissionRate()
    {
        return this.commissionRate;
    }
    public double getGrossSales()
    {
        return this.grossSales;
    }

    
    //SET methods
    public void setCommissionRate(double commissionRate)
    {
        if(commissionRate>0.0 && commissionRate<1.0)
        {
            this.commissionRate = commissionRate;
        }
    }
    public void setGrossSales(double grossSales)
    {
        this.grossSales = grossSales;
    }
  
    @Override 
    public double getPaymentAmount()
    {
        return getCommissionRate() * getGrossSales();
    }
    @Override
    public String toString()
    {
        return super.toString() + 
                "\nCommission Rate:\t" + getCommissionRate()+
                "\nGross Sales:\t" + getGrossSales();
                
    }
   
}