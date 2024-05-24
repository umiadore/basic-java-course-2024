package classwork07;

import java.util.Scanner;

/*
Задание 3. Написать программу для конвертации евро в три валюты - доллар,
фунт стерлингов и швейцарский франк.
Для каждой валюты реализуйте свой метод конвертации.
Не допускайте ввода некорректных (отрицательных)
значений обмениваемой валюты.
 */
public class CurrencyConvert0r {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which currency do you have? (USD, CHF, GBP,) ");
        String currency = scanner.nextLine();
        System.out.println("How much money do you have?");
        double sum = scanner.nextDouble();

        double result = 0;
        double rateUSD = 1.08;
        double rateCHF = 0.95;
        double rateGBP = 1.17;

        switch (currency) {
            case "USD" -> result = exchange (sum, rateUSD);
            case "CHF" -> result = exchange (sum, rateCHF);
            case "GBP" -> result = exchange (sum, rateGBP);
            default -> System.out.println("Wrong Input");
        } // end of switch

        System.out.println("Please, take your money in euro: " + result);

    } // end of main

    private static double exchange(double sum, double rate) {
        return sum / rate;
    }
  }

/* Алгоритм для решения задач по программированию
Шаг 1. Что дано? Выписать все, что дано в задаче, продумать типы и имена необходимых переменных.
-  три валюты - double, имена для валют euro, usd, frank, pound, currency rate.
 euro - usd: 1.08
 euro - pound: 1.17
 euro - frank: 0.95
как меняем валюту? - мы имеем евро, нам приносят валюту

Шаг 2 Что нужно сделать? Выписать все, что нужно найти или сделать в рамках задачи.
Продумать типы и имена необходимых переменных, продумать возможные необходимые методы.

- метод converter: он получает на вход double - количество валюты, метод должен
рассчитать количество евро, которое нам надо отдать за эту валюту.
кол-во евро = кол-во валюты * курс

Шаг 3. Как это уже решали? Найти фрагменты похожего кода,
решения похожих задач от которых можно оттолкнуться и решить "по аналогии" свою задачу.

- convertor, switch case в программе калькулятор

Шаг 4. Какой самый важный, сложный момент в задаче?
Продумать, написать по шагам ключевой алгоритм, который позволяет решить поставленную задачу.

- сделать расчет сколько денег отдать

Шаг 5. Как будет работать программа? Продумать интерфейс взаимодействия с пользователем.

- консоль, scanner, запрос - ответ, вывод в консоль.

Имея в голове ответы на все 5 вопросов, пройдя эти 5 шагов, можно приступать к написанию кода!
*/