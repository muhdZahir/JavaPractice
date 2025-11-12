
/**
 * Write a description of class mainApps here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
public class mainApps
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        
        RegularCustomer [] R = new RegularCustomer[4];
        int ID, qty;
        double price, discount;
        
        //i. Input a detail for regular customer, declare and create an array of object named R with RegularCustomer data type.
        // The size of array is 4.    
        for(int i = 0; i < 4; i++)
        {
            System.out.println("Enter ID number: ");
            ID = input.nextInt();
            System.out.println("Enter the price: ");
            price = input.nextDouble();
            System.out.println("Enter the quantity: ");
            qty = input.nextInt();
            System.out.println("Enter the discount: ");
            discount = input.nextDouble();
            R[i] = new RegularCustomer(ID, price, qty, discount);
        }
        
        //ii. Display the highest quantity
        int highest = 0;
        for(int i = 0; i < 4; i++)
        {
            if(R[i].getQty() > highest)
                highest = R[i].getQty();
        }
        System.out.println("\nThe highest quantity: " +highest);
        
        //iii. Display the details of regular customer that have the lowest total price after discount
        double totalPrice = 0.0;
        double lowest = 100.0;
        int index = 0;
        for(int i = 0; i < 4; i++)
        {
            totalPrice = (R[i].getPrice() * R[i].getQty()) * (1 - R[i].getDiscount());
            
            if(totalPrice < lowest)
            {
                lowest = totalPrice;
                index = i;
            }
        }
        System.out.println("\nDetails of the regular customer that have the lowest total price after discount: \n");
        R[index].display();
        
        //iv. Display the list of regular customer that buy the item more than 10(quantity more than 10).
        System.out.println("\nThe list of regular customer that buy items more than 10: \n");
        for(int i = 0; i < 4; i++)
        {
            if(R[i].getQty() > 10)
            {
                System.out.println(i);
                R[i].display();
            }
        }
    }
}
