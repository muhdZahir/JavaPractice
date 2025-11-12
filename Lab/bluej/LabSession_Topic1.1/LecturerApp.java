
/**
 * Write a description of class lect here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.*;
public class LecturerApp
{
    public static void main(String args[])
    {
        //a) Declare an ArrayList named lectArr of type Lecturer

        ArrayList <Lecturer> lectArr = new ArrayList <Lecturer>();
        Lecturer lect;

        //b) Input 5 lecturers data

        Scanner input = new Scanner(System.in);
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Enter Name:  ");
            String Name = input.next();
            System.out.println("Enter Staff ID:  ");
            int StaffID = input.nextInt();
            System.out.println("Enter Grade:  ");
            int Grade = input.nextInt();
            lect = new Lecturer(Name, StaffID, Grade);
            lectArr.add(lect);
        }

        //c) Display the count of grade 52 lecturers

        int countGrade = 0;
        for(int i = 0; i < lectArr.size(); i++)
        {
            if(lectArr.get(i).getGrade() == 52)
            {
            countGrade++;
            }
    }
        System.out.println("\nThe number of lecturers with 52 grade: " +countGrade);

        //d) Sort the lecturers data according to name into alphabetical order

        int n = lectArr.size();
        Lecturer temp, lect1, lect2;
        for(int i = 0; i < n-1; i++)
        {
            for(int j = 0; j < n - (i+1); j++)
            {
                lect1 = lectArr.get(j);
                lect2 = lectArr.get(j+1);
                if(lect1.getName().compareTo(lect2.getName()) > 0)
                {
                    temp = lect1;
                    lectArr.set(j, lect2);
                    lectArr.set(j+1, temp);
                }
            }
        }

        //e) Display the content of sorted data

        System.out.println("\nContent of lectArr after sorted: \n");
        for(int i = 0; i < lectArr.size(); i++)
        {
            System.out.println(lectArr.get(i).toString()+ "\n");
        }

        //f) Display the details of lecturer name Yusuf if it is exist and display an appropriate //message if it is not found

        int found = -1;
        for(int i = 0; i < lectArr.size(); i++)
        {
            lect = lectArr.get(i);
            
            if(lect.getName().compareTo("Yusuf") == 0)
            {
                found = i;
                break;
            }
        }
        if(found == -1)
            System.out.println("\nSorry, lecturer with the name Yusuf is not found.");
        else
            System.out.println("\nDetails of lecturer with the name Yusuf: " +lectArr.get(found).toString());

        }
}

