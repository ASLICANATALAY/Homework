public class Dog extends Pet {

    private String color;
    private String breed;

    public Dog(String name, int age, boolean isMale, String color, String breed) {
        super(name, age, isMale);
        this.color = color;
        this.breed = breed;
    }

    public Dog(int age, boolean isMale, String color, String breed) {
        super(age, isMale);
        this.breed = breed;
        this.color = color;
    }

    public void speak() {
        System.out.println("woof");
    }

    public String getColor() {
        return color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getHumanAge() {
        return 7 * this.getAge();
    }
}