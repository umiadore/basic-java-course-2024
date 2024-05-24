package homework03;

/*
1. Метод вычисляющий площадь круга;
2. Метод вычисляющий площадь квадрата;
3. Метод вычисляющий площадь прямоугольника (чуть сложнее чем 1. и 2.);
4. В методе main вызвать вышеуказанные методы с различными аргументами,
и результаты вывести в консоль. Например: площадь круга для R = 200,
площадь квадрата со стороной 500,
площадь прямоугольника со сторонами 1000 и 2000.
 */
public class HomeWork1 {

    public static void main(String[] args) {
        double radius = 200;
        double s = calcCircleArea(radius);
        System.out.println("radius = " + radius + ", circle area = " + s);

        double side = 500;
        double squareArea = calcSquareArea(side);
        System.out.println("side = " + side + ", square area = " + squareArea);

        double a = 1000;
        double b = 2000;
        System.out.println("Square of rectangle = " + calcSquareRectangle(a, b));

    }

    private static double calcSquareRectangle(double a, double b) {
        return a * b;
    }

    private static double calcSquareArea(double side) {
        return Math.pow(side, 2);
    }

    private static double calcCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

}
