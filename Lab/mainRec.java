
public class mainRec
{
    public static void main(String args[])
    {
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle();
        
        rect1 = new Rectangle(4.0, 40.0, "red");
        rect2 = new Rectangle(3.5, 35.9, "red");
        
        System.out.println("Rectangle 1 Properties :-\nWidth: " +rect1.getWidth()+ "\nHeight: " +rect1.getHeight()+ "\nColor: " +rect1.getColor());
        System.out.println("\nRectangle 2 Properties :-\nWidth: " +rect2.getWidth()+ "\nHeight: " +rect2.getHeight()+ "\nColor: " +rect2.getColor());
        
        double area1 = rect1.getArea(rect1.getWidth(),rect1.getHeight());
        double peri1 = rect1.getPerimeter(rect1.getWidth(),rect1.getHeight());
        System.out.println("\nRectangle 1's area is  " +area1+ " and perimeter is " +peri1);
        
        double area2 = rect2.getArea(rect2.getWidth(),rect2.getHeight());
        double peri2 = rect2.getPerimeter(rect2.getWidth(),rect2.getHeight());
        System.out.println("\nRectangle 2's area is  " +area2+ " and perimeter is " +peri2);
    }
}
