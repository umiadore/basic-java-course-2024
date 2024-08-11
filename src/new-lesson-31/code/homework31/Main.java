package homework31;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
1. Пользователь вводит в консоли число - количество данных, которые будет вводить
2. Далее пользователь начинает ввод данных через консоль (кол-во данных = числу, введенному ранее)
3. В каждой строке пользователь вводит:
3.1 Количество денег, которые он хочет положить на вклад
3.2 Процент по вкладку
3.3 Количество лет (длительность вклада)
Необходимо:

1. Посчитать, сколько пользователь заработает с каждого вклада
2. Найти самый выгодный вклад (по наибольшему доходу от вклада)
3. Найти среднюю прибыль с каждого вклада

!!!Решать с использованием листа (ArrayList или LinkedList)!!!
Дополнительное задание (не обязательное):

1. посчитать время работы в наносекундах с ArrayList и с LinkedList
Усложненное задание:
1. вместо ввода из консоли - пользователь вводин данные из  ввод из файла
Пример ввода данных (вы можете задавать любым другим образом):

2.
1000 2 5                      (1000 евро на 2 года под 5%)
500 5 10                      (500 евро на 5 лет под 10%)
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишите количество вкладов");
        String str = scanner.nextLine();
        int numberOfDeposits = Integer.parseInt(str);
        // Список, который будет хранить все значения
        List<Double> profits = new ArrayList<>();

        for (int i = 0; i < numberOfDeposits; i++) {
            System.out.println("Введите сумму, процент ставки и количество лет ");
            String depositLine = scanner.nextLine();
            String [] data = depositLine.split(" ");
            double amount = Double.parseDouble(data [0]);
            double rate = Double.parseDouble(data [1]);
            int age = Integer.parseInt(data [2]);

            Deposit deposit = new Deposit(amount, rate, age);
            double profit = deposit.getProfit();
            profits.add(profit); // записываем в список всю прибыль

            System.out.println("Прибыль у этого депозита " + profit);
        }
       // Найти самый выгодный вклад (по наибольшему доходу от вклада)
// Найти среднюю прибыль с каждого вклада
        double max = Double.MIN_VALUE;
        int maxIndex = -1;
        double sum = 0.0;

        for (int i = 0; i < profits.size(); i++) {
            if (profits.get(i) > max) {
                max = profits.get(i);
                maxIndex = i;
            }
            sum += profits.get(i);
        }
        System.out.println("Средняя прибыль:" + sum / profits.size());
        System.out.println("Максимально доходный вклад под индексом: "+maxIndex);


    }
}
