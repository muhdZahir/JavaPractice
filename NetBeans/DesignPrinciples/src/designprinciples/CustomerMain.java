/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designprinciples;

/**
 *
 * @author Othman Family
 */
public class CustomerMain
{
    public static void main(String[] args)
    {
        try
        {
            CustomerAccount acc = new CustomerAccount(12345, 15000.00);
            System.out.println("Account Number: " +acc.getAccNum()+ "\nBalance: RM" +acc.getBalance());
            
            CustomerAccount acc2 = new CustomerAccount(67890, 25000.00);
            System.out.println("Account created: " + acc2.getAccNum() + " with balance: RM" + acc2.getBalance());
        }
        catch (HighBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
