package homework26.enumTask;

import java.util.Objects;

/*
Необходимо создать класс "Человек", добавить в него поле "Тип пользователя" с енамом, остальные поля придумайте самостоятельно
 */
public class Human {
    private Type type;
    private String name;

    public Human(Type type, String name) {
        this.type = type;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Human{" +
                "type=" + type +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human human)) return false;
        return type == human.type && Objects.equals(name, human.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, name);
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}



