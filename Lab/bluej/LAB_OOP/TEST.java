
public class TEST
{
    public void myPublic()
    {
        System.out.println("Need object.");
    }
    
    static void myStatic()
    {
        System.out.println("Access directly");
    }
    
    public static void main(String args[])
    {
        TEST t = new TEST();
        
        myStatic();
        t.myPublic();
    }
}