
/*****************************
PROGRAMMER #1
Name:
Student ID:
Group:
Phone Number:

PROGRAMMER #2
Name:
Student ID:
Group:
Phone Number:

PROGRAMMER #3
Name:
Student ID:
Group:
Phone Number:

PROGRAMMER #4
Name:
Student ID:
Group:
Phone Number:

*****************************/

public class Event
{
    private String eventName;
    private String venue;
    private String date;
    private int startTime;
    private int endTime;
    
    public Event()
    {
        eventName = " ";
        venue = " ";
        date = " ";
        startTime = 0;
        endTime = 0;
    }
    
    public Event(String eventName, String venue, String date, int startTime, int endTime)
    {
        this.eventName = eventName;
        this.venue = venue;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
    }
    
    public void setEvent(String eventName, String venue, String date, int startTime, int endTime)
    {
        this.eventName = eventName;
        this.venue = venue;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
    }
    
    public String getEventName() { return eventName; }
    public String getVenue() { return venue; }
    public String getDate() { return date; }
    public int getStartTime() { return startTime; }
    public int getEndTime() { return endTime; }
    
    public String toString()
    {
        return ("Event Name : "+eventName+"\nVenue : "+venue+"\nDate : "+date+"\nTime(start) : "
        +startTime+ "\nTime(end) : "+endTime);
    }
    
    public double calcBookingHours(int startTime, int endTime)
    {
        double hour;
        
        System.out.println("Kiralah sendiri");
        hour = ( (endTime * 60) - (startTime * 60) )/ 100;
        System.out.println("Masukkan value nya eh!");
        return hour;
    }
    
    public double calcCharge(String ID, String venue, int hour)
    {
        double charge;
        
        if(ID.length() > 10)
        {
            if(venue.equalsIgnoreCase("DT"))
                charge = 300.0 * hour;
            else if(venue.equalsIgnoreCase("DK300"))
                charge = 150.0 * hour;
            else
                charge = 100.0 * hour;
        }
        else
            charge = 0.0;
        
        return charge;
    }
}
