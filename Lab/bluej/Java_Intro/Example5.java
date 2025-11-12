
/**
 input name,CGPA and your state. This program will determine and 
 display a message either you are eligible to get  scholarship or not. The requirement 
 to get the scholarship are; student must get CGPA more or equal to 3.5 and from 
 Pahang.
 */
import java.util.Scanner;
public class Example5
{
    public static void main(String args[])
    {
        Scanner inputText=new Scanner(System.in);
        Scanner inputNum=new Scanner(System.in);
        
        String name, state;
        float cgpa;
        
        System.out.println("Enter your name: ");
        name = inputText.nextLine();
        System.out.println("Enter your CGPA: ");
        cgpa = inputNum.nextFloat();
        System.out.println("Enter your state: ");
        state = inputText.nextLine();
        
        if(cgpa >= 3.5 && state.equalsIgnoreCase("Pahang"))
            System.out.println("\nCongatulations " +name+ ", you got the scholarship!");
        else
            System.out.println("\nSorry " +name+ ", you did not get the scholarship.");
    }
}
