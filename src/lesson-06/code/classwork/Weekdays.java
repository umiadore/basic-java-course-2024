package classwork;

import java.util.Scanner;

/*
Задание 3. Написать программу, которая по введенной цифре
от 1 до 7 определяет день недели. Второй вариант - на цифры от 1 до 5 программа
сообщает, что это будний день, а на 6 и 7, что это выходной.
 */
public class Weekdays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //scanner is on
        System.out.println("Input the number of the week: ");
        int day = scanner.nextInt();

        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tue");
            case 3 -> System.out.println("Wed");
            case 4 -> System.out.println("Thru");
            case 5 -> System.out.println("Friday");
            case 6 -> {System.out.println("sat");
                System.out.println("Its the 1st day of the weekend");
            }
            case 7 -> {
                System.out.println("sunday");
                System.out.println("Its the 2nd day of the weekend");
            }
            default -> System.out.println("Wrong Input");
        }

        switch (day){
            case 1,2,3,4,5 -> System.out.println("This is a workday");
            case 6,7 -> System.out.println("It is weekend!");
        }

    }
}
