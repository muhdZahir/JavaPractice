/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guiassignment;

/**
 *
 * @author Othman Family
 */
public class CustomerAccount
{
    private long accNum;             
    private double balance;           
    private final double HIGH_CREDIT_LIMIT = 80000.00; 

    public CustomerAccount(long num, double bal) throws HighBalanceException, InvalidNumberException
    {
        if (bal >= HIGH_CREDIT_LIMIT)
            throw new HighBalanceException(HIGH_CREDIT_LIMIT);
        else if (num <=0)
            throw new InvalidNumberException(); 
        else
        {
            this.accNum = num;
            this.balance = bal;
        }
    }

    public long getAccNum() { return accNum; }
    public double getBalance() { return balance; }
}