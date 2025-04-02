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
import java.text.DecimalFormat;
public class CircleUI
{
    private double radius;
    
    public double getRadius()
    {
        String rad;
        rad = JOptionPane.showInputDialog("Enter radius:");
        radius = Double.parseDouble(rad);
        return radius;
    }
    
    public void setRadius(double newRadius)throws NegativeNumberException
    {
        if(newRadius > 0)
            radius = newRadius;
        else
            throw new NegativeNumberException("Radius cannot be in negative");
    }
    
    public void calculateArea(double rad)
    {
        DecimalFormat y = new DecimalFormat("0.00");
        double area;
        area = 3.142 * Math.pow(rad, 2);
        JOptionPane.showMessageDialog(null, "Area is " +y.format(area));
    }
}
