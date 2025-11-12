
/**
 * Write a description of class Employee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Employee
{
    private String name;
    private String ID;
    private double salary;
    
    public Employee()
    {
        name=" ";
        ID=" ";
        salary=0.0;
    }
    
    public void setEmployee(String name, String ID, double salary)
    {
        this.name=name;
        this.ID=ID;
        this.salary=salary;
    }
    
    public String getName()
    { return name; }
    
    public String getID()
    { return ID; }
    
    public double getSalary()
    { return salary; }
    
    public String toString()
    {
        String detail;
        detail = "\nName: " +name+ "\nID: " +ID+ "\nSalary: RM " +salary;
        return detail;
    }
    
    public Employee detLowerSal(Employee emp)
    {
        if(this.getSalary() < emp.getSalary())
        {
            return this;
        }
        else
        {
            return emp;
        }
    }
}
