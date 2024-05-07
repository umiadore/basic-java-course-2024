package classwork24.example1;

public class Cat extends Pet {
    private boolean hasFur;
    public Cat(String name, int age, String breed, double weight, boolean hasFur) {
        super(name, age, breed, weight);
        this.hasFur = hasFur;
    }

    public void meow() {
        System.out.println("Meow meow!");
    }
    public boolean HasFur() {
        return hasFur;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }
}
