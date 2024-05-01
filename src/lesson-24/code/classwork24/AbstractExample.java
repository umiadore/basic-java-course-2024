package classwork24;

import java.security.cert.CertPath;

abstract class Animal {
    abstract void makeSound (); // в этом абстрактом классе задан метод абстранктный который ничего не возвращает
    void breathe () {
        System.out.println("Animal is breathing");
    }
}

class Cow extends Animal  {

    @Override
    void makeSound() {
        System.out.println("Moo");
    }
}
class Dog extends Animal {
    @Override
    void makeSound () {
        System.out.println("Woof");
    }

    void swim () {
        System.out.println("Dog is swimming");
    }
}
class Cat extends Animal {
    @Override
    void makeSound () {
        System.out.println("Meow");
    }
}

abstract class AnimalInTheSky extends Animal  { // можно сделать абстрактный класс, если не хчоется реализовывать все абстрактные методы из абстрактного родительского класса
    void fly ()  {
        System.out.println("Animal is in the sky");
    }
}
class Bird extends AnimalInTheSky {
    @Override
    void makeSound() {
        System.out.println("Chirik - Chirik");
    }
}

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