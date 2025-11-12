
public class Password
{
    private String password;
    private int key;
    private String cipherText;
    
    public void setPass(String P)
    {
        this.password = P;
    }
    
    public void setKey(int K)
    {
        this.key = K;
    }
    
    public void setCT(String CT)
    {
        this.cipherText = CT;
    }
    
    public String getPassword()
    {
        return password;
    }
    
    public int getKey()
    {
        return key;
    }
    
    public String getCT()
    {
        return cipherText;
    }
}
