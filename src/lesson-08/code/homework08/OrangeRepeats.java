package homework08;

import java.util.Scanner;

/*
 The program receives as input a string and the number
 of repetitions of this string.
 The program should print this string required number of times.
 -
 Программа получает на вход строку и число повторений этой строки.
 Программа должна вывести эту строку нужное количество раз.
 Пример: строка - молоко, кол-во раз 3 молоко молоко молоко
 */
public class OrangeRepeats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the Word");
        String theWord = scanner.nextLine();

        System.out.println("Input the number of repeats");
        int repeats = scanner.nextInt();

        int count = 0;

        while (count < repeats) {
            System.out.println(theWord);
            count++;
        }
        System.out.println("The work is done, your word " + theWord + " has been repeated " + repeats + " times.");
    }
}