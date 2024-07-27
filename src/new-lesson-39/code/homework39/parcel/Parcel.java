package homework39.parcel;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Objects;

/*
Создайте класс "посылка".
2.1 Добавьте поля: город отправления и город получения, вес посылки, дата-время создания посылки
 (посылки могут создаваться по всему миру, очень много часовых поясов, нам важна не конкретная дата,
а лишь какая посылка была создана ранее, чем другая)
2.2 Создать несколько посылок
2.3 Найти самую новую посылку среди тех, кто отправляется в Берлин
 */
public class Parcel {
    private String fromCity;
    private String toCity;
    private double weight;
    private Instant date;

    public Parcel(String fromCity, String toCity, double weight, Instant date) {
        this.fromCity = fromCity;
        this.toCity = toCity;
        this.weight = weight;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Parcel{" +
                "fromCity='" + fromCity + '\'' +
                ", toCity='" + toCity + '\'' +
                ", weight=" + weight +
                ", date=" + date +
                '}';
    }

    public String getFromCity() {
        return fromCity;
    }

    public void setFromCity(String fromCity) {
        this.fromCity = fromCity;
    }

    public String getToCity() {
        return toCity;
    }

    public void setToCity(String toCity) {
        this.toCity = toCity;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Instant getDate() {
        return date;
    }

    public void setDate(Instant date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Parcel parcel)) return false;
        return Double.compare(weight, parcel.weight) == 0 && Objects.equals(fromCity, parcel.fromCity) && Objects.equals(toCity, parcel.toCity) && Objects.equals(date, parcel.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fromCity, toCity, weight, date);
    }
}
