import java.io.*;
import java.util.Scanner;
public class IO
{
    public static void main(String args[]) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        String fileName;
        for(int i = 0;i<2;i++)
        {
            System.out.println("Enter fileName ");
            fileName = sc.next();
            String path = fileName+".txt";
            PrintWriter outputFile = new PrintWriter(path);
            System.out.println("Enter grades for " +fileName);
            int grade = sc.nextInt();
            outputFile.println(grade);
            outputFile.close();
        }
    }
}