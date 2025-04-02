/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designprinciples;

/**
 *
 * @author Othman Family
 */
public class TestDivideByZero
{
    public static void main(String args[])
    {
        DivideByZero dbz = new DivideByZero();
        try
        {
            dbz.InputNumber();
            double result = dbz.Division();
            
            System.out.println("Result:" +result);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Number cannot be divide by zero");
        }
    }
}
