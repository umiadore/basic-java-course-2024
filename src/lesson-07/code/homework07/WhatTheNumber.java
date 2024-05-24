package homework07;

import java.sql.SQLOutput;
import java.util.Scanner;

/*
Задача 4. Напишите программу, которая запрашивает у пользователя
два числа и выводит наибольшее из них.
 */
public class WhatTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first number");
        int a = scanner.nextInt();
        System.out.println("Input the second number");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("The number " + a + " is bigger than " + b);
        } else  {
            System.out.println("The number " + b + " is bigger than " + a);
        }

    }
}
