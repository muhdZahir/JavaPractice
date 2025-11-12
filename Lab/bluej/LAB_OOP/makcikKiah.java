
public class makcikKiah
{
    public static void main(String args[])
    {
        int month = 240;
        double salary = 3000.0, bonus = 6000.0, total = 0.0;
        
        for(int i = 1; i <= month;i++)
        {
            total += salary;
            
            if(i % 6 == 0)
                total += bonus;
        }
        System.out.println("The total is RM " +total);
    }
}
