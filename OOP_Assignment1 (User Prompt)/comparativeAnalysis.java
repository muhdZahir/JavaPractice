import java.lang.Math;
public class comparativeAnalysis
{
    private double calcSumSimTruth(double[] arraySim,double[] arrayTruth)
    {
        double total = 0.0;
        for(int i = 0; i < arraySim.length;i++)
        {
            double dif = arrayTruth[i] - arraySim[i];
            double sum = Math.pow(dif,2);
            total += sum;
        }
        return total;
    }
    
    public double calcMSE(double[] arraySim,double[] arrayTruth)
    {   
        double data = arraySim.length;
        double MSE = calcSumSimTruth(arraySim,arrayTruth)/data;
        return MSE;
    }
    
    public double calcRMSD(double MSE)
    {
        double RMSD = Math.sqrt(MSE);
        return RMSD;
    }
    
    public double calcMAE(double[] arraySim,double[] arrayTruth)
    {
        double total = 0.0;
        for(int i = 0; i < arraySim.length;i++)
        {
            double dif = arraySim[i] - arrayTruth[i];
            double sum = Math.abs(dif);
            total += sum;
        }
        double MAE = total/arraySim.length;
        return MAE;
    }
}
