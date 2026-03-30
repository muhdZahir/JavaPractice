/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designprinciples;

/**
 *
 * @author Othman Family
 */
import java.util.Scanner;
public class DivideByZero
{
    private double num1;
    private double num2;
    
    public DivideByZero()
    {
        num1 = 0.0;
        num2 = 0.0;
    }
    
    public void InputNumber()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number:");
        num1 = sc.nextDouble();
        System.out.println("Enter Second Number:");
        num2 = sc.nextDouble();
    }
    
    public double Division()
    {
        double answer = 0;
        try
        {
            answer = num1 / num2;
            return answer;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Number cannot be divide by zero");
            return answer = 0;
        }
    }
}
