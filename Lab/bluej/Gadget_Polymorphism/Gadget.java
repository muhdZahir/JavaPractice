
/**
 * Write a description of class Gadget here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Gadget
{
    protected String brand;
    protected double price;
    protected String modelName;
    protected double screenSize;
    
    public Gadget(String brand, double price, String modelName, double screenSize)
    {
        this.brand = brand;
        this.price = price;
        this.modelName = modelName;
        this.screenSize = screenSize;
    }
    
    public void setGadget()
    {
        this.brand = brand;
        this.price = price;
        this.modelName = modelName;
        this.screenSize = screenSize;
    }
    
    public String getBrand() { return brand; }
    public double getPrice() { return price; }
    public String get_modelName() { return modelName; }
    public double get_screenSize() { return screenSize; }
    
    public String toString()
    {
        return ("\nBrand Name: " +brand+ "\nRM: " +price+ "\nModel Name: " +modelName+ "\nScreen size (inch): " +screenSize);
    }
    
    public double calculatePrice(double price)
    {
        double newPrice;
        newPrice = price + (price * 0.06);
        
        return newPrice;
    }
}
