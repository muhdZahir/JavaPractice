import java.util.Scanner;
public class method
{
    static double speed(double d, double t)
    {
        double spd = d / t;
        return spd;
    }
    
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        
        double distance, time;
        
        System.out.println("Enter the distance(m) = ");
        distance = input.nextDouble();
        
        System.out.println("Enter the time(s) = ");
        time = input.nextDouble();
        
        double speed = speed(distance,time);
        
        System.out.println("The speed is " + speed);
    }
}
