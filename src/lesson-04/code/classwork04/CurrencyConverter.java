package classwork04;
/*
Реализовать метод, который принимает на вход сумму денег в евро,
а возвращает ее значение в долларах.
Значение курса задать внутри программы.
 */
public class CurrencyConverter {
    public static void main(String[] args) {

        double money = 358.50;
        double rate = 1.07;

        double resInUSD = convertToUSD(money,rate);
        System.out.println("Result = " + resInUSD);
        System.out.printf("Result = %.2f", resInUSD);


    } // end of main

    private static double convertToUSD(double money, double rate) {
        return money * rate;
    }


} // end of class
