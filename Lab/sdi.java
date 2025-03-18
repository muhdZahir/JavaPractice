import java.util.Scanner;
public class sdi
{
    public static void main(String args[])
    {
        String name = "MUHAMMAD ZAHIRUDDIN BIN OTHMAN", email = "zahiruddin.othman@s.unikl.edu.my", reason = "To achieve more than what I had currently.";
        int age = 22;
        long ID = 52213123363L;
        double cgpa = 3.75, target = 3.8;
        
        System.out.println("Name: " +name+ "\nStudent ID: " +ID+ "\nAge: " +age+ "\nCGPA: " +cgpa+ "\nEmail Address: " +email+ "\nTarget Grade: " +target+ "\nReason: " +reason);
        
        String hobby[] = {"Playing Video Games", "Collecting Transformers Figure", "Reading fictional story"};
        int index = hobby.length;
        System.out.println("\nMy hobbies:-");
        for(int i=0; i<index; i++)
        {
            System.out.println("Hobby " +hobby[i]);
            String temp = "Hobby " +hobby[i];
            
            if(temp.equalsIgnoreCase("Hobby " +hobby[i]))
                if(i==2)
                    System.out.println("\nHobbies have been printed!");
                else
                    continue;
            else
            {
                System.out.println("\nError: hobby is not printed!");
                break;
            }
        }
    }
}
