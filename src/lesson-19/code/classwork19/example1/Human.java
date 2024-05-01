package classwork19.example1;

public class Human {
    public static final String SPECIES = "homo sapiens"; // все константы относятся к классам а не к объектам, все константы не изменяемые,
    private String name;
    private int age;

    public Human (String name, int age) {
        this.name = name;
        this. age = age;
    }

    public String getName () {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >=0) {
        this.age = age;
    }
    }

    public void sayHello () {
        System.out.println("Hello, my name is "+ name + " and i am " + age + " old");
    }
    public static void celebrateBday (Human human) { // static потому что статичный, не привязано к объекту
        System.out.println(human.name + " is celebrating bday ");
        human.age ++;
        System.out.println("He is now " + human.age + " years old.");
    }

    public static void meet (Human h1, Human h2) {
        System.out.println(h1.name + " and " + h2.name + " met!");
        h1.sayHello();
        h2.sayHello();
    }
}
