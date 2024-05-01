package classwork;
/*
Написать метод, принимающий массив целых чисел,
и печатающий его в обратном порядке.
Сначала последний элемент, потом предпоследний, и т. д.
 */
public class ReverseLoop {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        printReverseArray(arr);


    } // end of main
public static void printReverseArray (int [] arr) {
    for (int i = arr.length -1; i >= 0 ; i--) {
        System.out.print(arr [i] + "\t" );
    }
        System.out.println();
    }
} // end of class
