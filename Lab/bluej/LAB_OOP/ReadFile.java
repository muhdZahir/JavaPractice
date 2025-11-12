import java.io.*;
import java.lang.*;
import java.util.Scanner;
public class ReadFile
{
    public static void main(String args[]) throws IOException
    {
        Scanner readInput = new Scanner(new File("dailySales.txt"));
        double[] array = new double[365];
        int count = 0;
        double min = 0, max = 0;
        while(readInput.hasNext())
        {
            double var = Double.parseDouble(readInput.nextLine());
            System.out.println(var);
            
            array[count] = var;
            count++;
        }
        
        for(int i= 0;i < array.length;i++)
        {
            Math.min(array[i],array[i++]);
            if(array[i] < array[i++])
                min = array[i];
        }
        System.out.println("\n" +min);
    }
}
