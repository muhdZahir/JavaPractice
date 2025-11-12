
/**
 * Write a description of class Tablet here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tablet extends Gadget
{
    private String connectivity;
    
    public Tablet(String brand, double price, String modelName, double screenSize, String connectivity)
    {
        super(brand, price, modelName, screenSize);
        this.connectivity = connectivity;
    }
    
    public void setTablet()
    {
        super.setGadget();
        this.connectivity = connectivity;
    }
    
    public String getConnect() { return connectivity; }
    
    public String toString()
    {
        return(super.toString()+ "\nConnection: " +connectivity);
    }
}
