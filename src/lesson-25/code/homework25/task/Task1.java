package homework25.task;

import java.util.Scanner;

/*
1.Пользователь вводит в консоль 10 чисел.
2.Соберите их в массив и отсортируйте (любым способом, кроме заложенных в джава)
3. Бинарным поиском найдите число в этом массиве, которое пользователь введет 11ым. Выведите его индекс на экран

Усложнения для первого задания:
1. Вводится не 10 чисел, а строка содержащая числа, записанные через пробелы
2. Бинарный поиск обязательно должен быть реккурсивным
 */
public class Task1 {
    public static void main(String[] args) {

// Пользователь вводит в консоль 10 чисел.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input numbers");

        // Усложнение: Вводится не 10 чисел, а строка содержащая числа, записанные через пробелы
        String string = scanner.nextLine();
        String [] stringNumbers = string.split(" ");
        int [] array = new int[stringNumbers.length];
        for (int i = 0; i < stringNumbers.length; i++) {
            int number = Integer.parseInt(stringNumbers[i]);
            array[i] = number;
        }

        /* for (int i = 0; i < array.length; i++) {
            array [i] = scanner.nextInt();
        }
        */
        // Cоберите их в массив и отсортируйте (любым способом, кроме заложенных в джава)

        Sorting sorting = new Sorting();
        array = sorting.bubbleSort(array);

        int numberToFind = scanner.nextInt();

        int result = BinarySearch.binarySearch(array, numberToFind, 0, array.length -1);
        System.out.println(result);
    }
}
