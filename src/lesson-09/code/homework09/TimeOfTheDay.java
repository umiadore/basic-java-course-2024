package homework09;

import java.util.Scanner;

/*
Определение времени суток. Напишите программу, которая принимает на ход текущий час (от 0 до 23)
и выводит приветствие в зависимости от времени суток (утро, день, вечер, ночь).
 */
public class TimeOfTheDay {
    public static void main(String[] args) {
        int result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What time is it now? (Enter hours and minutes in 24-hour format)");
        System.out.print("Hours: ");
        int hours = scanner.nextInt();
        System.out.print("Minutes: ");
        int minutes = scanner.nextInt();
        scanner.close();

        if (hours >= 0 && hours < 24 && minutes >= 0 && minutes < 60) {
            int time = hours * 100 + minutes;
            if (time >= 0 && time < 600) {
                System.out.println("It is night!");
            } else if (time >= 600 && time < 1200) {
                System.out.println("It is morning!");
            } else if (time >= 1200 && time < 1800) {
                System.out.println("It is afternoon!");
            } else {
                System.out.println("It is evening!");
            }
        } else {
            System.out.println("Invalid time!");
        }
    }
}
