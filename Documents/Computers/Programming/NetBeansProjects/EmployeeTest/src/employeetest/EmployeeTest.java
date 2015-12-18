/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeetest;

/**
 *
 * @author Ari
 */
public class EmployeeTest {/* Begin class declaration of EmployeeTest class. */


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {/* Begin main method declaration. */
        /* Create two Employee objects and assign them to Employee variables.  */

        Employee person1 = new Employee("Sally", "Smith", 3700);
        Employee person2 = new Employee("Peter", "Rabbit", 3680);
        /* Output the first name, last name and salary for each Employee. */
        System.out.format("First name is %s last name is %s monthly salary is %.2f%n",
                person1.getFirstName(), person1.getLastName(), person1.getMonthlySalary());
        System.out.format("First name is %s last name is %s monthly salary is %.2f%n",
                person2.getFirstName(), person2.getLastName(), person2.getMonthlySalary());
        /* Give each Employee a 10% raise. */
        person1.setMonthlySalary(person1.getMonthlySalary() * 1.1);
        person2.setMonthlySalary(person2.getMonthlySalary() * 1.1);
        /* Output the first name, last name and salary of each Employee again. */
        System.out.format("First name is %s last name is %s monthly salary is %.2f%n",
                person1.getFirstName(), person1.getLastName(), person1.getMonthlySalary());
        System.out.format("First name is %s last name is %s monthly salary is %.2f%n",
                person2.getFirstName(), person2.getLastName(), person2.getMonthlySalary());
    }/* End main method declaration */

}/* End class declaration of EmployeeTest class. */
