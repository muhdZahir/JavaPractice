import java.util.Stack;
import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args)
    {
        Stack<Character> stack = new Stack<>();
        myQueue que = new myQueue();
        Scanner sc = new Scanner(System.in);
        
        boolean proceed = true;
        while(proceed == true)
        {
            System.out.println("Enter a word.");
            String word = sc.next();
            System.out.println(word);
            
            int len = word.length();
            char[] character = new char[len];
            for(int i = 0;i < len;i++)
            {
                character[i] = word.charAt(i);
            }
            
            for (char c : character)
            {
                stack.push(c);
                que.add(c);
            }
            
            boolean isPalindrome = true;
        
            while (!stack.isEmpty() && !que.empty())
            {
                if (stack.pop() != que.remove())
                {
                    isPalindrome = false;
                    break;
                }
            }
    
            if (isPalindrome)
                System.out.println("The word is a palindrome.");
            else
                System.out.println("The word is not a palindrome.");
            
            System.out.println("Do you wish to continue? (true/false)");
            proceed = sc.nextBoolean();
        }
        System.out.println("Thank you!");
    }
}