package homework39.parcel;

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
    private LocalDateTime localDateTime;

    public Parcel(String fromCity, String toCity, double weight, LocalDateTime localDateTime) {
        this.fromCity = fromCity;
        this.toCity = toCity;
        this.weight = weight;
        this.localDateTime = localDateTime;
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

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Parcel parcel)) return false;
        return Double.compare(weight, parcel.weight) == 0 && Objects.equals(fromCity, parcel.fromCity) && Objects.equals(toCity, parcel.toCity) && Objects.equals(localDateTime, parcel.localDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fromCity, toCity, weight, localDateTime);
    }

    @Override
    public String toString() {
        return "Parcel{" +
                "fromCity='" + fromCity + '\'' +
                ", toCity='" + toCity + '\'' +
                ", weight=" + weight +
                ", localDateTime=" + localDateTime +
                '}';
    }
}
