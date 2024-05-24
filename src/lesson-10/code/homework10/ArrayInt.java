package homework10;
/*
Задан массив целых чисел: 56, 73, 15, -10, 37, -14, 25, 65, 33, 38.
Найдите максимальный элемент массива и его индекс.
 */
public class ArrayInt {
    public static void main(String[] args) {
        int [] numbers = {56, 73, 15, -10, 37, -14, 25, 65, 33, 38};
        // find the max element and its index
        int max = numbers[0];
        int indexMax = 0;

        for (int i = 0; i < numbers.length; i++) {
            max = numbers[1];
            indexMax = i;

        }
        System.out.println("Max number = " + max);
        System.out.println("Index of Max element: " + indexMax);
    }
}
