package classwork;
/*
Задача 1. Подбросьте монетку 100 раз. Сколько раз выпала решка?
Сколько орел? Сравните итоговые вероятности выпадения орла и решки.
 */
public class Coin {
    public static void main(String[] args) {

        int [] coin = new int[100]; // задаем массив
        int a = 0;
        int b = 1;

        // fill array
        ArrayMethods.fillArray(coin, a, b);
        ArrayMethods.printArray(coin);

        int heads =0; //орел
        int tails =0; // решка

        for (int i = 0; i < coin.length; i++) {
            if (coin [i] == 0) {
                heads++;
            } else {
                tails++;
            }
        }
        System.out.println("Heads = " + heads + " possibility: " + (double) heads/ coin.length);
        System.out.println("Tails = " + tails + " possibility: " + (double) tails/ coin.length);
    }
}
