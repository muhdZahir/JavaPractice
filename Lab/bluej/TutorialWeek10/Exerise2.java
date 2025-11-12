
/**
 * Write a description of class Exerise2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Exerise2
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        
        int numX, numY;
        System.out.println("Enter X: ");
        numX = input.nextInt();
        System.out.println("Enter Y: ");
        numY = input.nextInt();
        
        System.out.println("When X is " +numX+ " and Y is " +numY+ "= " +F(numX, numY));
    }
    
    public static int F(int x, int y)
    {
        if(x == y)
            return 1;
        else if(x > y && y >= 1)
            return (F(x-2, y-1) + F(x, y-2));
        else
            return (x + y);
    }
}
