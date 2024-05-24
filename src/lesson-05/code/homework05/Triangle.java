package homework05;
/*
Задача 1. Задать в программе три стороны треугольника.
Проверить выполнимость неравенства треугольника
- любая из сторон должна быть меньше суммы двух других.
Сообщить результат - существует или нет треугольник с заданными сторонами.
 */
public class Triangle {
    public static void main(String[] args) {
        int a = 4;
        int b = 4;
        int c = 15;

        if (a + b <= c && a + c <= b && b + c <= a){
            System.out.println("The Validity of the triangle is equal!");
        }
        else {
            System.out.println("The triangle is unequal");
        }

    } // end of main
} // end of class
