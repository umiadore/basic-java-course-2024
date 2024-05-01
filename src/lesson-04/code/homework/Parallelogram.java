package homework;
/* Задача 2. Написать приложение, которое вычисляет площадь
параллелограмма по его основанию и высоте с помощью метода.
 */
public class Parallelogram {
    public static void main(String[] args) {
        double d1 = 12; //основание
        double d2 = 10; // высота

        double area = areaofPal(d1, d2);
        System.out.println("S = " + area);

    } //end of main
    public static double areaofPal (double d1, double d2) {
        return d1 * d2;
    }


} // end of class
