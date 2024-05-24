package homework05;

import java.util.Scanner;

/*
Вы работаете предпринимателем в сфере айти. В вашем регионе, вам нужно каждый месяц платить 3% налога в пенсионный фонд, и 15% налога на заработок.
• Разработайте программу, в которую можно ввести фактическую прибыль за месяц, и программа напишет сколько нужно заплатить налогов, и сколько будет ваша чистая прибыль.
• Например, при фактической прибыли 10000 евро, ваш налог в пенсионный фонд составит 300 евро, а налог на заработок 1500 евро, и чистая прибыль составит 8200 евро
 */
public class Taxes {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your monthly income");
    int income = scanner.nextInt();
    float socialTax = income * 0.03f;
    float incomeTax = income * 0.15f;

        System.out.println("Pension fund tax: " + socialTax);
        System.out.println("Income tax: " + incomeTax);
        System.out.println("Total profit: " + (income - incomeTax - socialTax));
}
}