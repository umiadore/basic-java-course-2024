package homework;

import java.util.Scanner;

/*
Задача 2. Напишите программу, которая запрашивает у пользователя число
и проверяет, принадлежит ли оно заданному интервалу [a, b].
 */
public class Interval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 28;
        int b = 72;

        System.out.println("Input any integer");
        int number = scanner.nextInt();

        if (number >= a && number <= b) {
            System.out.println("Your number belongs to this interval");
        } else {
            System.out.println("Your number does not belong to this interval");
        }
    }
}
