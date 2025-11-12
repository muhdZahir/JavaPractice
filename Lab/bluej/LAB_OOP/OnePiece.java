
public class OnePiece
{
    public static void main(String args[])
    {
        int years = 5, months = 12;
        double tax = 50000.0, avg = 0.0, inflation = 0.05;
        
        for(int i = 0; i < years; i++)
        {
            if(i < 1)
            {
                double total1 = 0.0;
                total1 = tax * 365;
                avg = total1 / months;
                
                System.out.println("\nThe total tax for the first year is RM " +total1);
                System.out.println("The average tax for the first year is RM " +avg);
            }
            else
            {
                double total2 = 0.0;
                for(int j = 1; j < months; j++)
                {
                    tax *= inflation;
                    if((j==1) || (j==3) || (j==5) || (j==7) || (j==8) || (j==10) || (j==12))
                        total2 = tax * 31;
                    else if((j==2))
                        total2 = tax * 28;
                    else
                        total2 = tax * 30;
                }
                avg = total2 / months;
                    
                System.out.println("\nThe total tax for year " +i+ " is RM " +total2);
                System.out.println("The average tax for year " +i+ " is RM " +avg);
            }
        }
    }
}
