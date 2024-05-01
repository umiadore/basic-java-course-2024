package classwork;

import java.util.Scanner;

/*
Задание 1. Написать программу, которая по введенной
цифре от 1 до 7 определяет день недели.
Замените ввод цифры на первым двум буквам дня недели.
 */
public class Weekday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the 1st 2 letters of the weekday: "); // приглашение пользователю
        // int number = scanner.nextInt();

        String firstLetter = scanner.next();

        switch (firstLetter) {
            case "mo" -> System.out.println("Monday");
            case "tu" -> System.out.println("Tue");
            case "we" -> System.out.println("Wed");
            case "th" -> System.out.println("Thursday");
            case "fr" -> System.out.println("Friday");
            case "sa" -> System.out.println("Sat");
            case "su" -> System.out.println("Sunday");
        }

    } // end of main
} // end of class
