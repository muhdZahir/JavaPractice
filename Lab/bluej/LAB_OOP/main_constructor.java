
import java.util.Scanner;
//import java.lang.Math;
public class main_constructor
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        
        double r, h, l;
        
        System.out.println("Enter the radius(m) = ");
        r = input.nextDouble();
        System.out.println("Enter the height(m) = ");
        h = input.nextDouble();
        System.out.println("Enter the length(m) = ");
        l = input.nextDouble();
        
        Shape shape = new Shape(r,h,l);
        
        System.out.println("\nThe area of the circle is " +shape.area_circle());
        System.out.println("\nThe area of the triangle is " +shape.area_tri());
        System.out.println("\nThe area of the rectangle is " +shape.area_rect());
    }
}
