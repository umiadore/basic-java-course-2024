package classwork08;
/*
Возведите 3 в степень 10,
выведите на печать все промежуточные результаты.
 */
public class Power3 {
    public static void main(String[] args) {
        int counter = 1;
        int result = 1; // не ставим 0 потому что у нас будет умножение

        while (counter < 11 ) {
            result = 3 * result;
            System.out.println(result + " 3 raised in a power of " + counter);
            counter++; // это параметр цикла. если мы его не будем изменять, не растет,
            // то мы всегда будем оставаться в этом цикле.
        }

    } // end of main
} // end of class
