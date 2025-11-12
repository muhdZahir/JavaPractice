
public class Triangle extends Shape
{
    public double calculateArea(double height, double base)
    {
        double area = 0.5 * height * base;
        return area;
    }
    
    public double getPerimeter(double base, double side1, double side2)
    {
        double perimeter = base + side1 + side2;
        return perimeter;
    }
}
