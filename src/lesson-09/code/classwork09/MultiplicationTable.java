package classwork09;
/*
Распечатать в консоли таблицу умножения от 1 до 10.
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        int n = 1; //первое число , с чего начинается таблица умножения (multiplier)
        int m = 1; //  2nd multiplier

        while (n < 10) { //меньше или равно десяти
            while (m <= 10) {
                System.out.print( n + " * " + m + " = " + n*m + " | ");
                m++;
            }
            System.out.println(); //next line переход на следующую строку
            m = 1;
            n++;
        }
    } // end of main
} // end of class
