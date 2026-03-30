/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designprinciples;

/**
 *
 * @author Othman Family
 */
public class Cylinder extends Circle
{
    private double length;
    
    public Cylinder()
    {
        super ();
        length = 1.0;
    }
    
    public Cylinder (double radius,double length)
    {
        super (radius);
        this.length = length;
    }
    
    public double getLength() { return length; }
    public void setLength(double length) { this. length = length; }
    
    public double findArea()
    {
        return 2 * super.findArea() + 2 * getRadius() * Math.PI * length;
    }
}
