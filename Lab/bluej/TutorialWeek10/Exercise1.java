
/**
 * Write a description of class MainApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Exercise1
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        
        int num;
        System.out.println("Enter a number: ");
        num = input.nextInt();
        
        System.out.println("\nSums of " +num+ " until 1 using Iteration: " +sumIte(num));
        System.out.println("Sums of " +num+ " until 1 using Recursive: " +sumRec(num));
    }
    
    public static int sumIte(int x)
    {
        int sum = 0;
        for(int i = 1; i <= x; i++)
        {
            sum = sum + i;
        }
        return sum;
    }
    
    public static int sumRec(int x)
    {
        if(x > 1)
            return (x + sumRec(x - 1));
        else
            return 1;
    }
}
