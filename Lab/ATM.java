import java.util.*;
import java.time.*;
public class ATM
{
    private int pin;
    private double balance;
    private double bankFund = 100000000.0;
    private double limit = 5000.0;
    Scanner sc = new Scanner(System.in);
    
    //constructor
    public ATM()
    {
        pin = 0;
        balance = 0.0;
    }
    
    //setter
    public void setPin(int pin) { this.pin = pin; }
    public void setBalance(double b) { balance = b; }
    //getter
    public int getPin() { return pin; }
    public double getBalance() { return balance; }
    
    //authentication
    public void Authenticate(ATM acc)
    {
        System.out.println("\nEnter PIN: ");
        int PIN = sc.nextInt();
        
        if(PIN == acc.getPin())//if true, go to main menu
            acc.mainMenu(acc);
        else//if false, prompt to enter correct pin
        {
            System.out.println("\nWrong PIN!");
            acc.Authenticate(acc);
        }
    }
    
    //main menu
    public void mainMenu(ATM acc)
    {
        System.out.println("\n[Main Menu]\n1. Check Balance\n2. Withdrawal\n3. Deposit\n4. Exit\n\n");
        System.out.println("Choose an option (1/2/3/4)");
        int op = sc.nextInt();
        
        //depending on the option, go to the method
        if(op == 1)
            acc.checkBalance(acc);
        else if(op == 2)
            acc.withDraw(acc);
        else if(op == 3)
            acc.deposit(acc);
        else if(op == 4)
            acc.Exit();
    }
    
    //check balance
    public void checkBalance(ATM acc)
    {
        System.out.println("\nBalance: RM"+acc.getBalance());
        acc.mainMenu(acc);//after checking finished, go back to main menu
    }
    
    //withdraw
    public void withDraw(ATM acc)
    {
        double b = acc.getBalance();
        int with = 1;
        System.out.println("\nEnter withdrawal amount (Limit RM"+String.format("%.2f",limit)+"): ");
        double wd = sc.nextDouble();
        
        if(wd < limit)//withdrawal amount has to be less than the limit
        {
            b = acc.transProc(wd,b,with);
            LocalDate dateTrans = LocalDate.now();//record date of transaction
            LocalTime timeTrans = LocalTime.now();//record time of transaction
            
            System.out.println("\nDo you want a receipt? (Yes/No)");//prompt for receipt
            String rc = sc.next();
            if(rc.equalsIgnoreCase("Yes"))//if true, print receipt
                acc.receipt(dateTrans, timeTrans, wd, b);
        }
        else
            System.out.println("\nWithdrawal amount exceeds the limit! (Limit: RM"+String.format("%.2f",limit)+")");
        acc.mainMenu(acc);//after withdrawal finished, go back to main menu
    }
    
    //deposit
    public void deposit(ATM acc)
    {
        double b = acc.getBalance();
        int depo = 2;
        System.out.println("\nEnter amount to deposit (Limit RM"+String.format("%.2f",limit)+"): ");
        double dp = sc.nextDouble();
        
        if(dp < limit)//withdrawal amount has to be less than the limit
        {
            b = acc.transProc(dp,b,depo);
            LocalDate dateTrans = LocalDate.now();//record date of transaction
            LocalTime timeTrans = LocalTime.now();//record time of transaction
        }
        else
            System.out.println("\nDeposit amount exceeds the limit! (Limit: RM"+String.format("%.2f",limit)+")");
        acc.mainMenu(acc);
    }
    
    //transaction proccess
    public double transProc(double amount, double b, int which)
    {
        if(which == 1)//condition for withdrawal
        {
            if(amount < bankFund)
            {
                bankFund -= amount;
                b -= amount;
            }
            else
                System.out.println("\nBank has insufficient fund.");
        }
        else if(which == 2)//condition for deposit
        {
            bankFund += amount;
            b += amount;
        }   
        return b;
    }
    
    //receipt
    public void receipt(LocalDate date, LocalTime time,double wd, double b)
    {
        System.out.println("\nDate: " +date+ "\nTime: " +time+ "\nWithdrawal Amount: RM"
        +String.format("%.2f",wd)+ "\nCurrent Balance: RM" +String.format("%.2f",b));
    }
    
    //exit
    public void Exit()
    {
        System.out.println("\nThank you for your business! \nPlease take your card.");
    }
}
