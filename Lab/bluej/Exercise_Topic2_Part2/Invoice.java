
/**
 * Write a description of class Invoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Invoice
{
    private int orderID;
    private String custName;
    private String prodName;
    private int prodQuantity;
    private double unitPrice;        
    
    public Invoice(int oid, String cn, String pn, int pq, double up)
    {
        orderID = oid;
        custName = cn;
        prodName = pn;
        prodQuantity = pq;
        unitPrice = up;
    }
    
    public int getOrderID()
    {
        return orderID;
    }
    
    public String getCustName()
    {
        return custName;
    }
    
    public String getProdName()
    {
        return prodName;
    }
    
    public int getProdQuantity()
    {
        return prodQuantity;
    }
    
    public double getUnitPrice()
    {
        return unitPrice;
    }
    
    public String toString()
    {
        return("\nOrder ID: " +orderID+ "\nCustomer Name: " +custName+ "\nProduct Name: " +prodName+
        "\nQuantity of Product: " +prodQuantity+ "\nUnit Price: " +unitPrice);
    }
}
