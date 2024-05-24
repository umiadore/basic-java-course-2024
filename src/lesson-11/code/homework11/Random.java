package homework11;
import java.util.Scanner;

/*
Задача 1. Задайте массив из 10 случайных целых чисел в интервале от -20 до 20.
Запросите у пользователя какое-то целое число.
Определите, есть ли это число в массиве.
Создайте и используйте метод searchInArray,
который получает на вход массив и искомое число,
а возвращает ответ - нашлось ли это число в массиве.
 */
public class Random {
    public static void main(String[] args) {
        int[] randomNumber = {-20, -15, -8, -6, -1, 5, 12, 16, 18, 20};
        System.out.println(randomNumber.length); // This prints the length of the array

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer to search in the array:");
        int searchNumber = scanner.nextInt();

        if (searchInArray(randomNumber, searchNumber)) {
            System.out.println("The number " + searchNumber + " is found in the array.");
        } else {
            System.out.println("The number " + searchNumber + " is not found in the array.");
        }
    }
    public static boolean searchInArray(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }
}