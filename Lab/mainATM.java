import java.util.*;
public class mainATM
{
    public static void main(String args[])
    {
        ATM acc = new ATM();
        Scanner sc = new Scanner(System.in);
        acc.setPin(1234);
        acc.setBalance(12000.0);
        
        System.out.println("Do you want to use the ATM? (Yes/No)");
        String confirm = sc.nextLine();
        
        if(confirm.equalsIgnoreCase("Yes"))
            acc.Authenticate(acc);
    }
}
