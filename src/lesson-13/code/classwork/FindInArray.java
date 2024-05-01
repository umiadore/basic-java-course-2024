package classwork;
/*
Создать массив из 20 случайных целых чисел в интервале от -100 до 100.
Сколько в нем получилось отрицательных чисел?
Сформируйте из них новый массив.
 */
public class FindInArray {
    public static void main(String[] args) {
        int [] array = new int[20];
        int a  = -100;
        int b = 100;

        ArrayMethods.fillArray(array, a, b);
        ArrayMethods.printArray(array);

        // step 1. count the result itself (the quantity of the negative elements)
        int count = countNegativeElementsInArray(array); // посчитали количество нег элементов в коде между end of main & end of class
        // step 2. create a new array (массив)and move all the negative numbers there

        int [] newArray = new int [count];
        fillNewArray (array, newArray);
        ArrayMethods.printArray(newArray);


    } // end of main

    // написан вторым
    private static void fillNewArray(int[] array, int[] newArray) {
        for (int i = 0, j = 0;  j < newArray.length; i++) { // цикл в цикле
            if (array [i] <0) {
                newArray [j++] = array [i];
                // j++; ровно и равно то же самое, что и newArray [j++]
            }
        }
    }

    // этот метод был написан для каунтнегатив - написан первым
    private static int countNegativeElementsInArray(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if ( array [i] <0) {
                count++; // count выше и этот это разные и видимости их не пересекаются, можно назвать и по-другому
            }
        }
        return count;
    }
} // end of class

