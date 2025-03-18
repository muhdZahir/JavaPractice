public class mainAcc
{
    public static void main(String args[])
    {
        Account acc = new Account();
        
        acc.setID(1122);
        acc.setBalance(20000.0);
        acc.setAIR(0.045);
        
        double balance = acc.getBalance();
        
        balance = acc.withDraw(balance,2500.0);
        balance = acc.deposit(balance,3000.0);
        
        System.out.println("Account\nBalance: " +balance+ "\nMonthly Interest: $" +acc.getMonthlyInterestRate(acc.getAIR(),balance)+ "\nDate Account Created: " +acc.getDate());
    }
}
