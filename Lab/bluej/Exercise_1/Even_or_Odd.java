
/**
    Write a program that will input a number and display whether the number is odd or even.
 */

import java.util.Scanner;
public class Even_or_Odd
{
    public static void main(String args[])
    {
        Scanner inputNum=new Scanner(System.in);
        
        int num;
        
        System.out.println("Enter the number: ");
        num = inputNum.nextInt();
        
        if(num % 2 == 0)
            System.out.println("\n" +num+ " is an even number.");
        else
            System.out.println("\n" +num+ " is an odd number.");
    }
}
