class WoodenDuck extends Duck {
    public WoodenDuck() {
        swimBehavior = () -> System.out.println("I float on water.");
        flyBehavior = new NoFly();
        quackBehavior = new Mute();
    }

    @Override
    public void display() {
        System.out.println("I'm a Wooden Duck.");
    }
}