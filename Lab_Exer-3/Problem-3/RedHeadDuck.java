
class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        swimBehavior = () -> System.out.println("I swim gracefully.");
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a RedHead Duck.");
    }
}
