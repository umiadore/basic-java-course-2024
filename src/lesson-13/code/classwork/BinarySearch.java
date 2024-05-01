package classwork;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        // we have to create an array
        int a = - 10;
        int b = 10;
        int [] numbers = new int[10]; // мы говорим что у нас будет новый массив на 10 рандомных эелементом
        ArrayMethods.fillArray(numbers, a, b); // заполняем
        ArrayMethods.printArray(numbers); // печатаем

        // we have to sort array
        ArrayMethods.bubbleSort(numbers); // сортируем
        ArrayMethods.printArray(numbers); // to see the result of the sorting

        // before sorting there is no need to use binary search, bc the algorithm is not going to work when the arrays are not sorted
        // we create a binary search
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input an integer number: ");
        int num = scanner.nextInt();

        int index = ArrayMethods.binarySearch(numbers, num); // array and the number we are going to input
        System.out.println("Index = "+ index);

    } // end of main
} // end of class
