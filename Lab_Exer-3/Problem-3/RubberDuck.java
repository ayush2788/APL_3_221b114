class RubberDuck extends Duck {
    public RubberDuck() {
        swimBehavior = () -> System.out.println("I float on water.");
        flyBehavior = new NoFly();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("I'm a Rubber Duck.");
    }
}