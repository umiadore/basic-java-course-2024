package classwork08;

import java.util.Scanner;

/*
Пользователь вводит натуральное число
(целое, положительное).
Выясните, сколько цифр в числе.
356712 - это ввел пользователь
Что должна выдать программа? Программа должна выдать: 6 цифр
 */
public class DigitsInNumbers {
    public static void main(String[] args) {

        /* Алгоритм:
        числа записываются в 10тичной системе счисления.
        каждый знак отвечает за разряд числа.
        на каждом шагу нашего алгоритма мы будем делить число
        на 10 с остатком.
        */

        /* Взаимодействие с пользователем:
        - Запросить у него число
        - Напечать число, равное количеству цифр
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Integer and a positive number: ");
        long number = scanner.nextLong(); // long если цифра большая, например, больше 9-10 знаков
        int counter = 0;

        while (number > 0 ) { // ноль больше нуля  - это false , мы выйдем из цикла когда счет будет 0

            number = number / 10; // деление дает  количество цифр в числе
            counter++; // посчитает столько раз это произойдет. увеличиваем счетчик
        }
        System.out.println("The Numbers of digits are " + counter);

    } // end of main
} // end of class

