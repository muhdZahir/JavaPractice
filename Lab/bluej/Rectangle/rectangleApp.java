
/**
 * Write a description of class rectangleApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
public class rectangleApp
{
    public static void main(String args[])
    {
        // a)Create 4 instance object of class using array of object
        Rectangle [] rect = new Rectangle[4];
        
        Scanner inputNum = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        
        int i;
        double width, length;
        
        // b)Input and store the objects data into an array
        for (i = 0; i < 4; i++)
        {
            System.out.println("Enter the width of the rectangle = ");
            width = inputNum.nextDouble();
            System.out.println("Enter the length of the rectangle = ");
            length = inputNum.nextDouble();
            
            rect[i] = new Rectangle(width, length);
        }
        
        // c)Display the average area of objects
        double avg, area, sum = 0;
        for (i = 0; i < 4; i++)
        {
            area = rect[i].calcArea(rect[i].getWidth(), rect[i].getLength());
            sum = sum + area;
        }
        avg = sum/4;
        System.out.println("Average area = " +avg);
        
        // d)Display the highest area of objects
        double highest = rect[0].calcArea(rect[0].getWidth(), rect[0].getLength());
        for (i = 0; i < 4; i++)
        {
            area = rect[i].calcArea(rect[i].getWidth(), rect[i].getLength());
            if(area > highest)
            {
                highest = area;
            }
        }
        System.out.println("Highest area = " +highest);
        
        // e)Display the details of the lowest area of objects
        double lowest = rect[0].calcArea(rect[0].getWidth(), rect[0].getLength());
        int index = 0;
        for (i = 0; i < 4; i++)
        {
            area = rect[i].calcArea(rect[i].getWidth(), rect[i].getLength());
            if(area < lowest)
            {
                lowest = area;
                index = i;
            }
        }
        System.out.println("\nDetails of the lowest area of objects: ");
        System.out.println(rect[index].toString());
    }
    
}
