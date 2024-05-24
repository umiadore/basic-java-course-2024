package homework06;

import java.util.Scanner;

/*
Задача 4.(*) Написать приложение - калькулятор для работы с целыми числами:
oper == 1 => +, oper == 2 => -, oper == 3 => *, oper == 4 => /,
oper == 5 => % , other print "Wrong operation".
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter the first number");
        int first = scanner.nextInt();

        System.out.println("Enter the second number");
        int second = scanner.nextInt();

        System.out.println("Choose an operation");
        int oper = scanner.nextInt();

        switch (oper) {
            case 1 -> System.out.println("Result: " + (first + second));
            case 2 -> System.out.println("Result: " + (first - second));
            case 3 -> System.out.println("Result: " + (first * second));
            case 4 -> {
                System.out.println("Result: " + (first / second));
                if (second != 0) {
                    oper = first / second;
                } else {
                    System.out.println("You are trying to divide by zero!");
                }
            }
            case 5 -> System.out.println("Result: " + (first % second));

            default -> System.out.println("Wrong Input");
        }

    } // end of main
} // end of class
