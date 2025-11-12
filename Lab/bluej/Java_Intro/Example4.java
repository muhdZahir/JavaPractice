
/**
 * input name, age, weight(kg) and height(m) and calculate BMI value 
 */
import java.util.Scanner;
import java.lang.Math;
public class Example4
{
    public static void main(String args[])
    {
        Scanner inputText=new Scanner(System.in);
        Scanner inputNum=new Scanner(System.in);
        
        String name, status;
        int age;
        double weight, height, BMI;
        
        System.out.println("Enter your name:");
        name = inputText.nextLine();
        System.out.println("Enter your age:");
        age = inputNum.nextInt();
        System.out.println("Enter your weight(kg):");
        weight = inputNum.nextDouble();
        System.out.println("Enter your height(m):");
        height = inputNum.nextDouble();
        
        BMI = weight/(Math.pow(height,2));
        
        if(BMI < 18.5)
            status = "Underweight";
        else
        if(BMI >= 18.5 && BMI <25)
            status = "Normal";
        else
        if(BMI >= 25 && BMI <= 30)
            status = "Overweight";
        else
            status = "Obese";
        
        System.out.println("\nName: " +name);
        System.out.println("\nAge: " +age);
        System.out.println("\nWeight: " +weight+ " kg");
        System.out.println("\nHeight: " +height+ " m");
        System.out.println("\nBMI: " +BMI);
        System.out.println("\nBMI status: " +status);
        
    }
}
