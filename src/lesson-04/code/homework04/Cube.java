package homework04;
/*
Задача 1. Написать приложение,
которое вычисляет объем куба по длине его ребра
и площадь его поверхности с помощью метода.
*/
public class Cube {
    public static void main(String[] args) {
        double n = 10.0d; // длина рeбра куба
        System.out.println("Cube Volume = " + cubeOfNumber(n));
        System.out.println("Surface Area of Cube = " + surfaceAreaOfCube( n));

    } // end of main
// methods should be written in between main and class

    public static double cubeOfNumber(double n){
        return n * n * n;
    }
    public static double surfaceAreaOfCube(double n){
        return 6 * n * n;
    }

} // end of class
