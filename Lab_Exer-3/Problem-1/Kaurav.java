class Kaurav extends Bharatvanshi {
    private boolean isNoble;

    public Kaurav(String name, boolean isNoble) {
        super(name);
        this.isNoble = isNoble;
    }

    @Override
    public String fight() {
        return name + " fights fiercely!";
    }

    @Override
    public String obey() {
        return name + " disobeys the rules!";
    }

    @Override
    public String kind() {
        return isNoble ? "kind" : "not kind";
    }
}