/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class One
{
    int x;
    One(int _x)
    {
    x=_x;
    }
}
class Two extends One
{
    int y;
    Two(int _x,int _y)
    {
        super(_x);
        y=_y;
    }
    void display()
    {
        System.out.println(x);
        System.out.println(y);
    }
}
public class Main
{
 public static void main(String[] args)
 {
    Two obj=new Two(10,20);
    obj.display();
 }
}