import java.util.Scanner;
/*
Вводится шестизначное чисто ;номер автобусного билета.
Определите является ли этот билет счастливым (cумма первых трех
равна сумме последних трех)
 */
 public class HappyTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input 6 numbers");
        int ticketNumber = scanner.nextInt();

        // String [] ticketNumberDigits = ticketNumber.split("") // разбиваем строку по символьно
        // int i = 0; // выступает в роли счестчика

        if (!(ticketNumber >=100000 && ticketNumber <=999999)) {
            System.out.println("Значение некорректное");
            System.exit(-1); // или return;
        }
        // нам нужно написать цикл который сделает 6 операций и посчитает нам необходимый ответ

        int sum1=0; // сумма младших трех разрядов
        int sum2=0; //сумма старшиъ трех разрядов

        int divider = 1; // делитель
       // цикл для младших трех разрядов
        while (divider <=100) {
           int digit = ticketNumber /divider %10;  // так мы получим цифру стояющую на том или ином разряде
        sum1 = sum1 + digit;
        divider = divider *10;
        }
        // divider уже равен 1000
        // цикл для cтарших трех разрядов
        while (divider <=100000) {
            int digit = ticketNumber /divider %10;  // так мы получим цифру стояющую на том или ином разряде
            sum2 = sum2 + digit;
            divider = divider *10;
    }
        System.out.println("sum1 = " + sum1);
        System.out.println("sum2 = " + sum2);

        if (sum1 == sum2) {
            System.out.println("Счастливый билет!");
        } else {
            System.out.println("Повезет в любви");
        }
    }
}
