
/**
 * Write a description of class House here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class House
{
    protected String tenant;
    protected String ICNo;
    protected String address;
    
    public House(String tenant, String ICNo, String address)
    {
        this.tenant = tenant;
        this.ICNo = ICNo;
        this.address = address;
    }
    
    public String getTenant() { return tenant; }
    public String getIC_No() { return ICNo; }
    public String getAdd() { return address; }
    
    public void display()
    {
        System.out.println("\nName: " +tenant+ "\nIC Number: " +ICNo+ "\nAddress: " +address);
    }
}
