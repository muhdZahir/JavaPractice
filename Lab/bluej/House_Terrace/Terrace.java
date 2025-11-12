
/**
 * Write a description of class Terrace here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Terrace extends House
{
    private String type;
    private String status;
    
    public Terrace(String tenant, String ICNo, String address, String type, String status)
    {
        super(tenant, ICNo, address);
        this.type = type;
        this.status = status;
    }
    
    public String getType() { return type; }
    public String getStatus() { return status; }
    
    public double calcRent(String type, String status)
    {
        double rent = 0.0;
        
        if(type.equalsIgnoreCase("Single-storey"))
        {
            if(status.equalsIgnoreCase("Yes"))
                rent = 2000.0;
            else
                rent = 1500.0;
        }
        else
        {
            if(status.equalsIgnoreCase("Yes"))
                rent = 3000.;
            else
                rent = 2500.0;
        }
        
        return rent;
    }
    
    public void display()
    {
        System.out.println("\nName: " +super.tenant+ "\nIC Number: " +super.ICNo+ "\nAddress: " +super.address+ 
        "\nTerrace type: " +type+ "\nCorner lot status: " +status);
    }
}
