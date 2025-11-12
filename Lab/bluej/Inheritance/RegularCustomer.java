
/**
 * Write a description of class RegularCustomer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RegularCustomer extends Customer
{
    private double discount;
    
    public RegularCustomer(int id, double price, int qty, double discount)
    {
        super(id, price, qty);
        this.discount = discount;
    }
    
    public double getDiscount() { return discount; }
    
    public void display()
    {
        System.out.println("ID Number: " +IdNum+ "\nPrice: RM " +price+ "\nQuantity: " +quantity+ "\nDiscount: "+discount);
    }
}
