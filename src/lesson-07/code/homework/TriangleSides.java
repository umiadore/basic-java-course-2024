package homework;

import java.sql.SQLOutput;
import java.util.Scanner;

/*
Задача 6. Напишите программу, которая запрашивает
у пользователя длины трех сторон треугольника
и определяет его тип (равносторонний, равнобедренный, разносторонний).
 */
public class TriangleSides {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the a - side of the triangle");
        int a = scanner.nextInt();
        System.out.println("Input the b - side of the triangle");
        int b = scanner.nextInt();
        System.out.println("Input the c - side of the triangle");
        int c = scanner.nextInt();

        if (a == b && b == c && c == a) {
            System.out.println("Thats a Equilateral triangle");
        } else if (a == b && b < c && a <c) {
            System.out.println("Thats a Isosceles triangle ");
        }else {
            System.out.println("Thats a Scalene triangle");
        }
    }
}
