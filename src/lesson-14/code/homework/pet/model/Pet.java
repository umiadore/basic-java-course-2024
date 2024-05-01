package homework.pet.model;
/*
Задача 1. Создать класс Pet (Домашнее животное) с приватными полями:
    id
    вид
    возраст
    кличка
Стандартные методы:
    конструктор на все поля;
    геттеры и сеттеры на все поля;
    метод toString.
Дополнительные методы:
    спать
    есть
    делать звук
    играть
    гулять
 */
public class Pet {
    private int id;
    private String type;
    private int age;
    private String name;

    //constructor

    public Pet(int id, String type, int age, String name) {
        this.id = id;
        this.type = type;
        this.age = age;
        this.name = name;
    }
    // getters x setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
    public void sleep (){
        System.out.println("the pet goes to sleep");
    }
    public void eat (){ System.out.println("The pet eats a lot");
    }
    public void noise (){ System.out.println("the pet usually makes noise");}
    public void play (){ System.out.println(" plays");}
    public void walk (){ System.out.println("The pet goes for a walk");}
}
