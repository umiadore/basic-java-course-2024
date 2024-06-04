package homework11;

import java.util.Scanner;

/*
Считать из консоли начальное значение, шаг и количество элементов числовой последовательности.
В этой последовательности каждый следующий элемент должен быть ровно на один шаг больше предыдущего.
Записать последовательность в массив, посчитать и вывести на экран сумму этих элементов.
Важно: для решения этой задачи существует математическая формула, но в данном задании нужно использовать
именно циклы и массивы. (Арифметическая прогрессия)
Пример 1:
    Ввод:
    1
    3
    4
    Вывод:
    Сумма = 22
 */
public class Main02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double initialValue = scanner.nextDouble(); // начальное значение
        double step = scanner.nextDouble();
        int amount = scanner.nextInt();

        double [] sequence = new double[amount]; // последовательность

        sequence[0] = initialValue;
        for (int i =0; i < amount -1; i ++){
          sequence[i +1] = sequence[i]  + step;
        }
        double sum = 0;
        for (int i = 0; i < sequence.length; i++) {
            sum +=sequence[i];
        }
        System.out.println("Sum: " + sum);
    }
}
