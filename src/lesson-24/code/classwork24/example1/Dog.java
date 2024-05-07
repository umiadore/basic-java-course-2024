package classwork24.example1;


public class Dog extends Pet {
    private double height;
    private DogProfession dogProfession; // назначение - дворовая, домашняя и тд

    // constructor
    public Dog(String name, int age, String breed, double weight, double height, DogProfession dogProfession) {
        super(name, age, breed, weight);
        this.height = height;
        this.dogProfession = dogProfession;
    }
    public void bark() {
        System.out.println("Woof - woof!");
    }

    //  getters x setters
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public DogProfession getDogProfession() {
        return dogProfession;
    }

    public void setDogProfession(DogProfession dogProfession) {
        this.dogProfession = dogProfession;
    }
}
