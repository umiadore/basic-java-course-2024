package classwork24.abstract_example;

class AbstractExample {
    public static void main(String[] args) {
// Animal animal = new Animal(); - из Animal нельзя инстанциировать, то есть создавать объекты из него, потому что он abstract

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow ();
        Bird bird = new Bird ();

        dog.makeSound();
        cat.makeSound();
        cow.makeSound();
        bird.makeSound();

        System.out.println("_______________");
        Animal[] animals = { new Dog(), new Cat(), new Cow(), new Bird()}; // Объявлен общий массив как животные и все животные воспринимаются как объекты типа animal

        for (Animal animal: animals) {
            animal.makeSound(); // преобразованием типов идущих вверх
        }
        }
    }