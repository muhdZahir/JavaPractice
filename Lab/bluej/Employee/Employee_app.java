
/**
 * Write a description of class Employee_app here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
public class Employee_app
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        
        String name, ID;
        double salary;
        Employee emp1, emp2;
        
        emp1 = new Employee();
        emp2 = new Employee();
        
        System.out.println("Enter the name: ");
        name = input.next();
        System.out.println("Enter the ID: ");
        ID = input.next();
        System.out.println("Enter the salary : RM ");
        salary = input.nextDouble();
        emp1.setEmployee(name, ID, salary);
        
        System.out.println("Enter the name: ");
        name = input.next();
        System.out.println("Enter the ID: ");
        ID = input.next();
        System.out.println("Enter the salary : RM ");
        salary = input.nextDouble();
        emp2.setEmployee(name, ID, salary);
        
        Employee lowSalary;
        
        lowSalary = emp1.detLowerSal(emp2);
        System.out.println("Details of the employee who has the lower salary: \n" +lowSalary.toString());
    }
}
