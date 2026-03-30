/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designprinciples;

/**
 *
 * @author Othman Family
 */
import javax.swing.*;
public class TestCircle
{
    public static void main(String args[])
    {
        double newRad;
        try
        {
            CircleUI c1 = new CircleUI();
            newRad = c1.getRadius();
            c1.setRadius(newRad);
            c1.calculateArea(newRad);
        }
        catch(NegativeNumberException e)
        {
            JOptionPane.showMessageDialog(null, "radius cannot be negative");
        }
    }
}
