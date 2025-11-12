import javax.swing.JOptionPane;
public class Main_AWT
{
    public static void main(String args[])
    {
        //AWT awt = new AWT();
        
        String firstNumber = JOptionPane.showInputDialog("Enter first Integer");
        String secondNumber = JOptionPane.showInputDialog("Enter second Integer");
        
        int number1 = Integer.parseInt(firstNumber);
        int number2 = Integer.parseInt(secondNumber);
        
        int sum = number1 + number2;
        
        JOptionPane.showMessageDialog(null, "The sum is " +sum, "Sum of two integers",JOptionPane.INFORMATION_MESSAGE);
    }
}
