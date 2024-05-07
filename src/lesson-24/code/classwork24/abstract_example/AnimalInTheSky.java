package classwork24.abstract_example;

abstract class AnimalInTheSky extends Animal { // можно сделать абстрактный класс, если не хчоется реализовывать все абстрактные методы из абстрактного родительского класса
    void fly() {
        System.out.println("Animal is in the sky");
    }
}
