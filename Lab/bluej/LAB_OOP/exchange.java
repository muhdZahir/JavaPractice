import java.util.Scanner;
public class exchange
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        
        int amount = 793, bankNote;
        int array[] = {100,50,10,5,1};
        
        for(int i=0;i < array.length;i++)
        {
            bankNote = amount/array[i];
            amount = amount % array[i];
            System.out.println(bankNote);
        }
    }
}
