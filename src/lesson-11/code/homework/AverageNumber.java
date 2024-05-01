package homework;
/*
Задача 2. Написать метод, принимающий массив целых чисел,
и возвращающий среднее арифметическое всех его элементов.
 */
public class AverageNumber {
    public static void main(String[] args) {
        int[] numbers = {12, 15, 28, 45, 48};

        int sumOfNumbers = 0;

        for (int i = 0; i < numbers.length; i++) {
            sumOfNumbers += numbers[i];
        }

        double averageNumber = (double) sumOfNumbers / numbers.length;
        System.out.println("Average Number: " +  averageNumber);
        System.out.printf("Average Number: %.2f", averageNumber);
    }
}
