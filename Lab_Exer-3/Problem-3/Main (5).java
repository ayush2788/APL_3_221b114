/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
interface SwimBehavior {
    void swim();
}

interface FlyBehavior {
    void fly();
}

interface QuackBehavior {
    void quack();
}
public class Main {
    public static void main(String[] args) {
        Duck rubberDuck = new RubberDuck();
        Duck woodenDuck = new WoodenDuck();
        Duck redHeadDuck = new RedHeadDuck();
        Duck lakeDuck = new LakeDuck();


        rubberDuck.display();
        rubberDuck.performSwim();
        rubberDuck.performFly();
        rubberDuck.performQuack();
        System.out.println();

        woodenDuck.display();
        woodenDuck.performSwim();
        woodenDuck.performFly();
        woodenDuck.performQuack();
        System.out.println();

        redHeadDuck.display();
        redHeadDuck.performSwim();
        redHeadDuck.performFly();
        redHeadDuck.performQuack();
        System.out.println();

        lakeDuck.display();
        lakeDuck.performSwim();
        lakeDuck.performFly();
        lakeDuck.performQuack();
        System.out.println();
    }
}