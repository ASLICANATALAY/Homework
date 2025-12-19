public class Dessert extends Food {
    private boolean containsSugar;

    public Dessert(String name, double price, boolean containsSugar) {
        super(name, price);   // call Food constructor
        this.containsSugar = containsSugar;
    }

    @Override
    public void describe() {
        System.out.print("Dessert: " + getInfo());
        if (containsSugar) {
            System.out.println(" (with sugar)");
        } else {
            System.out.println(" (sugar free)");
        }
    }
}
