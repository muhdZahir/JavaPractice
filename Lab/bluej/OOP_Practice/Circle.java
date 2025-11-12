
public class Circle extends Shape
{
    public double calculateArea(double radius)
    {
        double area = 3.142 * Math.pow(radius,2);
        return area;
    }
    
    public double getPerimeter(double radius)
    {
        double peri = 2 * 3.142 * radius;
        return peri;
    }
}
