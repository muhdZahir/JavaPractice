/*
Group Members Name:
1.Muhammad Syazwan Bin Borahan
2.Muhammad Izzani Danial Bin Mohd Khairi
3.Wan Ahmad Syakirin Bin Pahimi
4.Muhammad Zahiruddin Bin Othman
*/
import java.util.ArrayList;
import java.util.Scanner;
public class StudentGradeManagementSystem
{
    public static void main(String arg[])
    {
        ArrayList<Double> list = new ArrayList<>();
        Scanner sc = new Scanner (System.in);
        
        int choice = 0;
        do
        {
            System.out.println("\nMenu");
            System.out.println("1. Add Mark");
            System.out.println("2. Remove Mark");
            System.out.println("3. Display All Marks");
            System.out.println("4. Calculate Average Marks");
            System.out.println("5. Find Total Student with A Grade");
            System.out.println("6. Exit");
            System.out.println("\nEnter Your Choice");
            choice = sc.nextInt();
            sc.nextLine();
            
            switch(choice)
            {
                case 1:
                    System.out.println("\nEnter student mark: ");
                    double mark = sc.nextDouble();
                    list.add(mark);
                    System.out.println("Mark added!");
                    break;
                    
                case 2:
                    System.out.println("\nEnter a mark remove: ");
                    double marks = sc.nextDouble();
                    if(list.remove(marks))
                        System.out.println("Mark removed!");
                    else
                        System.out.println("Mark does not exist!");
                    break;
                    
                case 3:
                    displayList(list);
                    break;
                    
                case 4:
                    calcAvg(list);
                    break;
                    
                case 5:
                    findAGrade(list);
                    break;
                    
                case 6:
                    System.out.println("\nExiting...");
                    break;
                   
                default:
                    System.out.println("\nInvalid choice. Please try again!");
                    choice = 0;
            }
        }while(choice != 6);
    }
    
    public static void displayList(ArrayList<Double> list)
    {
        if(!list.isEmpty())
            System.out.println("\nCurrent marks stored: " +list);
        else
            System.out.println("\nNo mark is stored!");
    }
    
    public static void calcAvg(ArrayList<Double> list)
    {
        if(!list.isEmpty())
        {
            double avg = 0, total = 0;
            int len = list.size();
            for(int i = 0;i < len;i++)
            {
                total += list.get(i);
            }
            avg = total/len;
            System.out.println("\nThe average marks: " +String.format("%.2f",avg));
        }
        else
            System.out.println("\nNo mark is stored!");
    }
    
    public static void findAGrade(ArrayList<Double> list)
    {
        if(!list.isEmpty())
        {
            int total = 0;
            int len = list.size();
            for(int i = 0;i < len;i++)
            {
                if(list.get(i) >= 75)
                    total++;
            }
            System.out.println("\nTotal number of students with A grade: " +total);
        }
        else
            System.out.println("\nNo mark is stored!");
    }
}
