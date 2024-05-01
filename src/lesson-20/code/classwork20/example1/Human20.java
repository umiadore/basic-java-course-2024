package classwork20.example1;

public class Human20 {
    public static String species = "Homo Sapiens";
    private String name;
    private int age;

    static { // конструктор тоже может быть таким
        species = "Homo Sapiens";
    }

    public Human20(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // getters x setters (aka accessors)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
