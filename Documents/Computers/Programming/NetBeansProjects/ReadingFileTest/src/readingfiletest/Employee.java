/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readingfiletest;

/**
 *
 * @author Ari
 */
public class Employee 
{
   private String firstName;
   private String lastName;
   private double monthlySalary; 

   // constructor to initialize first name, last name and monthly salary
   public Employee( String first, String last, double salary )
   {
      firstName = first;
      lastName = last;
     
      if ( salary >= 0.0 ) // determine whether salary is positive
         monthlySalary = salary; 
   } // end three-argument Employee constructor

   // set Employee's first name
   public void setFirstName( String first )
   {
      firstName = first;
   } // end method setFirstName

   // get Employee's first name
   public String getFirstName()
   {
      return firstName;
   } // end method getFirstName

   // set Employee's last name
   public void setLastName( String last )
   {
      lastName = last;
   } // end method setLastName

   // get Employee's last name
   public String getLastName()
   {
      return lastName;
   } // end method getLastName

   // set Employee's monthly salary
   public void setMonthlySalary( double salary )
   {
      if ( salary >= 0.0 ) // determine whether salary is positive
         monthlySalary = salary; 
   } // end method setMonthlySalary

   // get Employee's monthly salary
   public double getMonthlySalary()
   {
      return monthlySalary;
   } // end method getMonthlySalary

} // end class Employee
