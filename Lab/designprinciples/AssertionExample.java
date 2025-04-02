package designprinciples;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Othman Family
 */
public class AssertionExample
{
    public static void main(String[] args)
    {
        int number = -5; // assumed number is not negative
        // This assert also serves as documentation
        assert (number >= 0): "number is negative: " + number; // check by developer based tester/qc/QA feedback
        // do something
        System.out.println("The number is " + number);
    }
}
