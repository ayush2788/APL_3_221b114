abstract class Duck {
    SwimBehavior swimBehavior;
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void performSwim() {
        swimBehavior.swim();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void setSwimBehavior(SwimBehavior sb) {
        swimBehavior = sb;
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

    public abstract void display(); // Each duck will implement its own display method
}