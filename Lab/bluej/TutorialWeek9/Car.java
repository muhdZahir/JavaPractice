
/**
 * Write a description of class car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Car
{
    private String model;
    private String manufacturer;
    private int yearManufactured;
    private double price;
    
    public Car(String mo, String ma, int year, double pr)
    {
        model = mo;
        manufacturer = ma;
        yearManufactured = year;
        price = price;
    }
    
    public String getModel() { return model; }
    public String getManufacturer() { return manufacturer; }
    public int getYear() { return yearManufactured; }
    public double getPrice() { return price; }
    
    public String toString()
    {
        return ("\nModel: " +model+ "\nManufacturer: " +manufacturer+ "\nYear Manufactured: " +yearManufactured+
        "\nPrice: RM " +price);
    }
}
