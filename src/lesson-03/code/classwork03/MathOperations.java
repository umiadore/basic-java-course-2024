package classwork03;

//Задать целочисленные переменные x и y, выполнить c ними известные вам математические действия,
// напечатать результаты вместе с текстовыми пояснениями:
//- какие переменные участвовали;
//- какие действия с ними выполнялись;
//- что получилось в результате.

public class MathOperations {
    public static void main(String[] args) {
        int x = 12;
        int y = 30;

        int rez = x + y;

        System.out.println("x = " + x + " sum y = " + y + " gives " + rez);
        rez = x - y;
        System.out.println("x = " + x + " deduct y = " + y + " gives " + rez);
        rez = x * y;
        System.out.println("x = " + x + " multiply y = " + y + " gives " + rez);
        rez = y / x;
        System.out.println("x = " + x + " divide y = " + y + " gives " + rez);
        rez = y % x;
        System.out.println("x = " + x + " persentage of y = " + y + " gives " + rez + " (rest)");
    }
}
