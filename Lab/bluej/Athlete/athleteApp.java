import java.util.Scanner;
import java.lang.Math;
public class athleteApp
{
    public static void main(String args[])
    {
        Scanner inputText = new Scanner(System.in);
        Scanner inputNum = new Scanner(System.in);
        
        Athlete ath;
        ath = new Athlete();
        
        String name;
        double weight,height,BMI;
        
        System.out.println("Enter the athlete's name: ");
        name=inputText.nextLine();
        System.out.println("Enter the athlete's weight(kg): ");
        weight=inputNum.nextDouble();
        System.out.println("Enter the athlete's height(m): ");
        height=inputNum.nextDouble();
        
        ath.setAthlete(name, weight, height);
        BMI = ath.calcBMI(weight,height);
        
        System.out.println(ath.toString());
        System.out.println("\nBMI: " +BMI);
        System.out.println("\nBMI health status");
        
        if(BMI < 18.5)
        System.out.println("\nYou are underweight.");
        else if(BMI >= 18.5 && BMI <= 24.9)
        System.out.println("\nYou are normal.");
        else if(BMI >= 25.0 && BMI <= 29.0)
        System.out.println("\nYou are overweight.");
        else if(BMI >= 30.0 && BMI <= 40.0)
        System.out.println("\nYou are obese!");
        else
        System.out.println("\nYou are extremely obese!!");
    }
}
