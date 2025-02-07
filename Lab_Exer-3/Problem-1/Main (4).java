/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main {
    public static void main(String[] args) {
        Pandav arjun = new Pandav("Arjun", "kind");
        Pandav bheem = new Pandav("Bheem", "less kind");
        Kaurav duryodhan = new Kaurav("Duryodhan", false);
        Kaurav vikarn = new Kaurav("Vikarn", true);

      
        System.out.println(arjun.fight());
        System.out.println(arjun.obey());
        System.out.println(arjun.name + " is " + arjun.kind());

        System.out.println(bheem.fight());
        System.out.println(bheem.obey());
        System.out.println(bheem.name + " is " + bheem.kind());

        System.out.println(duryodhan.fight());
        System.out.println(duryodhan.obey());
        System.out.println(duryodhan.name + " is " + duryodhan.kind());

        System.out.println(vikarn.fight());
        System.out.println(vikarn.obey());
        System.out.println(vikarn.name + " is " + vikarn.kind());
    }
}