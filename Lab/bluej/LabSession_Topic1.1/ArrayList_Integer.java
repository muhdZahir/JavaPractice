
/**
 * Write a description of class ArrayList_Integer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class ArrayList_Integer
{
    public static void main(String args[])
    {
        // a) Declare the ArrayList of Integer datatype named numArr
        ArrayList <Integer> numArr = new ArrayList <Integer>();
        
        // b) Add the value of 16,1,77,5,2,77 into an array
        numArr.add(16);
        numArr.add(1);
        numArr.add(77);
        numArr.add(5);
        numArr.add(2);
        numArr.add(77);
        
        // c) Input 3 more values from user
        Scanner input = new Scanner(System.in);
        
        int num = 0;
        for(int i = 0; i < 3; i++)
        {
            System.out.println("Enter a number: ");
            num = input.nextInt();
            numArr.add(num);
        }
        
        // d) Display the size of numArr
        System.out.println("\nThe size of numArr: " +numArr.size());
        
        // e) Display the highest value of numArr
        int highest = numArr.get(0);
        for(int i = 0; i < numArr.size(); i++)
        {
            if(numArr.get(i) > highest)
            {
                highest = numArr.get(i);
            }
        }
        System.out.println("\nThe highest value of numArr: " +highest);
        
        // f) Display the sum value of numArr
        int sum = 0;
        for(int i = 0; i < numArr.size(); i++)
        {
            sum = sum + numArr.get(i);
        }
        System.out.println("\nThe sum value of numArr: " +sum);
        
        // g) Remove the content of index 2
        numArr.remove(2);
        
        // h) Declare another ArrayList named evenArr 
        ArrayList <Integer> evenArr = new ArrayList<>();
        
        // i) Copy the value of even number into evenArr and remove the even number values in the numArr ArrayList
        for(int i = 0; i < numArr.size(); i++)
        {
            if(numArr.get(i) % 2 == 0)
            {
                evenArr.add(numArr.get(i));
                numArr.remove(i);
                i--;
            }
        }
        
        // j) Display the content of numArr and evenArr
        System.out.println("\nContent of numArr: \n");
        for(int i = 0; i < numArr.size(); i++)
        {
            System.out.println(numArr.get(i));
        }
        
        System.out.println("\nContent of evenArr: \n");
        for(int i = 0; i < evenArr.size(); i++)
        {
            System.out.println(evenArr.get(i));
        }
        
        // k) Sort the value of evenArr using insertion sort and display the sorted value
        for(int i = 1; i < evenArr.size(); i++)
        {
            int key = evenArr.get(i);
            int j = i - 1;
            while(j >= 0 && evenArr.get(j) > key)
            {
                evenArr.set(j+1, evenArr.get(j));
                j = j - 1;
            }
            evenArr.set(j+1, key);
        }
        
        System.out.println("\nValue after sorted: \n");
        for(int i = 0; i < evenArr.size(); i++)
        {
            System.out.println(evenArr.get(i));
        }
    }
}
