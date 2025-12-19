public class TestFood {
    public static void main(String[] args) {
        MainDish m = new MainDish("Kebab", 150.0, true);
        Dessert d = new Dessert("Baklava", 80.0, true);
        Drink   dr = new Drink("Tea", 20.0, false);

        m.describe();
        d.describe();
        dr.describe();
    }
}
