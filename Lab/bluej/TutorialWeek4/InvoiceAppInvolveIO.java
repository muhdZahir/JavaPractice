
/**
 * Write a description of class InvoiceApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.*;
import java.io.*;
public class InvoiceAppInvolveIO
{
    public static void main(String args[])throws IOException
    {
        try
        {
            //a) Read the data from input file named invoiceData.txt, store into ArrayList named invoiceList
            ArrayList<Invoice> invoiceList = new ArrayList<>();
            Invoice inv;
            
            FileReader fr = new FileReader("invoiceData.txt");
            BufferedReader br = new BufferedReader(fr);
            
            String line = null;
            int orderID = 0, prodQuantity = 0;
            String custName = null, prodName = null;
            double unitPrice = 0.0;
            
            line = br.readLine();
            while(line != null)
            {
                StringTokenizer st = new StringTokenizer(line,";");
                orderID = Integer.parseInt(st.nextToken());
                custName = st.nextToken();
                prodName = st.nextToken();
                prodQuantity = Integer.parseInt(st.nextToken());
                unitPrice = Double.parseDouble(st.nextToken());
                
                inv = new Invoice(orderID, custName, prodName, prodQuantity, unitPrice);
                invoiceList.add(inv);
                
                line = br.readLine();
            }
            
            //b) Display the data in the ArrayList
            System.out.println("\nData in the array: \n");
            for(int i = 0; i < invoiceList.size(); i++)
            {
                System.out.println(invoiceList.get(i).toString()+ "\n");
            }
            
            //c) Write into the output file named highLowQty.txt the highest and lowest quantity of the product
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("highLowQty.txt")));
            pw.println("Highest and lowest quantity of the product");
            int highest = 0, lowest = 9999;
            for(int i = 0; i < invoiceList.size(); i++)
            {
                inv = invoiceList.get(i);
                
                if(inv.getProdQuantity() > highest)
                { highest = inv.getProdQuantity(); }
                else if(inv.getProdQuantity() < lowest)
                { lowest = inv.getProdQuantity(); }
                else
                { continue; }
            }
            pw.println("Highest quantity of product: " +highest);
            pw.println("Lowest quantity of product: " +lowest);
            
            br.close();
            pw.close();
        }
        
        catch(EOFException eof)
        { System.out.println("Problem: " +eof.getMessage()); }
        catch(FileNotFoundException e)
        { System.out.println("Problem: "+e.getMessage()); }
        catch(IOException ioe)
        { System.out.println("Problem: "+ioe.getMessage()); }
        finally
        { System.out.println("End of the program"); }
    }
}
