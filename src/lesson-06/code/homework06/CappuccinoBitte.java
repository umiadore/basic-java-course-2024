package homework06;

import java.util.Scanner;

/*
Задание 4. Написать программу для "Кофе-машины",
которая позволяет пользователю выбрать напиток:
Эспрессо
Американо
Латте
Капучино
После выбора программа должна сообщить стоимость выбранного напитка.
 */
public class CappuccinoBitte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // the scanner is on
        System.out.println("Please select your drink");
        int drink = scanner.nextInt();

        switch (drink) {
            case 1 -> System.out.println("Espresso");
            case 2 -> System.out.println("Americano");
            case 3 -> System.out.println("Latte");
            case 4 -> System.out.println("Cappuccino");

            default -> System.out.println("Wrong Input");
        }
        switch (drink){
            case 1,2 -> System.out.println("1,5 euro");
            case 3,4 -> System.out.println("2 euro");
        }
        scanner.close();
    } // end of main
} // end of class