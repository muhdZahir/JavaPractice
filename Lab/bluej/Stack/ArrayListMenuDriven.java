import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class ArrayListMenuDriven
{
    public static void main(String args[])
    {
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner (System.in);
        
        int choice = 0;
        do
        {
            System.out.println("\nMenu");
            System.out.println("1. Add Element");
            System.out.println("2. Remove Element");
            System.out.println("3. Display Elements");
            System.out.println("4. Sort Elements");
            System.out.println("5. Find an Element");
            System.out.println("6. Clear All Element");
            System.out.println("7. Exit");
            System.out.println("\nEnter Your Choice");
            choice = sc.nextInt();
            sc.nextLine();
            
            switch(choice)
            {
                case 1:
                    System.out.println("Enter the element to add: ");
                    String elementToAdd = sc.nextLine();
                    list.add(elementToAdd);
                    System.out.println("Element added.");
                    displayList(list);
                    break;
                    
                case 2:
                    System.out.println("Enter the element to remove: ");
                    String elementToRemove = sc.nextLine();
                    if(list.remove(elementToRemove))
                        System.out.println("Element removed.");
                    else
                        System.out.println("Element not found.");
                    displayList(list);
                    break;
                    
                case 3:
                    displayList(list);
                    break;
                    
                case 4:
                    Collections.sort(list);
                    System.out.println("Elements sorted.");
                    displayList(list);
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
    
    public static void displayList(ArrayList<String> list)
    {
        System.out.println("Current List Element: " +list);
    }
}
