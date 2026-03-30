/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designprinciples;

/**
 *
 * @author Othman Family
 */
public class CustomerAccount
{
    private int accNum;             
    private double balance;           
    private final double HIGH_CREDIT_LIMIT = 20000.00; 

    public CustomerAccount(int num, double bal) throws HighBalanceException
    {
        if (bal > HIGH_CREDIT_LIMIT)
            throw new HighBalanceException("Balance cannot exceed the high credit limit of RM" + HIGH_CREDIT_LIMIT);
        else
        {
            this.accNum = num;
            this.balance = bal;
        }
    }

    public int getAccNum() { return accNum; }
    public double getBalance() { return balance; }
}