/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designprinciples;

/**
 *
 * @author Othman Family
 */
public class DiplomaStudent extends Student
{
    private boolean practicalTraining;
    
    public DiplomaStudent()
    {
        super();
        practicalTraining = true;
    }
    
    public DiplomaStudent(String name, double CPA,double GPA, boolean practical)
    {
        super(name,CPA,GPA);
        this.practicalTraining = practical;
    }
    
    public void getTraining()
    {
        
    }
}