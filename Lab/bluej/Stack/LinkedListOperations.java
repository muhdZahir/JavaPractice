import java.util.LinkedList;
import java.util.Scanner;
public class LinkedListOperations
{
    public static void main(String args[])
    {
        LinkedList<Integer> list = new LinkedList<Integer>();
        Scanner sc = new Scanner (System.in);
        int data, index;
        
        int choice = 0;
        do
        {
            System.out.println("\nMenu");
            System.out.println("1. Add Data at the Beginning");
            System.out.println("2. Add Data at the End");
            System.out.println("3. Add Data at a Specified Position");
            System.out.println("4. Remove Data at the Beginning");
            System.out.println("5. Remove Data at the End");
            System.out.println("6. Remove Data at a Specified Position");
            System.out.println("7. Retrieve Data");
            System.out.println("8. Edit Data");
            System.out.println("9. Display Data in the List");
            System.out.println("10. Search For a Data");
            System.out.println("11. Exit");
            System.out.println("\nEnter Your Choice");
            choice = sc.nextInt();
            sc.nextLine();
            
            switch(choice)
            {
                case 1:
                    System.out.println("Enter the Data to add: ");
                    data = sc.nextInt();
                    list.addFirst(data);
                    System.out.println("Data added.");
                    break;
                    
                case 2:
                    System.out.println("Enter the Data to add: ");
                    data = sc.nextInt();
                    list.addLast(data);
                    System.out.println("Data added.");
                    break;
                    
                case 3:
                    System.out.println("Enter the Data to add: ");
                    data = sc.nextInt();
                    System.out.println("Enter the Position to add into: ");
                    index = sc.nextInt();
                    list.add(index,data);
                    System.out.println("Data added.");
                    break;
                    
                case 4:
                    list.removeFirst();
                    System.out.println("Data removed.");
                    break;
                    
                case 5:
                    list.removeLast();
                    System.out.println("Data removed.");
                    break;
                    
                case 6:
                    System.out.println("Enter the Position to remove the data stored in it");
                    index = sc.nextInt();
                    list.remove(index);
                    System.out.println("Data removed.");
                    break;
                    
                case 7:
                    System.out.println("Enter the Position to retrieve the data: ");
                    index = sc.nextInt();
                    data = list.get(index);
                    System.out.println("The Data at Position " +index+ ": "+data);
                    break;
                    
                case 8:
                    System.out.println("Enter the Position of the data to edit: ");
                    index = sc.nextInt();
                    System.out.println("Enter the New Data");
                    data = sc.nextInt();
                    list.set(index,data);
                    if(list.contains(data))
                        System.out.println("Data Edited Successfully");
                    else
                        System.out.println("Edit Data Failed");
                    break;
                    
                case 9:
                    displayList(list);
                    break;
                    
                case 10:
                    System.out.println("Enter the Data to search.");
                    data = sc.nextInt();
                    if(list.contains(data))
                        System.out.println("Data found at Index " +list.indexOf(data));
                    else
                        System.out.println("Data not found.");
                    break;
                   
                case 11:
                   System.out.println("Exiting...");
                   break;
                   
                default:
                    System.out.println("Invalid choice. Please try again");
            }
        }while(choice != 11);
    }
    
    public static void displayList(LinkedList<Integer> list)
    {
        System.out.println("Current List Data: " +list);
    }
}
