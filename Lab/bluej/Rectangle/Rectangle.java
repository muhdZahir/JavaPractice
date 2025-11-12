
/**
 * Write a description of class Rectangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rectangle
{
    private double width;
    private double length;
    
    public Rectangle(double width, double length)
    {
        this.width = width;
        this.length = length;
    }
    
    public void setWidth(double width)
    {  width = 0.0; }
    
    public void setLength(double length)
    { length = 0.0; }
    
    public double calcArea(double width, double length)
    {
        double area;
        area = width * length;
        return area;
    }
    
    public double getLength()
    {
        return length;
    }
    
    public double getWidth()
    {
        return length;
    }
    
    public String toString()
    {
        return ("Width: " +width+ "\nLength: " +length);
    }
}
