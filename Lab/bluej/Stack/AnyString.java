import java.util.Stack;
public class AnyString
{
    public static void main(String[] args)
    {
        String state = "Welcome home, old friend!";
        Stack s = new Stack();
        
        int len = state.length();
        for(int i=0;i<len;i++)
        {
            s.push(state.charAt(i));
        }
        
        while(s.empty() == false)
        {
            System.out.println(s.pop());
        }
        System.out.println(state);
        
    }
}
