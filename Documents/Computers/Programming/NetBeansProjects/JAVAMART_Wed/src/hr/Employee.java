package hr;
import general.ServiceClass;
import java.util.*;
import ap.*;
/**
 *
 * @author Tony
 */
public abstract class Employee implements Payable
{
    //Class instance variables
    private String firstName, lastName, position, employeeStatus;
    private int empId, age;
    private double taxRate;
    private Date dateOfHire;
    private static int numOfEmp;
    
    //explicit default constructor
    public Employee()
    {}
    
    
    public Employee(String firstName,String lastName,int age, 
            String position, int year,int month, int day)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.position = position;
        //GregorianCalendar cal = new GregorianCalendar(year, month-1, day);
        this.dateOfHire = new GregorianCalendar(year, month-1, day).getTime();
        //call the static method of empId to get a new ID
        this.empId = ServiceClass.getEmpId();
        //add one to the static employee counter
        updateEmpCounter();
    }
    
    //GET Methods that will return information about the employee
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public String getFullName()
    {
        return firstName + " " + lastName;
    }
    public int getAge()
    {
        return age;
    }
    public String getPosition()
    {
        return position;
    }
    public Date getDateOfHire()
    {
        return dateOfHire;
    }
    public int getEmpId()
    {
        return empId;
    }

    //overridden toString method
    @Override
    public String toString() {
        String employeeInfo = "";

        employeeInfo += "\nName:\t\t" + getFullName();
        employeeInfo += "\nId:\t\t" + getEmpId();
        employeeInfo += "\nAge:\t\t" + getAge();
        employeeInfo += "\nPosition:\t" + getPosition();
        employeeInfo += "\nHire-Date:\t" + getDateOfHire();
   
 
        return employeeInfo;
    }
    //get the total employees created
    public int getEmpCount()
    {
        return numOfEmp;
    }
    
    
    //SET methods
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    public void setAge(int age)
    {
        //added safety check
        if(age>80 || age<10)
        {
            this.age = age;
        }
    }
    public void setPosition(String position)
    {
        this.position = position;
    }
    public void setDateOfHire(int year, int month, int day)
    {
        //create a new calendar object and chain in the method to 
        //get the time in a Date object. 
        this.dateOfHire = new GregorianCalendar(year,month,day).getTime();
    }
    public void setEmpId(int empId)
    {
        //although this is ok for now, a check for an existing 
        //emp Id must be conducted here
        //checkEmpId(empId);
        this.empId = empId;
    }
    //method to update the employee counter
    private void updateEmpCounter()
    {
        //update the emp count
        numOfEmp++;
    }
   
}//end of class
