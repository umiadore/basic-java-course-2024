package classwork.car.model;

public class Car {
    // на что вы обращаете внимание, подходя к машине?
    // на цвет - String color = white, red...
    // на марку (бренд) - String brand = maserati, bmw...
    // тип трансмиссии (авто или механика) -  boolean isManual = true, false
    // цена - int price = 100 000
    // год выпуска - int year = 2009, 2012, 2008...
    // пробег - int km = ...

    // поля (fields) - характеристики объекта, который есть в классе

    private String color;
    private String brand;
    private boolean isManual;
    private int price;
    private int year;
    private int km;

    // совокупность этих полей описывает (задает, формирует) объект

    // внизу появился конструктор по клавишам command N - generate - constructor
    public Car(String color, String brand, boolean isManual, int price, int year, int km) {
        this.color = color;
        this.brand = brand;
        this.isManual = isManual;
        this.price = price;
        this.year = year;
        this.km = km;
    }

    // getters and setters (геттеры и сеттеры)
    // геттеры - это методы, позволяет получить значения полей
    // сеттеры - это методы, позволяют установить значения полей

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isManual() { // это геттер, так как это булеан boolean и это is
        return isManual;
    }

    public void setManual(boolean manual) {
        isManual = manual;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public void moveCar() {
        System.out.println("Car is moving!");
    }
    public void displayCar () {
        System.out.println("Brand: " + brand + " , color: " + color + " ,  is it manual?  "+ isManual + ". The year is " + year + " , the Price is " + price );
    }

}
