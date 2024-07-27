package classwork41;

import java.util.Objects;

public class Car {
    private String name;
    private Engine engine;
    public void ride ()  {
        System.out.println("Перед поездкой нужно запустить двигатель");
        engine.startEngine();
        System.out.println("Yalla");
    }

    public Car(String name, Engine engine) {
        this.name = name;
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return Objects.equals(name, car.name) && Objects.equals(engine, car.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, engine);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", engine=" + engine +
                '}';
    }

    public class Engine {
        public void startEngine ()  {
            System.out.println("Двигатель запущен");
        }
        public void stopEngine() {
            System.out.println("Двигатель остановлен");
        }
    }
}
