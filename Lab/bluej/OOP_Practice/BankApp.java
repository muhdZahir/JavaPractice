import java.util.Scanner;
public class BankApp
{
    public static void main (String args[])
    {
        BankAccount ba = new BankAccount();
        SavingsAccount sa = new SavingsAccount();
        CheckingAccount ca = new CheckingAccount();
        
        Scanner sc = new Scanner(System.in);
        
        double amount;
        String bank;
        
        System.out.println("Enter amount (RM)");
        amount = sc.nextDouble();
        System.out.println("Enter bank (SA/CA)");
        bank = sc.next();
        
        if(bank.equalsIgnoreCase("SA"))
        {
            System.out.println("Enter amount (RM)");
            amount = sc.nextDouble();
            if(amount > 10000)
                sa.withdraw();
        }
        else if(bank.equalsIgnoreCase("CA"))
        {
            System.out.println("Enter amount (RM)");
            amount = sc.nextDouble();
            if(amount > 5000)
                ca.withdraw();
        }
        else
            System.out.println("Unregistered bank account.");
    }
}
