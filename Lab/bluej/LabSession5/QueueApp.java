
/**
 * Write a description of class QueueApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class QueueApp
{
    public static void main(String args[])
    {
        //a) Input 3 integer numbers and store into Queue data structure named numQ.
        Queue <Integer> numQ = new Queue<>();
        Queue <Integer> tempQ = new Queue<>();
        
        Scanner input = new Scanner(System.in);
        int num;
        for(int i = 0; i < 3; i++)
        {
            System.out.println("Enter a number: ");
            num = input.nextInt();
            numQ.enqueue(num);
        }
        
        //b) Input a list of numbers and store into numQ. The input process will stop when user choose “No”.
        String more = "yes";
        while(more.equalsIgnoreCase("yes"))
        {
            System.out.println("Enter a number: ");
            num = input.nextInt();
            numQ.enqueue(num);
            
            System.out.println("Want to input more numbers?(yes/no): ");
            more = input.next();
        }
        
        //c) Display the data in the numQ in the given format:
        int count = 0;
        Integer data;
        System.out.println("\nThe list of number in numQ: ");
        while(!numQ.isEmpty())
        {
            data = numQ.dequeue();
            count++;
            System.out.println("\n#" +count+ ": " +data);
            tempQ.enqueue(data);
        }
        
        //d) Display the highest value in the numQ.
        int highest = 0;
        while(!tempQ.isEmpty())
        {
            data = tempQ.dequeue();
            if(data > highest)
                highest = data;
            numQ.enqueue(data);
        }
        System.out.println("\nThe highest value in numQ: " +highest);
        
        //e) Display the average of the value in the numQ.
        int sum = 0, avg;
        while(!numQ.isEmpty())
        {
            data = numQ.dequeue();
            sum += data;
            tempQ.enqueue(data);
        }
        avg = sum/count;
        System.out.println("\nThe average value in numQ: " +avg);
        
        //f) Store the number that can be divided by 5 into div5Q
        Queue <Integer> div5Q = new Queue<>();
        while(!tempQ.isEmpty())
        {
            data = tempQ.dequeue();
            if(data%5 == 0)
                div5Q.enqueue(data);
            else
                numQ.enqueue(data);
        }
    }
}
