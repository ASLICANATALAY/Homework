public class Room {
    private String name;
    private int height;
    private double sizeM2;

    public Room(String name, int height, double sizeM2) {
        this.name = name;
        this.height = height;
        this.sizeM2 = sizeM2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getSizeM2() {
        return sizeM2;
    }

    public void setSizeM2(double sizeM2) {
        this.sizeM2 = sizeM2;
    }
}
