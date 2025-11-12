
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

public class Person
{
    private String name;
    private String ID;
    private String address;
    private String contact;
    private Event user;
    
    public Person()
    {
        name = " ";
        ID = " ";
        address = " ";
        contact = " ";
        user = new Event();
    }
    
    public Person(String name, String ID, String address, String vontact, Event user)
    {
        this.name = name;
        this.ID = ID;
        this.address = address;
        this.contact = contact;
        this.user = user;
    }
    
    public void setPerson(String name, String ID, String address, String contact, Event user)
    {
        this.name = name;
        this.ID = ID;
        this.address = address;
        this.contact = contact;
        this.user = user;
    }
    
    public String getName() { return name; }
    public String getID() { return ID; }
    public String getAddress() { return address; }
    public String getContact() { return contact; }
    public Event getUser() { return user; }
    
    public String toString()
    {
        return ("\nName : " +name+ "\nID : " +ID+ "Address : " +address+ "Contact Number : " +contact+ 
        "Event Details : " +user.toString() );
    }
}
