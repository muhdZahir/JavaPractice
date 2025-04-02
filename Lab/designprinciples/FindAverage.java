/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designprinciples;

/**
 *
 * @author Othman Family
 */
// Req output: Find the average for two numbers,
import javax.swing.*; // new library import-display message dialog (GUI) library
public class FindAverage
{
    public static void main(String[] args)
    {
        String s1;
        String s2;
        //num1,num2,average are consider as attributes in Class Diagram, but not s1,s2
        double num1 = 0;
        double num2 = 0;
        double average = 0;
        
        s1 = JOptionPane.showInputDialog("Enter a number:");
        s2 = JOptionPane.showInputDialog("Great! Now enter another number:");
        
        try
        {
            num1 = Double.parseDouble(s1);
            num2 = Double.parseDouble(s2);
        }
        catch(NumberFormatException n)
        {
            JOptionPane.showMessageDialog(null, "You must enter a number","InputDataError", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
        catch(NullPointerException n)
        {
            JOptionPane.showMessageDialog(null, "You Pressed the Cancel Button", "Program Terminiation",JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
        average = (num1 + num2) / 2.0;
        
        JOptionPane.showMessageDialog(null, "The average of " + num1 + " and " + num2 + " is " + average,
        "QuickTest Program 4.5", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
