
import java.util.Scanner;
public class infinitenumber
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        
        int num;
        String yes = "y";
        
        while(yes.equalsIgnoreCase("y"))
        {
            System.out.println("Enter a number: ");
            num = input.nextInt();
            
            System.out.println("\nNumber: " +num);
            
            System.out.println("\nPress y to continue, otherwise it will stop the loop.");
            yes = input.next();
        }
    }
}
