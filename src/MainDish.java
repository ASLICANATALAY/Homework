public class MainDish extends Food {
    private boolean spicy;

    public MainDish(String name, double price, boolean spicy) {
        super(name, price);   // call Food constructor
        this.spicy = spicy;
    }

    @Override
    public void describe() {
        System.out.print("Main dish: " + getInfo());
        if (spicy) {
            System.out.println(" (spicy)");
        } else {
            System.out.println(" (not spicy)");
        }
    }
}
