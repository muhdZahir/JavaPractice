
/**
 * Write a description of class Arry here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
public class Arry
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int intArray[] = new int[10];
        
        for(int i=0; i < 10; i++)
        {
            System.out.println("Enter a number: ");
            intArray[i] = input.nextInt();
        }
        
        System.out.println("\nThe third value in array: " +intArray[2]);
        
        System.out.println("\nThe original value in array:");
        for(int i=0; i < 10; i++)
        {
            System.out.println(intArray[i]+ "\n");
        }
        
        int n = intArray.length;
        int temp = 0;
        for(int i = 0; i < n; i++)
        {
            for(int j = 1; j < (n-1); j++)
            {
                if(intArray[j-1] > intArray[j])
                {
                    temp = intArray[j-1];
                    intArray[j-1] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }
        
        boolean found = false;
        int low = 0, high = intArray.length - 1, key = 0;
        
        System.out.println("Enter the value to be search: ");
        key = input.nextInt();
        
        while(high >= low)
        {
            int mid = (low + high)/2;
            
            if(key<intArray[mid])
            {
                high = mid - 1;
            }
            else if(key == intArray[mid])
            {
                found = true;
                break;
            }
            else
            {
                low = mid + 1;
            }
        }
        
        if(found == true)
        {
            System.out.println("\n " +key+ " is found.");
        }
        else
        {
            System.out.println("\n " +key+ " is not found.");
        }
    }
}
