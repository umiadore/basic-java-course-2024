package homework08;

import java.util.Scanner;

/*
Задача 4. (*) Вводится шестизначное число (номер автобусного билета).
Определите, является ли этот билет "счастливым"
(сумма первых трех цифр равна сумме трех последних цифр).
 */
public class LuckyTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your ticket´s number");
        int ticketsNumber = scanner.nextInt();

        int sumOfFirstThree = 0;
        int sumOfLastthree = 0;
        int tempTicketNumber = ticketsNumber;

        int count = 0;
        // Вычисляем сумму первых трех цифр
        while (count < 3) { // цикл while выполняется до тех пор, пока count меньше 3. Это означает, что цикл будет повторяться только три раза, поскольку мы хотим обработать первые три цифры номера билета.
            sumOfFirstThree = sumOfFirstThree + tempTicketNumber %10;

            tempTicketNumber = tempTicketNumber/10;// Убираем последнюю цифру из числа
            count ++; // Увеличиваем счетчик обработанных цифр
        }
        // Сбрасываем значение tempTicketNumber на исходное значение
        count = 0;
        while (count <3) {
            sumOfLastthree = sumOfLastthree +tempTicketNumber %10;
            tempTicketNumber = tempTicketNumber /10;
            count ++;
        }
        if (sumOfFirstThree == sumOfLastthree)  {
            System.out.println("You have a lucky ticket");
        } else  {
            System.out.println("You´re loved");
        }
    }
}