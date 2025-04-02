/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designprinciples;

/**
 *
 * @author Othman Family
 */
public class PostGraduateStudent extends Student
{
    private boolean workingExperience;
    
    public PostGraduateStudent()
    {
        super();
        workingExperience = true;
    }
    
    public PostGraduateStudent(String name, double CPA,double GPA, boolean workExp)
    {
        super(name,CPA,GPA);
        this.workingExperience = workExp;
    }
        
    public void getThesis()
    {
        
    }
}