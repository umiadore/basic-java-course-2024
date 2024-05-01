package homework22.string_practicum;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

/*
 Напишите программу, которая запрашивает строку от пользователя и затем:

сообщает сколько слов в строке
сообщает сколько букв (символов) в строке
печатает строку задом наперед, начиная с последнего слова.
 */
public class String_Practicum1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write anything");
        String str = scanner.nextLine();
        System.out.println("Write anything");

        // сообщает сколько слов в строке
        String [] words = str.split(" ");
        System.out.println("Number of words = " + words.length);
        System.out.println("------------------");

        //сообщает сколько букв (символов) в строке
        String [] letters = str.split("");
        System.out.println("Number of letters: " + letters.length);
        System.out.println("------------------");

        //печатает строку задом наперед, начиная с последнего слова
        String[] reverse = new String[words.length];
        for (int i = words.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = words[i];
        }
        String reversedStr = String.join(" ", reverse); // join использован для объединения элементов массива в строку с применением разделителя между ними.
        System.out.println("Reversed string: " + reversedStr);

    }
}
