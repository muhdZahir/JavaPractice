
import java.util.Scanner;
public class _5numApp
{
    public static void main(String args[])
    {
        Scanner inputNum = new Scanner(System.in);
        
        int num[] = new int[5];
        
        for(int i=0;i < num.length;i++)
        {
            System.out.println("Enter a number: ");
            num[i] = inputNum.nextInt();
        }
        
        for(int i=0;i < num.length;i++)
        {
            System.out.println("\nNumber:" +num[i]);
        }
    }
}
