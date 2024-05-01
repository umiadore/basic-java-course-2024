package classwork;
/* Написать методы:
- печатает переданный в метод массив (pring array)
- заполняет переданный в метод массив случайными целыми
числами в интервале от А до В (fill aray)
- меняет указанные по индексам два элемента массива местами (swap elements)
- находит элемент массива по индексу (search in Array by value)
- находит максимальный элемент массива (max element)
 */
public class ArrayAppl {
    public static void main(String[] args) {
        int [] arr = new int[10]; // arr - массив в main и в методе это разные , они имеют разные видимости
        printArray(arr);

        fillArray(arr, 1, 10);
        printArray(arr);
        swapElements(arr, 0,arr.length-1); // индекс последнего и первого
        printArray(arr);

        swapElements(arr, 2, 8);
        printArray(arr);

        int res = searchByValue(arr, 5);
        System.out.println("Index = " + res);

        int index = maxOfArray(arr); // в переменную index вернется индекс
        System.out.println("Index of max element is " + index);

    } // end of main

    // max element
    public static int maxOfArray (int[] arr){
        int max = arr [0];
        int indexMax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr [i] > max) {
                max = arr[i];
                indexMax = i;
            }
        }
        return indexMax;
    }

    //search in Array by value
    public static int searchByValue(int [] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (value == arr[i]) { // the same as: if (arr[i] == value)
                return i;
            }
        }
        return -1; // так как ни разу равного не вышло, в таком случае выдает -1
    }

    //swap elements
    public static void  swapElements (int [] arr, int m, int n){
        int tmp = arr [m];
        arr [m] = arr [n];
        arr [n] = tmp;
    }

    // fill array with the random numbers
    public static void fillArray(int [] arr, int a, int b ) {
        for (int i = 0; i < arr.length; i++) {
            arr [i] =  (int) (Math.random() * (b - a + 1) + a);
        }
    }
    // print array

    public static void printArray (int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr [i] + "\t"); // текущий элемент массива выглядит так: arr [i], t - табуляция
        }
        System.out.println();

    }

} // end of class
