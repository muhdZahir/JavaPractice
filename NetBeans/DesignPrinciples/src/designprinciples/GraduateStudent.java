/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designprinciples;

/**
 *
 * @author Othman Family
 */
public class GraduateStudent extends Student
{
    private String scholarships;
    private double scholarshipsAmount;
    
    public GraduateStudent()
    {
        super();
        scholarships = "";
        scholarshipsAmount = 0.0;
    }
    
    public GraduateStudent(String name, double CPA,double GPA, String scholarships, double scholarshipsAmount)
    {
        super(name,CPA,GPA);
        this.scholarships = scholarships;
        this.scholarshipsAmount = scholarshipsAmount;
    }
      
    public void getProject()
    {
        
    }
}