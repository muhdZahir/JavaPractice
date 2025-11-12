
/**
 * class Airlines
 * {

    String flightNumber;          // AK77
    double discountRate;        // 0.05 
    double price;                 // 99.99

    //constructors
    //setter @ mutator methods
    //getter @ accessor methods
    
      processor method: findFlightOperator() to find and return the Flight 
    Operator based on the first two characters of flightNumber
    
    }
 */
public class Airlines
{
    private String flightNumber;
    private double discountRate;
    private double price;
    
    ///default constructor
    public Airlines()
    {
        flightNumber = " ";
        discountRate = 0.0;
        price = 0.0;
    }
    
    //setter method
    public void setAirlines(String flightNumber, double discountRate, double price)
    {
        this.flightNumber = flightNumber;
        this.discountRate = discountRate;
        this.price = price;
    }
    
    //getter methods
    public String getFlightNumber()
    { return flightNumber; }
    
    public double getDiscountRate()
    { return discountRate; }
    
    public double getPrice()
    { return price; } 
    
    //processor method
    public String findFlightOperator(String flightNumber)
    {
        String flightOperator = " ";
        
        if(flightNumber.substring(0,2).equalsIgnoreCase("AK"))
        flightOperator = "Airasia Airlines";
        else if(flightNumber.substring(0,2).equalsIgnoreCase("MH"))
        flightOperator = "Malaysia Airlines";
        else if(flightNumber.substring(0,2).equalsIgnoreCase("FY"))
        flightOperator = "Firefly Airlines";
        else
        flightOperator = "Manila Airlines";
        
        return flightOperator;
    }
    
    public String toString()
    {
        return ("Flight Number : " +flightNumber+ "\nDiscount Rate :" +discountRate+ "\nTicket Price : RM" +price);
    }
}
