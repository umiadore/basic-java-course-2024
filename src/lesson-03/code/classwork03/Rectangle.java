package classwork03;

// Вычислить площадь прямоугольника.
// Задайте длину и ширину прямоугольника как переменные типа double.

public class Rectangle {
    public static void main(String[] args) {

        double a = 123.5;
        double b = 34.7;

        double area = a * b;

        System.out.println("Rectangle area width = " + a + " height = " + b + " = " + area);

        double result =  areaOfRectangle ( a, b);
        System.out.println("area = " + result);

    }
// решение с помощью метода:
    private static double areaOfRectangle(double a, double b) {

        return a * b;
    }
}
