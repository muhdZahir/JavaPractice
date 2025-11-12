
/**
 * Write a program that will input your name, age, home town, state and hp number
 */

import java.util.Scanner;
public class Personal_Information
{
    public static void main(String args[])
    {
        Scanner inputNum=new Scanner(System.in);
        Scanner inputText=new Scanner(System.in);
        
        String name, hometown, state;
        int age, hp_num;
        
        System.out.println("Enter your name: ");
        name = inputText.nextLine();
        System.out.println("Enter your age: ");
        age = inputNum.nextInt();
        System.out.println("Enter your hometown: ");
        hometown = inputText.nextLine();
        System.out.println("Enter your state: ");
        state = inputText.nextLine();
        System.out.println("Enter your handphone number: ");
        hp_num = inputNum.nextInt();
        
        System.out.println("\nName: " +name);
        System.out.println("\nAge: " +age);
        System.out.println("\nHometown: " +hometown);
        System.out.println("\nState: " +state);
        System.out.println("\nHp: " +hp_num);
    }
    
}
