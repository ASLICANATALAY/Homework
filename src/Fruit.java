public class Fruit {
    protected String name;
    protected double calories;

    public Fruit(String name, double calories) {
        this.name = name;
        this.calories = calories;
    }

    public String getInfo() {
        return name + " - " + calories + " kcal";
    }

    public void describe() {
        System.out.println("This is a fruit: " + getInfo());
    }
}