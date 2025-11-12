
/****************************
PROGRAMMER #1 
Name: MUHAMMAD ZAHIRUDDIN BIN OTHMAN
Student ID: 2020892534 
Group: CS1102D 
Phone Number: 018-2176586 

PROGRAMMER #2 
Name: MUHAMMAD NOOR AZIZUDDIN AZMI
Student ID: 2020855822
Group: CS1102D
Phone Number: 011-23825182

PROGRAMMER #3 
Name: MURNI NOR ERNA BINTI MUHAMAD RAMLI
Student ID: 2020842904
Group: CS1102D
Phone Number: 018-3918447

PROGRAMMER #4
Name: NUR AISYA SAFIYYAH BINTI AZMAN
Student ID: 2020457886
Group: CS1102D
Phone Number: 010-8717908 

*****************************/ 

public class Event
{
    private String eventName;
    private String venue;
    private String date;
    private String startTime;
    private String endTime;
    
    public Event()
    {
        eventName = " ";
        venue = " ";
        date = " ";
        startTime = " ";
        endTime = " ";
    }
    
    public Event(String eventName, String venue, String date, String startTime, String endTime)
    {
        this.eventName = eventName;
        this.venue = venue;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
    }
    
    public void setEvent(String eventName, String venue, String date, String startTime, String endTime)
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
    public String getStartTime() { return startTime; }
    public String getEndTime() { return endTime; }
    
    public String toString()
    {
        return ("\nEvent Name : "+eventName+"\nVenue : "+venue+"\nDate : "+date+"\nTime(start) : "
        +startTime+ "\nTime(end) : "+endTime);
    }
    
    public double calcBookingHours(String startTime, String endTime)
    {
        double usage_time, hour,  min;;
        String startHr, startMin, endHr, endMin;
        
        startHr = startTime.substring(0,2);
        startMin = startTime.substring(2,4);
        endHr = endTime.substring(0,2);
        endMin = endTime.substring(2,4);
        
        double iStartHr = Double.valueOf(startHr);
        double iStartMin = Double.valueOf(startMin);
        double iEndHr = Double.valueOf(endHr);
        double iEndMin = Double.valueOf(endMin);
        
        hour = (iEndHr - iStartHr) * 60;
        
        if(iStartMin == iEndMin)
            min = 0;
        else if(iStartMin > iEndMin)
        {
            min = 60 - (iStartMin - iEndMin) ;
            hour = hour - 60;
        }
        else
            min = iEndMin - iStartMin;
        
        usage_time = (hour + min) / 60;
        
        return usage_time;
    }
    
    public double calcCharge(String ID, String venue, double usage_time)
    {
        double charge;
        
        if(ID.length() > 10)
        {
            if(venue.equalsIgnoreCase("DT"))
                charge = 300.0 * usage_time;
            else if(venue.equalsIgnoreCase("DK300"))
                charge = 150.0 * usage_time;
            else
                charge = 100.0 * usage_time;
        }
        else
            charge = 0.0;
        
        return charge;
    }
}
