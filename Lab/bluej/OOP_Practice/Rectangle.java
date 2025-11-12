
public class Rectangle extends Shape
{
    public double calculateArea(double length, double width)
    {
        double area = length * width;
        return area;
    }
    
    public double getPerimeter(double length, double width)
    {
        double perimeter = 2 * (length + width);
        return perimeter;
    }
}
