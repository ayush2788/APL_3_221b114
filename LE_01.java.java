/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class JUET
{
    public String name;
    public int age;
    public void SetName(String n)
    {
        this.name=n;
    }
    public String GetName()
    {
        return this.name;
    }
    public void SetAge(int a)
    {
        this.age=a;
    }
    public int GetAge()
    {
        return this.age;
    }
}
public class Main
{
	public static void main(String[] args) {
	    JUET s=new JUET();
	    s.SetName("Ayush Gupta");
	    String ans=s.GetName();
	    System.out.println(ans);
	    s.SetAge(20);
	    int var=s.GetAge();
	   System.out.println(var);
	}
}