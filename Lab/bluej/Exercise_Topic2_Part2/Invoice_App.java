
/**
 * Write a description of class Invoice_App here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Invoice_App
{
    public static void main(String args[])
    {
        // a) Input 6 invoices into a sequential list named Invoice
        ArrayList <Invoice> Invoice = new ArrayList<>();
        Invoice Inv;
        
        Scanner input = new Scanner(System.in);
        
        for(int i = 0; i < 3; i++)
        {
            System.out.println("Enter order ID: ");
            int orderID = input.nextInt();
            System.out.println("Enter customer name: ");
            String custName = input.next();
            System.out.println("Enter product name: ");
            String prodName = input.next();
            System.out.println("Enter product quantity: ");
            int prodQuantity = input.nextInt();
            System.out.println("Enter unit price: RM ");
            double unitPrice = input.nextDouble();
            
            Inv = new Invoice(orderID, custName, prodName, prodQuantity, unitPrice);
            Invoice.add(Inv);
        }
        
        // b) Count the number of invoices where the unitPrice is more than RM5000, and
        //    also display the information of those invoices.
        int count = 0;
        System.out.println("\nInformation on invoices with unit price more RM5000: \n");
        for(int i = 0; i < Invoice.size(); i++)
        {
            Inv = Invoice.get(i);
            if(Inv.getUnitPrice() > 5000.0)
            {
                count++;
                System.out.println(Inv.getUnitPrice()+ "\n");
            }
        }
        System.out.println("\nThe number of invoices where the unit price is more than RM5000: " +count);
        
        /* c) Calculate the total payment of each invoices.
              The payment is calculated by multiplying prodQuantity and unitPrice */
        double payment = 0.0, highest = 0.0;
        int index = 0;
        for(int i = 0; i < Invoice.size(); i++)
        {
            Inv = Invoice.get(i);
            payment = Inv.getProdQuantity() * Inv.getUnitPrice();
            
            // d) Display the information of invoice that makes the highest payment
            if(payment > highest)
            {
                highest = payment;
                index = i;
            }
        }
        System.out.println("\nInformation of invoice that makes the highest payment: " +Invoice.get(index).toString());
    }
}
