
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

import java.util.Scanner;
public class BookingApp
{
    public static void main(String args[])
    {
        Person [] user = new Person[20];
        
        Scanner input = new Scanner(System.in);
        Scanner inputNum = new Scanner(System.in);
        Scanner inputText = new Scanner(System.in);
        
        int i, startTime, endTime;
        String eventName, venue, date, name, ID, address, contact;
        
        System.out.println("********** UiTM's Venues Booking System **********");
        
        for(i = 1; i <= 20; i++)
        {
            System.out.println("Enter the name of the person in charge: ");
            name = inputText.nextLine();
            System.out.println("Enter the ID: ");
            ID = inputText.next();
            System.out.println("Enter the address: ");
            address = inputText.next();
            System.out.println("Enter the contact number: ");
            contact = inputText.next();
            System.out.println("Enter the name of the event: ");
            eventName = inputText.next();
            System.out.println("Enter the venue (DT:Dewan Titiwangsa /DK300:Dewan Kuliah 300 / DK200:Dewan Kuliah 200) : ");
            venue = inputText.next();
            System.out.println("Enter the date: ");
            date = inputText.next();
            System.out.println("Enter the starting time of the event (in 24 hours): ");
            startTime = inputNum.nextInt();
            System.out.println("Enter the ending time of the event (in 24 hours): ");
            endTime = inputNum.nextInt();
            
            user [i] = new Person();
            user [i].setPerson(name, ID, address, contact, new Event(eventName, venue, date, startTime, endTime) );
            
            double hour;
            hour = user[i].calcBookingHours(startTime, endTime);
            
            String proceed;
            System.out.println("Do you wish to continue? (y-Yes /n-No)");
            proceed = inputText.next();
            
            if(proceed == "n")
                i = 20;
        }
    }
}
