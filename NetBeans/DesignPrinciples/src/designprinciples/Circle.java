/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designprinciples;

/**
 *
 * @author Othman Family
 */
public class Circle
{
    protected double radius;
    
    public Circle()
    {
        radius = 1.0;
    }
    
    public Circle(double radius)
    { 
        this.radius = radius;
    }
    
    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }
    
    public double findArea()
    { 
        return radius * radius * 3.14159;
    }
}
