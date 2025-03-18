
public class Rectangle
{
    private double width;
    private double height;
    private String color;
    
    public Rectangle()
    {
        width = 1.0;
        height = 1.0;
        color = "white";
    }
    
    public Rectangle(double w, double h, String c)
    {
        width = w;
        height = h;
        color = c;
    }
    
    public void setWidth(double w) { width = w; }
    public void setHeight(double h) { height = h; }
    public void setColor(String c) { color = c; }
    
    public double getWidth() { return width; }
    public double getHeight() { return height; }
    public String getColor() { return color; }
    
    public double getArea(double w, double h)
    {
        double area = w * h;
        return area;
    }
    
    public double getPerimeter(double w, double h)
    {
        double peri = 2 * (w + h);
        return peri;
    }
}
