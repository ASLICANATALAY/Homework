public class Pet {

    private String name;
    private String owner;
    private int age;
    private boolean isMale;

    public Pet(String name, int age, boolean isMale) {
        this.name = name;
        this.age = age;
        this.isMale = isMale;
        this.owner = "";
    }

    public Pet(int age, boolean isMale) {
        this.age = age;
        this.isMale = isMale;
        this.owner = "";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean getIsMale() {
        return isMale;
    }

    public void beAdopted(String owner, String name) {
        this.owner = owner;
        this.name = name;
    }

    protected static boolean isNullOrEmpty(String s) {
        return s == null || "".equals(s);
    }

    protected boolean hasOwner() {
        if (isNullOrEmpty(owner) == false)
            return true;
        else
            return false;
    }

    public void changeName(String name) {
        if (hasOwner() == true) {
            this.name = name;
        }
    }
}
