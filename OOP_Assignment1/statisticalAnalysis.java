import java.lang.Math;
public class statisticalAnalysis
{
    public double calcMin(double[] array)
    {
        double min = 99999999999999.9;
        for(int i = 0;i < array.length;i++)
        {
            if(min > array[i])
                min = array[i];
        }
        return min;
    }
    
    public double calcMax(double[] array)
    {
        double max = 0.0;
        for(int i = 0;i < array.length;i++)
        {
            if(max < array[i])
                max = array[i];
        }
        return max;
    }
    
    public double calcTotal(double[] array)
    {
        double total = 0.0;
        for(int i = 0;i < array.length;i++)
        {
            total += array[i];
        }
        return total;
    }
    
    public double calcMean(double total,int days)
    {
        double mean = total/days;
        return mean;
    }
    
    public double calcVari(double[] array,double mean)
    {
        double vari, total = 0.0;
        for(int i = 0;i < array.length;i++)
        {
            double sum = Math.pow(array[i] - mean,2);
            total += sum;
        }
        vari = total/(array.length-1);
        return vari;
    }
    
    public double calcSD(double vari)
    {
        double sd = Math.sqrt(vari);
        return sd;
    }
}
