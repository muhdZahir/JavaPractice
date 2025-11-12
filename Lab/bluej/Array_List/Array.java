
/**
 * Write a description of class ArrayList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Array
{
    public static void main(String args[])
    {
        double arrayNum[] = {40.2, 5.8, 8.92, 10.56, 3.15, 7.99};
        
        double sum = 0.0;
        double avg = 0.0;
        for(int i=0; i < arrayNum.length; i++)
        {
            sum = sum + arrayNum[i];
        }
        avg = sum / arrayNum.length;
        System.out.println("Average value: " +avg);
        
        double highest = 0.0;
        for(int i=0; i < arrayNum.length; i++)
        {
            if(arrayNum[i] > highest)
            {
                highest = arrayNum[i];
            }
        }
        System.out.println("\nHighest value " +highest);
        
        System.out.println("\nThe value in the array:");
        for(int i=0; i < arrayNum.length; i++)
        {
            System.out.println(arrayNum[i]+ "\n");
        }
    }
}
