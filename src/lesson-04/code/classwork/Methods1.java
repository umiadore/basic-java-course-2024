package classwork;

//1. Создайте метод, который возвращает целое число, противоположное по знаку.
//   Пример: число -46, метод возвращает 46.
//
//2. Создайте метод, который возвращает куб числа.
//   Пример: число 20, метод возвращает 8 000.
//
//3. Создайте метод, который принимает целое число и возвращает остаток от деления его на 2.
//   Пример: число 41, метод возвращает 1.

public class Methods1 {

    public static void main(String[] args) {
        int x = - 100;
        x = abs(x);
        System.out.println("x = " + x);

        double a = 10.0d; // задаем действительное число
        System.out.println("Cube = " + cubeOfNumber(a));

        int c = 57;
        System.out.println(c + "rest of division by 2 = " + restDivisionBy2(c) );

    } // end of main


    public static int restDivisionBy2 (int c){
        return c % 2;
    }

    public static double cubeOfNumber(double z){
        return z * z * z;
    }
    public static int abs(int number) { // это сигнатура метода (1 ая строчка каждого метода, называется его сигнатурой)
        return - number;

    }
} // end of class
