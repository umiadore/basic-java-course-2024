package homework07;

import java.util.Scanner;

/*
Задача 3. Напишите программу, которая запрашивает у пользователя номер месяца
и выводит номер квартала, к которому этот месяц относится.
 */
public class Quartal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input your birth number");
        int number = scanner.nextInt();

        switch (number) {
            case 1,2,3 -> System.out.println("It is the first quarter!");
            case 4,5,6 -> System.out.println("It is the second quarter");
            case 7,8,9 -> System.out.println("It is third quarter!");
            case 10,11,12 -> System.out.println("It is the fourth quarter!");

            default -> System.out.println("Wrong Input!");

        }
    }
}
