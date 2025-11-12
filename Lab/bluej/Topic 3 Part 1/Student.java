
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    private String name;
    private String matric_num;
    private double gpa;
    
    public void Student()
    {
        name = " ";
        matric_num = " ";
        gpa = 0;
    }
    
    public void setStudent(String name, String matric_num, double gpa)
    {
        this.name = name;
        this.matric_num = matric_num;
        this.gpa = gpa;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getMatricNum()
    {
        return matric_num;
    }
    
    public double getGPA()
    {
        return gpa;
    }
}
