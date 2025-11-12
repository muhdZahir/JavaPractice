
/**
 * Write a description of class UnivMantap here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class UnivMantap
{
    public static void main(String args[])
    {
        //a) Create two queue variable with data type String named boothQ and tempQ
        Queue <String> boothQ = new Queue<>();
        Queue <String> tempQ = new Queue<>();
        
        //b) Store the given value into boothQ: A02001, A02002,B01001,C02001,B02001,B01003
        boothQ.enqueue("A02001");
        boothQ.enqueue("A02002");
        boothQ.enqueue("B01001");
        boothQ.enqueue("C02001");
        boothQ.enqueue("B02001");
        boothQ.enqueue("B01003");
        
        //c) Input 5 more booth number and store into boothQ
        Scanner input = new Scanner(System.in);
        String booth_no;
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Enter a booth number: ");
            booth_no = input.next();
            boothQ.enqueue(booth_no);
        }
        
        //d) Display the content of boothQ
        String data;
        System.out.println("\nThe content of boothQ: ");
        while(!boothQ.isEmpty())
        {
            data = boothQ.dequeue();
            System.out.println(data);
            tempQ.enqueue(data);
        }
        
        //e) Display the booth number for B category.
        System.out.println("\nBooth number of B category: ");
        while(!tempQ.isEmpty())
        {
            data = tempQ.dequeue();
            if(data.substring(0,1).equalsIgnoreCase("B"))
                System.out.println(data);
            boothQ.enqueue(data);
        }
        
        //f) Display the count of group for A, B and C category
        int countA = 0, countB = 0, countC = 0;
        while(!boothQ.isEmpty())
        {
            data = boothQ.dequeue();
            if(data.substring(0,1).equalsIgnoreCase("A"))
                countA++;
            else if(data.substring(0,1).equalsIgnoreCase("B"))
                countB++;
            else
                countC++;
            tempQ.enqueue(data);
        }
        System.out.println("\nCount of A category: " + countA);
        System.out.println("\nCount of B category: " + countB);
        System.out.println("\nCount of C category: " + countC);
        
        //g) Display the count of group that join the invention category.
        int countInv = 0;
        while(!tempQ.isEmpty())
        {
            data = tempQ.dequeue();
            if(data.substring(1,3).equalsIgnoreCase("01"))
                countInv++;
            boothQ.enqueue(data);
        }
        System.out.println("\nCount of group that join the invention category: " +countInv);
    }
}
