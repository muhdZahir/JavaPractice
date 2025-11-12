
/**
 * Write a description of class Exercise1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.*;
public class Exercise1
{
    public static void main(String args[])
    {
        Stack<Integer> st = new Stack<Integer>();
        Stack<Integer> temp = new Stack<Integer>();
        
        //a) Input a temperature(in celcius) for a week and insert into stack
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a temperature for a week: ");
        for(int i = 0; i < 7; i++)
        {
            System.out.print((i + 1) + ": ");
            int temperature = input.nextInt();
            st.push(temperature);
        }
        
        //b) Display all the temperature input by user
        System.out.println("\nAll temperature input by user: ");
        Integer data;
        while(!st.isEmpty())
        {
            data = st.pop();
            System.out.println(data);
            temp.push(data);
        }
        
        //c) Display the average temperature
        int sum = 0, avg, count = 0;
        while(!temp.isEmpty())
        {
            data = temp.pop();
            sum += data;
            st.push(data);
            count++;
        }
        avg = sum / count;
        System.out.println("\nAverage temperature: " +avg);
        
        //d) Display the temperature that more than 30 degree celcius
        System.out.println("\nTemperature that is more than 30 degree celcius: ");
        while(!st.isEmpty())
        {
            data = st.pop();
            if(data > 30)
                System.out.println(data);
            temp.push(data);
        }
    }
}
