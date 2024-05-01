package homework;

import java.util.Scanner;

/*
Enter a positive integer, find the sum of its digits.
Вводится положительное целое число, найдите сумму его цифр.
Пример: 1725, сумма цифр = 15
 */
public class PositiveInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a positive number");
         int number = scanner.nextInt();

         while (number <= 0){ // меньше или равно нулю
             System.out.println("Wrong input! Try again"); // чтобы к примеру если выпишут отрицательное число,
             // то выдавало ошибку, нужно ставить перед основным циклом while
             number = scanner.nextInt();
         }
         int sumOfDigits = 0;
         int inputNum = number;

         while (number > 0) { //больше нуля. Применение операции взятия остатка от деления на 10 внутри цикла while обеспечивает правильное извлечение каждой цифры числа на каждой итерации.
         sumOfDigits = sumOfDigits + number %10; // Когда мы берем остаток от деления на 10 числа, мы получаем последнюю цифру этого числа. Это основной шаг для вычисления суммы цифр числа.
         number = number/10;

         }
        System.out.println("Sum of digits: " + inputNum + " = " + sumOfDigits);
    }
}
