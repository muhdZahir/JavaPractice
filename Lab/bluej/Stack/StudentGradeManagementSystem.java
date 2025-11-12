import java.util.ArrayList;
import java.util.Collections;
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
            System.out.println("5. Find Total Student with A grade");
            System.out.println("6. Exit");
            System.out.println("\nEnter Your Choice");
            choice = sc.nextInt();
            sc.nextLine();
            
            switch(choice)
            {
                case 1:
                    System.out.println("Enter student mark: ");
                    double elementToAdd = sc.nextDouble();
                    list.add(elementToAdd);
                    System.out.println("Mark added!");
                    break;
                    
                case 2:
                    System.out.println("Enter a mark remove: ");
                    double elementToRemove = sc.nextDouble();
                    if(list.remove(elementToRemove))
                        System.out.println("Mark removed.");
                    else
                        System.out.println("Mark does not exist.");
                    break;
                    
                case 3:
                    displayList(list);
                    break;
                    
                case 4:
                    calcAvg(list);
                    break;
                    
                case 5:
                    System.out.println("Enter the element to find.");
                    String elementToFind = sc.nextLine();
                    if(list.contains(elementToFind))
                        System.out.println("Element found at index " +list.indexOf(elementToFind));
                    else
                        System.out.println("Element not found.");
                    displayList(list);
                    break;
                    
                case 6:
                   list.clear();
                   System.out.println("All elements cleared.");
                   break;
                   
                case 7:
                   System.out.println("Exiting...");
                   break;
                   
                default:
                    System.out.println("Invalid choice. Please try again");
            }
        }while(choice != 7);
    }
    
    public static void displayList(ArrayList<Double> list)
    {
        System.out.println("Current List Element: " +list);
    }
    
    public static void calcAvg(ArrayList<Double> list)
    {
        double avg = 0, total = 0;
        int len = list.size();
        for(int i=0;i < len;i++)
        {
            total += list.get(i);
        }
        avg = total/len;
        System.out.println("The average marks is: " +avg);
    }
}
