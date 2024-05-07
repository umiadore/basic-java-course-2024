package classwork23.inheritance_example;

public class Inheritance_example {
    public static void main(String[] args) {
        Dog dog = new Dog("Richard", 6, "Golden retriever", 15, 50, DogProfession.DOMESTIC);
        Cat cat = new Cat("Vasya", 4, "Egyptian",1.5, false);
        Pet fish = new Pet("Kate",1, "Gold fish", 0.2);

        dog.bark();
        cat.meow();
    }
}
