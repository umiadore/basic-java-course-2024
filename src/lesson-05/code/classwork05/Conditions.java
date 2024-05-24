package classwork05;
/*
**Задание 1:**
  Проверка положительное или отрицательное число.
  Проверка четное или нечетное целое число.
  Проверка возраста. Если пользователю 18 лет и менее,
  то сообщить "Вам надо прийти вместе с вашим опекуном",
  иначе сообщить "Вам разрешено действовать самостоятельно.
 */
public class Conditions {
    public static void main(String[] args) {

        int n = 0;

        if (n  >  0) {
            System.out.println( n + " is a Positive number");
        } else {
            System.out.println(n + " is a Negative number");
        }

        int chislo =-123;

        if ((chislo %2) == 1 | (chislo %2) == -1) {
            System.out.println(chislo + " is odd number.");
        } else {
            System.out.println(chislo + " is even number.");
        }

        int age = 16;

        if (age >= 18) {
            System.out.println("You are allowed to do everything yourself");
        } else {
            System.out.println("You have to come with Parent");

        }

    } //end of main
} // end of class
