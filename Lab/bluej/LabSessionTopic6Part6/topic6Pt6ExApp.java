import java.util.*;
public class topic6Pt6ExApp
{
    public static void main(String args[])
    {   BSTAppliances treeValue = new BSTAppliances();
      
        Scanner input=new Scanner(System.in);
        Scanner inputText=new Scanner(System.in);
        
        System.out.println("Enter 5 records : ");
     
        for (int i = 0; i < 5; i++ ) 
        {   System.out.println("Enter appliances name : ");  
            String name = inputText.nextLine();
            System.out.println("Enter power consumption : ");
            int watt = input.nextInt();
            Appliances appl = new Appliances(name,watt);
            treeValue.insertNode (appl);
      }
      System.out.println("\nThe count of power consumption more than 1000:"+treeValue.countHiPowerApp());
      
      String searchAppName;
      System.out.println("Enter appliance name to search:");
      searchAppName=inputText.nextLine();
      treeValue.showWatt(searchAppName);     
      
      //call the method that will call the sum of watt for all appliances
      System.out.println("\nThe sum of watt for all appliances: " +treeValue.calcSum());
      //call the method to display the sorted value
      System.out.println("\nThe sorted value: ");
      treeValue.sortingApp();
    }  
}
