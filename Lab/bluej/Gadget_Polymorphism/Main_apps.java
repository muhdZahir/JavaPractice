
/**
 * Write a description of class Main_apps here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
public class Main_apps
{
    public static void main(String args[])
    {
        Gadget g[]=new Gadget[6];
        
        Scanner input = new Scanner(System.in);
        
        String brand, modelName, connectivity;
        double price, screenSize, discountPercent;
        
        //a) Input a details into an array of object by store the mobile phone information in the even index
        //and tablet in the odd index
        for(int i = 1; i <= 6;i++)
        {
            if(i%2 == 0)
            {
                System.out.println("Enter the brand: ");
                brand = input.next();
                System.out.println("Enter the price: RM ");
                price = input.nextDouble();
                System.out.println("Enter the model name: ");
                modelName = input.next();
                System.out.println("Enter the screen size (inch): ");
                screenSize = input.nextDouble();
                System.out.println("Enter the discount percent: ");
                discountPercent = input.nextDouble();
                
                g[i] = new MobilePhone(brand, price, modelName, screenSize, discountPercent);
            }
            else
            {
                System.out.println("Enter the brand: ");
                brand = input.next();
                System.out.println("Enter the price: RM ");
                price = input.nextDouble();
                System.out.println("Enter the model name: ");
                modelName = input.next();
                System.out.println("Enter the screen size (inch): ");
                screenSize = input.nextDouble();
                System.out.println("Enter the connection: ");
                connectivity = input.next();
                
                g[i] = new Tablet(brand, price, modelName, screenSize, connectivity);
            }
        }
        
        //b) Display the details and number of gadget which screen size is between 5.5 inch until 10 inch
        int count = 0;
        System.out.println("\nDetails of gadgets with screen size between 5.5 & 10.0 inches: ");
        for(int i = 1; i <= 6;i++)
        {
            if(g[i].get_screenSize() >= 5.5 && g[i].get_screenSize() <= 10.0)
            {
                if(g[i] instanceof MobilePhone)
                {
                    System.out.println(g[i].toString());
                }
                else
                {
                    System.out.println(g[i].toString());
                }
                count++;
            }
        }
        System.out.println("\nNumber of gadgets with screen size between 5.5 & 10.0 inches: " +count);
        
        //c) Display the average price of tablet
        double tot_price = 0.0, avg = 0.0, num = 0.0;
        for(int i = 1; i <= 6;i++)
        {
            if(g[i] instanceof Tablet)
            {
                tot_price = tot_price + g[i].getPrice();
                num++;
            }
        }
        avg = tot_price/num;
        System.out.println("\nThe average price of tablet: RM " +avg);
        
        //d) Count the number of mobile phone
        int count_MobilePhone = 0;
        for(int i = 1; i <= 6;i++)
        {
            if(g[i] instanceof MobilePhone)
            {
                count_MobilePhone++;
            }
        }
        System.out.println("\nThe number of mobile phone: " +count_MobilePhone);
    }
}
