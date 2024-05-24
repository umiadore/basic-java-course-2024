package homework05;
/*
Задание 5(*): Разработать аппликацию для решения квадратного уравнения
по коэффициентам квадратного трехчлена а, b и с.
Дискриминант вычислить по формуле:
d = bb - 4ac Если d > 0 , то x1 = (-b + Math.sqrt(d))/(2a),
x2 = (-b - Math.sqrt(d))/(2a).
Если d = 0, то x = -b / (2a). Если d < 0, то сообщить, что корней нет.
 */
public class App {
    public static void main(String[] args) {
        int a = 18;
        int b = 8;
        int c = 11;
        double x;
        double x1;
        double x2;

        double d = b*b - 4*a*c;
        if (d > 0){
            x1 = (-b + Math.sqrt(d))/(2*a);
            x2 = (-b - Math.sqrt(d))/(2*a);
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
            } else  if (d == 0) {
                x = -b / (2.0 * a);
            System.out.println("x = " + x);
            } else {
            System.out.println("No real roots");
        }
    }
}
