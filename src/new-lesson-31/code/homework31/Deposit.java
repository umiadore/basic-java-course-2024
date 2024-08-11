package homework31;

import java.util.Objects;

public class Deposit {

    private double amount;
    private double rate;
    private int age;

    public Deposit(double amount, double rate, int age) {
        this.amount = amount;
        this.rate = rate;
        this.age = age;
    }

    // Метод, котоорый возвращает profit
    public double getProfit() {
        double myAmount = amount; // cоздаем новую переменную, чтобы сохранить изначальное колчиество денег
        double realRate = rate / 100 + 1; // 7% = 0.07 +1 = 1.07 ; так мы получаем процентную ставку
        for (int i = 0; i < age; i++) {
            myAmount *= realRate;
        }
        return myAmount - amount; // чтобы получить только прибыль
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Deposit deposit)) return false;
        return Double.compare(amount, deposit.amount) == 0 && Double.compare(rate, deposit.rate) == 0 && age == deposit.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, rate, age);
    }

    @Override
    public String toString() {
        return "Deposit{" +
                "amount=" + amount +
                ", rate=" + rate +
                ", age=" + age +
                '}';
    }
}
