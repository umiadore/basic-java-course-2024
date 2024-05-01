package classwork;
/*
Шаг 1. Создайте класс ArrayMethods и реализуйте в нем методы:
- печать массива целых чисел
- печать массива строк
- поиск максимального элемента
- поиск индекса максимального элемента
 */
public class ArrayMethods {
    // fill array with random numbers
    public static void fillArray(int [] arr, int a, int b ) {
        for (int i = 0; i < arr.length; i++) {
            arr [i] =  (int) (Math.random() * (b - a + 1) + a);
        }
    }
     // Binary Search
    // метод будет возвращать индекс найденного элемента или некоторое отрицательное число, если его не нашлось
    // передаем в метод массив и число, метод должен найти индекс числа / ответить на вопрос "есть ли такое число в массиве?"
    public static int binarySearch (int [] arr, int element) {
        int left = 0;
        int right = arr.length -1;

        while (left <= right) { //пока выполняется это условие, мы будем искать середину, сравнивать серелину с элементом и принимать решение о том какую и как из половины нашего массива отбросить
            int middle = (left + right)/2;
            if (arr[middle] == element)  {
                return middle; // здесь мы нашли и вернули индекс элемента
            } else if (element < arr [middle]) {
                right = middle - 1; // отбросили правую половину
            } else  {
                left = middle +1; // отбросили левую половину
            }
        }
        return - left - 1; // в случае отсутсивия, когда элемент не найден
    }




    // bubble sort  (пузырьковая сортировка). как происходит алгоритм этой сортировки?
    // comparing 2 elements of array (массив): array [i] ? array [i +1]( так выглядят два соседних элемента)
    // if left element(array [i]) > right element (array [i +1]), we have to swap them (сортировка идет от меньшего к большему)
    public static int [] bubbleSort(int [] array) {
        for (int i = 0; i < array.length -1; i++) {
            for (int j = 0; j < array.length -1 -i; j++) { // правый конец будет двигаться к началу массива, -i позволит это сделать
                if (array [j] > array [j+1] ) {
                    // lets swap the elements
                    int tmp = array[j]; // tmp - temporary element
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
        return array;
    }


    // print array (массив) int []
    public static void printArray (int [] array ) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array [i] + "|"); // print current element of array (печатаем текущий элемент массива)
        }
        System.out.println(); // это чтобы перейти на след строчку после массива, чтобы не печатать подряд за массивом
    }
    // print array String []
    public static void printArray(String [] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array [i] + "|"); // print current element of array (печатаем текущий элемент массива)
        }
        System.out.println(); // это чтобы перейти на след строчку после массива, чтобы не печатать подряд за массивом
    }
    // max element of int []
    public static int maxOfArray(int [] array) {
    int max = array [0];
        for (int i = 0; i < array.length ; i++) { // бежим по массиву это fori
            if (array [i] > max) {
                max = array [i];
            }
        }
        return max; // метод вернет все то, что мы вычислили
    }

    // index of max element
    public static int indexMaxOfArray (int [] array) {
        int max = array [0];
        int indexOfMax = 0;
        for (int i = 0; i < array.length ; i++) { // бежим по массиву это fori
            if (array [i] > max) {
                max = array [i];
                indexOfMax = i; // cейчас он равен i, то бишь индексу
            }
        }
        return indexOfMax; // метод вернет все то, что мы вычислили
    }

}
