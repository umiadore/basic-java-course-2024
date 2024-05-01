package classwork;
/*
Возведите число в квадрат с помощью метода, получающего число в качестве аргумента.
Возведите элемент массива в квадрат с помощью метода,
получающего массив в качестве аргумента.
Сравните первоначальные значения и полученные результаты.
 */
public class ArrayRefer {
    public static void main(String[] args) {
        //work with primitives
        int x = 10;
        System.out.println("x before x^2= " + x );

        pow2Var (x);
        System.out.println("x after the method pow2Var = "+ x);

        // work with arrays (массивы)
        int [] arr = {1, 10, 3};
        System.out.println("arr [1] before ^2" + arr[1]); // ^2 - это возведение в квадрат
        pow2Arr (arr);
        System.out.println("arr[1] after the methow pow2Arr (int []arr) " + arr [1]);

        System.out.println(arr);
    } // end of main

        private static void pow2Arr (int []arr) {
            arr [1] = arr [1] * arr[1];
            System.out.println("arr [1] in^2 = " + arr[1]);
        }

    public static void pow2Var(int x){
        x = x * x;
        System.out.println("x^2 = " + x);
    }

}
