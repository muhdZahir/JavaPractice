
public class Employee1
{
    private String employee_id;
    private String employee_name;
    private double employee_salary;
    
    public void setEmpID(String id)
    {
        this.employee_id = id;
    }
    
    public void setEmpName(String name)
    {
        this.employee_name = name;
    }
    
    public void setEmpSalary(Double salary)
    {
        this.employee_salary = salary;
    }
    
    public String getEmpID()
    {
        return employee_id;
    }
    
    public String getEmpName()
    {
        return employee_name;
    }
    
    public String getEmpSalary()
    {
        String output = String.format("Employee Salary: RM " + String.format("%.2f", employee_salary));
        return output;
    }
}
