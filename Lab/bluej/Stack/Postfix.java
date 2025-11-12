import java.util.*;
public class Postfix
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        Postfix pf = new Postfix();
        String in, post;
        
        System.out.println("Enter the question: (end with #)");
        in = s.next();
        
        int len = in.length();
        char[] array = new char[len];
        for(int i = 0;i < len;i++)
        {
            array[i] = in.charAt(i);
        }
        
        post = pf.InToPost(array);
        System.out.println("The postfix expression is " +post);
    }
    
    public String InToPost(char[] array)
    {
        String state = "";
        Stack<Character> st = new Stack();
        
        int i = 0;
        while(array[i] != '#')
        {
            if(array[i] != '*' && array[i] != '/' && array[i] != '%' && array[i] != '+' && array[i] != '-' && array[i] != '(' && array[i] != ')')
            {
                state += array[i];
                System.out.println(state);
            }
            else if(array[i] == '(')
            {
                st.push(array[i]);
            }
            else if(array[i] == ')')
            {
                while(st.peek() != '(')
                {
                    state += st.pop();
                    System.out.println(state);
                }
                st.pop();
            }
            else
            {
                while(array[i] == '*' || array[i] == '/' || array[i] == '%' || array[i] == '+' || array[i] == '-')
                {
                    if(st.empty() == true)
                    {
                        st.push(array[i]);
                        break;
                    }
                    
                    if(array[i] == '/' || array[i] == '*' || array[i] == '%')
                    {
                        if(st.peek() == '/' || st.peek() == '*' || st.peek() == '%')
                        {
                            state += st.pop();
                            System.out.println(state);
                        }
                        else
                        {
                            st.push(array[i]);
                            break;
                        }
                    }
                    else //'+' & '-' operator
                    {
                        if(st.peek() == '(')
                        {
                            st.push(array[i]);
                            break;
                        }
                        else
                        {
                            state += st.pop();
                            System.out.println(state);
                        }
                    }
                }
            }
            i++;
        }
        while(st.empty() == false)
        {
            state += st.pop();
            System.out.println(state);
        }
        
        return state;
    }
}
