
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

import java.lang.Math;
import java.util.Scanner;
public class BookingApp
{
    public static void main(String args[])
    {
        Person [] user = new Person[20];
        
        Scanner input = new Scanner(System.in);
        
        int i, bookingType, count_DT = 0, count_DK300 = 0, count_DK200 = 0;
        double total_collection = 0.0;
        String eventName, venue, date, name, ID, address, contact, startTime, endTime;
        
        for(i = 1; i <= 20; i++)
        {
            System.out.println("Are you a UiTM Staff (1), student (2) or non-UiTM organisation/person (3)?");
            bookingType = input.nextInt();
            
            System.out.println("Enter the name of the person in charge: ");
            name = input.next();
            
            if(bookingType == 1 || bookingType == 2)
                System.out.println("Enter ID number: ");
            else
                System.out.println("Enter IC number: ");
            ID = input.next();
            
            System.out.println("Enter address: ");
            address = input.next();
            System.out.println("Enter contact number: ");
            contact = input.next();
            System.out.println("Enter the name of the event: ");
            eventName = input.next();
            System.out.println("DT:Dewan Titiwangsa /DK300:Dewan Kuliah 300 / DK200:Dewan Kuliah 200");
            System.out.println("Enter the venue: ");
            venue = input.next();
            
            if(venue.equalsIgnoreCase("DT"))
                count_DT++;
            else if(venue.equalsIgnoreCase("DK300"))
                count_DK300++;
            else
                count_DK200++;
            
            System.out.println("Enter the date: ");
            date = input.next();
            System.out.println("Enter the starting time of the event (in 24 hours): ");
            startTime = input.next();
            System.out.println("Enter the ending time of the event (in 24 hours): ");
            endTime = input.next();
            
            user [i] = new Person();
            user [i].setPerson(name, ID, address, contact, new Event(eventName, venue, date, startTime, endTime) );
            
            double usage_time;
            usage_time = user[i].getUser().calcBookingHours(startTime, endTime);
            
            double bookingCharge;
            bookingCharge = user[i].getUser().calcCharge(ID, venue, usage_time);
            
            total_collection = total_collection + bookingCharge;
            
            System.out.println("********** UiTM's Venues Booking System **********");
            System.out.println("Booking " +i);
            System.out.println("\nPerson in Charge Detail: " +user[i].toString(bookingType) );
            System.out.println("\nUsage hour: " +usage_time+ " hours");
            System.out.println("\nBooking Charge: RM " +bookingCharge);
            
            String proceed;
            System.out.println("\nDo you wish to continue? (y-Yes /n-No)");
            proceed = input.next();
            
            if(proceed.equalsIgnoreCase("n"))
                i = 21;
        }
        
        System.out.println("\nTotal booking for each venue.");
        System.out.println("\nDewan Titiwangsa: " +count_DT);
        System.out.println("\nDewan Kuliah 300: " +count_DK300);
        System.out.println("\nDewan Kuliah 200: " +count_DK200);
        
        System.out.println("\nTotal collection: RM " +total_collection);
    }
}
