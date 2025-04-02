/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designprinciples;

/**
 *
 * @author Othman Family
 */
public class Subject
{
    private String code;
    private float credit;
    private CoreSubject CSubject;
    private ElectiveSubject ESubject;
    
    public Subject(String code, float credit, float grade, boolean sem)
    {
        this.code = code;
        this.credit = credit;
        CSubject = new CoreSubject(grade);
        ESubject = new ElectiveSubject(sem);
    }
       
    public int register()
    {
        int reg = 0;
        return reg;
    }
}