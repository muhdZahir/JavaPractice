
import java.util.Scanner;
public class encryptionApp
{
    public static void main (String args[])
    {
        Scanner input = new Scanner(System.in);
        
        String p, ct;
        int k = 5;
        
        Password pass = new Password();
        
        System.out.println("Enter your password = ");
        p = input.next();
        pass.setPass(p);
        pass.setKey(k);
        pass.setCT(p);
        
        int length = p.length();
        
        for(int i = 0; i < length; i++)
        {
            char char1 = p.charAt(i);
            int ascii = (int) char1;
            
            System.out.println(char1+" = "+ ascii);
            
            ascii += k;
            char char2 = (char) ascii;
            
            System.out.println(char2+" = "+ ascii);
        }
    }
}
