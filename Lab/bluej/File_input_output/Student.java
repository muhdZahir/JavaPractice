
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Student
{
    private String name;
    private String matricNumber;
    private double cgpa;
    
    public Student()
    {
        name = null;
        matricNumber = null;
        cgpa = 0.0;
    }
    
    public void setStudent(String name, String matricNumber, double cgpa)
    {
        this.name = name;
        this.matricNumber = matricNumber;
        this.cgpa = cgpa;
    }
    
    public String getName() { return name; }
    public String getMatNumber() { return matricNumber; }
    public double getCGPA() { return cgpa; }
    
    public String toString()
    {
        return ("Name: " +name+ "\nMatric Number: " +matricNumber+ "\nCGPA: " +cgpa);
    }
}
