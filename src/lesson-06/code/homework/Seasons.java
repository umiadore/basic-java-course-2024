package homework;

import java.util.Scanner;

/*
Задача 2. Пользователь с клавиатуры вводит число от 1 до 12,
программа сообщает, какому времени года принадлежит введенный месяц, и какое время года (ctpjy).
 */
public class Seasons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the number between 1 and 12");
        int month = scanner.nextInt();

        switch (month) {
            case 12,1,2 -> System.out.println("It is winter!");
            case 3,4,5 -> System.out.println("It is spring!");
            case 6,7,8 -> System.out.println("It is summer!");
            case 9,10,11 -> System.out.println("It is autumn!");

            default -> System.out.println("Wrong Input!");

        } // end of switch

    } // end of main
} // end of class
