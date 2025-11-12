

public class Shape
{
    private double r, h, l;
    
    public Shape(double radius, double height, double length)
    {
        this.r = radius;
        this.h = height;
        this.l = length;
    }
    
    public double area_circle()
    {
        double area = 3.142 * Math.pow(r,2);
        return area;
    }
    
    public double area_tri()
    {
        double area = 0.5 * h * l;
        return area;
    }
    
    public double area_rect()
    {
        double area = h * l;
        return area;
    }
}
