package classwork24.abstract_example;

abstract class Animal {
    abstract void makeSound(); // в этом абстрактом классе задан метод абстранктный который ничего не возвращает

    void breathe() {
        System.out.println("Animal is breathing");
    }
}
