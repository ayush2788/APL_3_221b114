class LakeDuck extends Duck {
    public LakeDuck() {
        swimBehavior = () -> System.out.println("I swim in the lake.");
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a Lake Duck.");
    }
}
