import java.util.Scanner;
public class ShapeApp
{
    public static void main(String args[])
    {
        Rectangle r = new Rectangle();
        Triangle t = new Triangle();
        Circle c = new Circle();
        
        Scanner sc = new Scanner(System.in);
        
        double length, width, height, base, side1, side2, radius;
        double rectArea, triaArea, cirArea, rectPeri, triaPeri, cirPeri;
        
        System.out.println("Enter length:");
        length = sc.nextDouble();
        System.out.println("Enter width:");
        width = sc.nextDouble();
        System.out.println("Enter height:");
        height = sc.nextDouble();
        System.out.println("Enter side1:");
        side1 = sc.nextDouble();
        System.out.println("Enter side2:");
        side2 = sc.nextDouble();
        System.out.println("Enter base:");
        base = sc.nextDouble();
        System.out.println("Enter radius:");
        radius = sc.nextDouble();
        
        rectArea = r.calculateArea(length, width);
        System.out.println(rectArea);
        rectPeri = r.getPerimeter(length, width);
        System.out.println(rectPeri);
        
        triaArea = t.calculateArea(height, base);
        System.out.println(triaArea);
        triaPeri = t.getPerimeter(base, side1, side2);
        System.out.println(triaPeri);
        
        cirArea = c.calculateArea(radius);
        System.out.println(cirArea);
        cirPeri = c.getPerimeter(radius);
        System.out.println(cirPeri);
    }
}
