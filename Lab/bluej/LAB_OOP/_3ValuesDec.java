import java.util.Scanner;
public class _3ValuesDec
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        double[] num = new double[3];
        double total = 0.0, avg;
        
        for(int i = 0; i < num.length; i++)
        {
            System.out.println("Enter decimal number:");
            num[i] = sc.nextDouble();
            
            total += num[i];
        }
        System.out.println("The total is " +total);
        
        avg = total / num.length;
        System.out.println("The average is "+avg);
    }
}
