/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
//Java Code to create singleton class with
//lazy initialization
public class temp
{
    private static temp instance;
    private temp()
    {
        
    }
    public static temp getInstance()
    {
        if(instance==null)
        {
            instance=new temp();
        }
        return instance;
    }
}
