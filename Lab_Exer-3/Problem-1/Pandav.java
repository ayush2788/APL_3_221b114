class Pandav extends Bharatvanshi {
    private String kindnessLevel;

    public Pandav(String name, String kindnessLevel) {
        super(name);
        this.kindnessLevel = kindnessLevel;
    }

    @Override
    public String fight() {
        return name + " fights valiantly!";
    }

    @Override
    public String obey() {
        return name + " obeys the rules!";
    }

    @Override
    public String kind() {
        return kindnessLevel;
    }
}