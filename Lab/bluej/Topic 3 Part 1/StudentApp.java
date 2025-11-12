
/**
 * Write a description of class StudentApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
public class StudentApp
{
    public static void main(String args[])
    {
        Scanner inputText=new Scanner(System.in);
        Scanner inputNum=new Scanner(System.in);
        
        Student std1, std2;
        std1=new Student();
        std2=new Student();
        
        String name, matric_num;
        double gpa, avg;
        
        System.out.println("Enter name for student 1: ");
        name=inputText.nextLine();
        System.out.println("Enter matric number for student 1: ");
        matric_num=inputText.next();
        System.out.println("Enter gpa for student 1: ");
        gpa=inputNum.nextDouble();
        std1.setStudent(name,matric_num,gpa);
        
        System.out.println("Enter name for student 2: ");
        name=inputText.next();
        System.out.println("Enter matric number for student 2: ");
        matric_num=inputText.next();
        System.out.println("Enter gpa for student 2: ");
        gpa=inputNum.nextDouble();
        std2.setStudent(name,matric_num,gpa);
        
        avg = (std1.getGPA() + std2.getGPA())/2;
        
        if(std1.getGPA() > std2.getGPA())
        {
            System.out.println("Details for the student who got higher gpa.");
            System.out.println("Name: " +std1.getName());
            System.out.println("Matric Number: " +std1.getMatricNum());
        }
        else
        {
            System.out.println("Details for the student who got higher gpa.");
            System.out.println("Name: " +std2.getName());
            System.out.println("Matric Number: " +std2.getMatricNum());
        }
        
        System.out.println("The average gpa is " +avg);
    }
}
