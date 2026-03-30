/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designprinciples;

/**
 *
 * @author Othman Family
 */
public class Student
{
    protected String name;
    protected double CPA;
    protected double GPA;
    
    protected Student()
    {
        name = "";
        CPA = 0.0;
        GPA = 0.0;
    }
    
    protected Student(String name, double CPA,double GPA)
    {
        this.name = name;
        this.CPA = CPA;
        this.GPA = GPA;
    }
    
    protected String generateSlip()
    {
        String result = "\nName: " +name+ "\nCPA: " +CPA+ "\nGPA: " +GPA;
        return result;
    }
}