import java.util.Scanner;
import java.text.DecimalFormat;
public class EmployeeApp
{
    public static void main(String args[])
    {
        Manager m = new Manager();
        Programmer p = new Programmer();
        Employee1 emp1 = new Employee1();
        
        Scanner sc = new Scanner(System.in);
        
        double salary;
        
        System.out.println("Enter salary (RM):");
        salary = sc.nextDouble();
        emp1.setEmpSalary(salary);
        
        emp1.getEmpSalary();
    }
}
