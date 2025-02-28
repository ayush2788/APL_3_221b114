// Java Code to Create Singleton class
// with Eager Initialization
public class temp1
{
    private static final temp1 instance=new temp1();
    private temp1()
    {
        
    }
    public static temp1 getInstance()
    {
        return instance;
    }
}