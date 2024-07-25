package homework25.task;

import java.util.Scanner;
/*
1. Пользователь вводит два числа - начальное и конечное число. +
2. Выведите на экран все числа в этом промежутке, НО решите задание обязательно через реккурсию
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first integer");
        int first = scanner.nextInt();
        System.out.println("Input the last integer");
        int last = scanner.nextInt();
        System.out.println(first + " and " + last);

        printNumbers(first,last);

    }
    public static void printNumbers(int first, int last) {
        if (first > last) {
            return;
        }
        if (first < last) {
        System.out.print(first + " , ");
    } else {
        System.out.print(first);
    }
        printNumbers(first + 1, last);
    }
}

class TaskSecond  {
    public static void main(String[] args) {
        method(10,5);
    }
    public static void method (int start, int end)  {
        System.out.println(start);

        if (start == end) {
            return;
        }

       if (start < end) {
         method(start+1, end);

        } else   {
            method(start -1, end);
        }
    }  }
