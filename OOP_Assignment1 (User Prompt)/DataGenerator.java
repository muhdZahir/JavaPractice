import java.lang.Math;
import java.io.*;
public class DataGenerator
{    
    private double generate_data(int min,int max,double[] price,int product)
    {
        double total = 0.0;
        int range = (max - min) + 1;
        int randomCust = (int)(Math.random()*range)+min;
        for(int i = 0;i < randomCust;i++)
        {
            int randomProduct = (int)(Math.random()*product);
            total += price[randomProduct];
        }
        return total;
    }
    
    public void writeToFile(String fileName,int days,int min,int max,double[] price,int product) throws IOException
    {
        String path = fileName +".txt";
        PrintWriter pw = new PrintWriter(path);
        for(int i = 0;i < days; i++)
        {
            pw.println(generate_data(min,max,price,product));
        }
        pw.close();
    }
}
