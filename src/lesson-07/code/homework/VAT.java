package homework;

import java.util.Scanner;

/*
Напишите прогармму, которая запрашивает у пользователей
их доход и вычисляет сумму налога согласно прогрессивной
шкале нелогооблажения,(например, 10% на доход до 10 000,
20% на доход от 10 001 до 20 000 и т.д.).
 */
public class VAT {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How much do you earn per month?");
        double income = scanner.nextDouble();

        if(income <= 10000){
            System.out.println("Taxes = " + income * 0.1);
        } else if (income >= 10001 && income <= 20000) {
            System.out.println("Taxes = " + income * 0.2);
        } else {
            System.out.println("Taxes = " + income * 0.3);
        }
    } // end of main
} // end of class
