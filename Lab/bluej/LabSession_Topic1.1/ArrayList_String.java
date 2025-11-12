
/**
 * Write a description of class ArrayList_String here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
import java.lang.String;
public class ArrayList_String
{
    public static void main(String args[])
    {
        // a) Declare the String ArrayList named IC_Arr
        ArrayList<String> IC_Arr = new ArrayList<String>();
        
        // b) Input 10 IC numbers into an IC_Arr by using the format with dash(“-”)
        Scanner inputText = new Scanner(System.in);
        
        String IC;
        for(int i = 0; i < 10; i++)
        {
            System.out.println("Enter the IC number: ");
            IC = inputText.nextLine();
            IC_Arr.add(IC);
        }
        
        // c) Display the IC number and count of person from Pahang,
        //    for example 800116-06-6543 IC number shows the person is from Pahang because the state code is 06
        int count = 0;
        System.out.println("\nIC number of people who came from Pahang: \n");
        for(int i = 0; i < IC_Arr.size(); i++)
        {
            if(IC_Arr.get(i).substring(7,9).equalsIgnoreCase("06"))
            {
                count++;
                System.out.println(count+ ". " +IC_Arr.get(i));
            }
        }
        System.out.println("\nThe number of people who came from Pahang: " +count);
        
        // d) Declare another ArrayList named KedahICArr
        ArrayList<String> KedahICArr = new ArrayList<String>();
        
        // e) Copy the IC number of the person from Kedah into KedahICArr(find the state code for Kedah)
        for(int i = 0; i < IC_Arr.size(); i++)
        {
            if(IC_Arr.get(i).substring(7,9).equalsIgnoreCase("02"))
            {
                KedahICArr.add(IC_Arr.get(i));
            }
        }
        
        // f) Display the size of IC_Arr and KedahICArr
        System.out.println("\nThe size of IC_Arr: " +IC_Arr.size());
        System.out.println("\nThe size of KedahICArr: " +KedahICArr.size());
        
        // g) Display the content of IC_Arr and KedahICArr
        System.out.println("\nThe content of IC_Arr: ");
        for(int i = 0; i < IC_Arr.size(); i++)
        {
            System.out.println(IC_Arr.get(i));
        }
        
        System.out.println("\nThe content of KedahICArr: ");
        for(int i = 0; i < KedahICArr.size(); i++)
        {
            System.out.println(KedahICArr.get(i));
        }
    }
}
