/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designprinciples;

/**
 *
 * @author Othman Family
 */
import java.util.*;
public class MyAge
{
    private int yearOfBirth;
    private int currentYear;
    private int age;
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        MyAge ma = new MyAge();
        
        ma.currentYear = 2024;
        //assert (ma.currentYear >= 0): "Current year is in negative : " +ma.currentYear;
        try
        {
            System.out.println("Enter your year of birth: ");
            String birth = sc.next();
            ma.yearOfBirth = Integer.parseInt(birth);
            //assert (ma.yearOfBirth >= 0): "Year of birth is in negative : " +ma.yearOfBirth;
            
            ma.age = ma.calcAge(ma.currentYear,ma.yearOfBirth);
            assert (ma.age < 100): "The result age is " +ma.age+ " and this age is not logical in current time.";
            System.out.println("Your current age is " +ma.age+ " years old.");
        }
        catch(NumberFormatException e)
        {
            System.out.println("Year of birth is invalid! Enter a valid year");
        }
        catch(NegativeNumberException e)
        {
            System.out.println("Age cannot be in negative! Enter a valid year");
        }
    }
    
    public int calcAge(int current, int birth) throws NegativeNumberException
    {
        age = current - birth;
        if(age > 0)
            return age;
        else
            throw new NegativeNumberException();
    }
}
