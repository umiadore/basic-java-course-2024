package homework23.grocery.model;
/*
В классе Человек должно быть поле "имя" и метод "представиться", который будет выводить
приветствие и имя человека.
 */
import java.sql.SQLOutput;

public class Human {
    private String name;

    private void introduce() {
        System.out.println("Hi, my name is " + name);
    }

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void inroduce() {
    }
}
