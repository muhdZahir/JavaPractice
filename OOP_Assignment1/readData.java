import java.io.*;
import java.util.*;
public class readData
{
    public double[] read_data(String fileName,int days) throws IOException
    {
        Scanner readInput = new Scanner(new File(fileName+ ".txt"));
        double[] array = new double[days];
        int count = 0;

        while(readInput.hasNext())
        {
            double var = Double.parseDouble(readInput.nextLine());
            
            array[count] = var;
            count++;
        }
        return array;
    }
}
