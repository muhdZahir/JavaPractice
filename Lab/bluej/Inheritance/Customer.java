
/**
 * Write a description of class Customer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Customer
{
    protected int IdNum;
    protected double price;
    protected int quantity;
    
    public Customer(int ID, double price, int qty)
    {
        this.IdNum = ID;
        this.price = price;
        this.quantity = qty;
    }
    
    public int getID() { return IdNum; }
    public double getPrice() { return price; }
    public int getQty() { return quantity; }
    
    public void display()
    {
        System.out.println("ID Number: " +IdNum+ "\nPrice: RM " +price+ "\nQuantity: " +quantity);
    }
}
