public class Food {
    protected String name;
    protected double price;

    public Food(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getInfo() {
        return name + " - " + price + " TL";
    }

    public void describe() {
        System.out.println("This is a food item: " + getInfo());
    }
}
