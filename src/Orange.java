public class Orange extends Citrus {
    private int sweetnessLevel;

    public Orange(String name, double calories, double vitaminCmg, int sweetnessLevel) {
        super(name, calories, vitaminCmg);
        this.sweetnessLevel = sweetnessLevel;
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println("Sweetness level: " + sweetnessLevel);
    }
}
