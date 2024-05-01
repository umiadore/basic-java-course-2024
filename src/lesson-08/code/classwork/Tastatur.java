package classwork;

import java.util.Scanner;

/*
Пользователь вводит с клавиатуры строку.
Распечатайте каждую букву строки на новой строчке.
Используйте методы length и charAt() класса String.
 */
public class Tastatur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the string"); // string - это строка

        String str = scanner.nextLine();
        int lenght = str.length(); // узнали длину строки
        int count = 0; // счетчик в строке String идет с нулевой позиции, с нулевого индекса

        while ( count < lenght) {
            System.out.println(str.charAt(count));
            count++; // инкримент , мы его растим до значения lenght
        }

    } // end of main
} // end of class
