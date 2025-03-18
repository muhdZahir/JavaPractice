import java.util.*;
import java.time.*;
public class Account
{
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated = new Date();
    
    public Account()
    {
        id = 0;
        balance = 0.0;
        annualInterestRate = 0.0;
        LocalDate dateCreated = LocalDate.now();
    }
    
    public void setID(int id) { this.id = id; }
    public void setBalance(double b) { balance = b; }
    public void setAIR(double AIR) { annualInterestRate = AIR; }
    
    public int getID() { return id; }
    public double getBalance() { return balance; }
    public double getAIR() { return annualInterestRate; }
    public Date getDate() { return dateCreated;}
    
    public double getMonthlyInterestRate(double AIR, double b)
    {
        double MIR = b * (AIR / 12);
        return MIR;
    }
    
    public double withDraw(double b, double amount)
    {
        double wd = b - amount;
        return wd;
    }
    
    public double deposit(double b, double amount)
    {
        double dp = b + amount;
        return dp;
    }
}
