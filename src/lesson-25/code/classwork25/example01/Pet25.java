package classwork25.example01;

public abstract class Pet25 {
    private String name;
    private int age;

    public Pet25(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void feed(); // кормить
    public abstract void cleanUp(); // убирать за питомцами

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
