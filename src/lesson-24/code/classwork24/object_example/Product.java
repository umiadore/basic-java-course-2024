package classwork24.object_example;

import java.util.Objects;

public class Product {
    private long id;
    private String name;
    private double price;
// Constructor
    public Product(long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Accessors (getters x setters)

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Overriding the method(переопределение метода)
    @Override
    public String toString () {
        return "id: " + this.id
                + ", name: " + this.name
                + ", price: " + this.price;
    }

    @Override
    public int hashCode ()  {
        return Objects.hash(id, name, price);
    }

    @Override
    public boolean equals (Object o) {
        if (o == this) { // если переданный объект равен текущему (проверка ссылки)
            return true;
        }
        if (o instanceof Product) {
            Product p = (Product) o; //typecast; проверка типа, если он не прошел , то сразу false

            return p.name.equals(this.name)
                    && p.id == this.id
                    && p.price == this.price; // проверка значений
        }
        return false; // этот return относится к проверки типа, пишется всегда после фигурной скобки
    }
}
