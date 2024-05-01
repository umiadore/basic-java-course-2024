package classwork;

import java.util.Scanner;

/*
Задание 1. В программе задаются два целых числа.
Найдите минимальное из них с помощью тернарного оператора.
Дополните программу возможностью ввода чисел пользователем.
 */
public class TernaryOperator {
    public static void main(String[] args) {
        int a = 145;
        int b = -85;

        Scanner scanner = new Scanner(System.in); // таким образом мы включили сканнер
        System.out.println("Input 1st number:"); // приглашение пользователю
        a = scanner.nextInt(); // получаем значение с клавиатуры
        System.out.println("Input 2nd number:"); // приглашение пользователю
        b = scanner.nextInt(); // получаем значение с клавиатуры

        int min  = (a < b) ? a : b;  // это и есть тернарный оператор
        System.out.println("Minimum:" + min);
    }
}
