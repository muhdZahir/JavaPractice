/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designprinciples;

/**
 *
 * @author Othman Family
 */
public class School
{
    private NameAndAddress name_add;
    private int enrollment;
    
    public School(String name,String add,int zip,int enroll)
    {
        name_add = new NameAndAddress(name,add,zip);
        enrollment = enroll;
    }
    
    public void display()
    {
        System.out.println("The school is at ");
        name_add.display();
        System.out.println("Enrollment is " +enrollment);
    }
}