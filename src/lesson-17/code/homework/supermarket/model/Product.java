package homework.supermarket.model;
/*
создать класс product, с полями
 */
public class Product {
    private double price;
    private String name;
    private long barCode;

    public Product(double price, String name, long barCode) {
        this.price = price;
        this.name = name;
        this.barCode = barCode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBarCode() {
        return barCode;
    }

    public void setBarCode(long barCode) {
        this.barCode = barCode;
    }

    @Override
    public String toString() {
        return "Product" +
                "price=" + price +
                ", name='" + name  +
                ", barCode=" + barCode;
    }

    @Override
    public boolean equals(Object o) { // объект типа обджект пришедший на сравнение
        if (this == o) return true; // если это тот продукт, который мы и ищем, то мы возвращаем "истину"
        if (o == null || getClass() != o.getClass()) return false; // если null (несущетвующий продукт или продукт не нашего класса) не равен, то это "ложь"
        Product product = (Product) o; // делаем кастинг до нужного нам класса
        return barCode == product.barCode; // сравниваем баркоды
    }

    @Override
    public int hashCode() {
        return (int) (barCode ^ (barCode >>> 32));
    }
}
