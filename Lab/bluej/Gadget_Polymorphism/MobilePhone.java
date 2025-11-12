
/**
 * Write a description of class Mobile_Phone here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MobilePhone extends Gadget
{
    private double discountPercent;
    
    public MobilePhone(String brand, double price, String modelName, double screenSize, double discountPercent)
    {
        super(brand, price, modelName, screenSize);
        this.discountPercent = discountPercent;
    }
    
    public void set_MobilePhone()
    {
        super.setGadget();
        this.discountPercent = discountPercent;
    }
    
    public double discountPercent() { return discountPercent; }
    
    public String toString()
    {
        return(super.toString()+ "\nDiscount Percentage: " +discountPercent);
    }
    
    public double calculatePrice(double discountPercent)
    {
        double newPrice;
        newPrice = super.calculatePrice(price) - (super.price * discountPercent);
        
        return newPrice;
    }
}
