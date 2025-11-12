
/**
 * Write a description of class Main_Apps here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
public class Main_Apps
{
    public static void main(String args[])
    {
        Scanner inputText = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        int size = 2;
        Terrace [] T = new Terrace[size];
        
        String name, IC_no, address, type, status;
        
        for(int i = 0; i < size; i++)
        {
            System.out.println("Enter the tenant's name: ");
            name = inputText.nextLine();
            System.out.println("Enter IC Number: ");
            IC_no = input.next();
            System.out.println("Enter the address: ");
            address = input.next();
            System.out.println("Enter the type of house: ");
            type = input.next();
            System.out.println("Enter corner lot status: ");
            status = input.next();
            T[i] = new Terrace(name, IC_no, address, type, status);
        }
        
        int count = 0;
        System.out.println("\nTenants who reside in double-storey corner lots");
        for(int i = 0; i < size; i++)
        {
            if(T[i].getType().equalsIgnoreCase("Double-storey"))
            {
                count++;
                System.out.println((i+1)+ "\n");
                T[i].display();
            }
        }
        System.out.println("\nThe number of tenants residing in double-storey corner lots: " +count);
        
        double rent = 0.0;
        for(int i = 0; i < size; i++)
        {
            rent = rent + T[i].calcRent(T[i].getType(), T[i].getStatus());
        }
        System.out.println("\nThe total rent the company should collect for the month: RM" +rent);
        
        for(int i = 0; i < size; i++)
        {
            if(T[i].getTenant().equalsIgnoreCase("Ali bin Abu"))
                System.out.println("\nThe type of house rented by a tenant named Ali bin Abu: " +T[i].getType());
        }
    }
}
