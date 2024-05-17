package classwork09;
import java.util.Scanner;
/*
Пользователь вводит натуральное число n.
Определите, является ли оно простым.
Простое число - это такое число,
которое делится **только** на себя и на 1.
Примеры: 2, 3, 5, 7, 11, 13, 17, 19, ...
Обеспечьте защиту от ввода пользователем отрицательных чисел.
 */
public class PrimeNumber { //простое число
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input integer and a positive number");
        int number = scanner.nextInt(); // он будет принимать целое число поэтому сканнер

        while (number <=0){
            System.out.println("Wrong Input. Try again.");
            number = scanner.nextInt(); // еще раз, чтобы не делать ошибки так как мы вставляем ограничения
        }

        // *пользователь ввел какое-то число*
        // пользователь ввел 65, будем пробовать разделить на 2,3,4,5... на все числа до 65.
        // если число разделится хоть раз на какое-то число без остатка, то это будет НЕ простое число
        // а иначе это будет простое число

        boolean isPrime = true; // boolean потому что нужно узнать простое или не простое то бишь false or true
        int division = 2;

        while (division < number) {
            if (number %division == 0) {
                isPrime = false;
            }
            // чтобы цикл закрутился нужен параметр
            division++; // перебираем параметр, растим дивижн
        }
        System.out.println(" if " + number + " is prime? " + isPrime);
    } // end of main
} // end of class
