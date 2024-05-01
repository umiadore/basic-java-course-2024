package classwork03;
//// 3. Вычислить длину окружности по ее радиусу (задается в программе).
// L (длина) = 2 * Pi * R (радиус ) - это то как вычисляется длина окружности
public class Circle {
    public static void main(String[] args) {

        double constanta = pi ();
        System.out.println(constanta);

        printPi(constanta);

        double radius = 100;
        double result = circlelenght (radius);
        System.out.println("L = " + result);

    } // end of main

    private static double circlelenght(double radius) {
        double l = 2 * pi() * radius;
        return l;
    }

    private static void printPi(double p) {
        System.out.println("Pi = " + p);
    }

    private static double pi() {
        double p = 3.1415926536;
        return p;
    }
} // end of class
