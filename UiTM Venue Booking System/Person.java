
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
    
    public String toString(int bookingType)
    {
        String detail;
        
        if(bookingType == 1)
        {
            detail = ("\nName : " +name+ "\n Staff ID : " +ID+ "\nAddress : " +address+ "\nContact Number : " +contact+ 
            "\nEvent Details : " +user.toString() );
        }
        else if(bookingType == 2)
        {
            detail =  ("\nName : " +name+ "\n Student ID : " +ID+ "\nAddress : " +address+ "\nContact Number : " +contact+ 
            "\nEvent Details : " +user.toString() );
        }
        else
        {
            detail = ("\nName : " +name+ "\n IC Number : " +ID+ "\nAddress : " +address+ "\nContact Number : " +contact+ 
            "\nEvent Details : " +user.toString() );
        }
        
        return detail;
    }
}
