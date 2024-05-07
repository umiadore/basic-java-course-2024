package classwork24.abstract_example;

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof");
    }

    void swim() {
        System.out.println("Dog is swimming");
    }
}
