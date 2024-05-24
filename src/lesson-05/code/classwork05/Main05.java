package classwork05;

import java.util.Scanner;

/*
Пользователь вводит 3 числа: число, нижняя и верхня границы диапазона.
Вывести на экран true, если число будет в указанном диапазоне.
 */
public class Main05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number 1:");
        int number = scanner.nextInt(); // число
        System.out.println("Input number 2:");
        int minNumber = scanner.nextInt(); // нижняя граница
        System.out.println("Input number 3:");
        int maxNumber = scanner.nextInt(); // верхняя граница

        boolean intRange = number > minNumber && number < maxNumber;  // число должно быть больше минимального и меньше максимального
        System.out.println(intRange);
    }
}
