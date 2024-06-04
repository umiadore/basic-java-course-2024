package classwork25.binary_search;

public class Main {
    public static void main(String[] args) {
        int [] array = {4,5,10,};
        int result = binarySearch(array, 6, 0, array.length-1);
        System.out.println(result);
    }

 /* Binary Search
 нужен алгоритм, который постоянно выбирает центральный элемент массива,
 и в завимисимости от результата конкретной ячейки: убирает из поиска половина заданного массива
*/
    public static int binarySearch (int [] array, int number, int start, int finish) {
        int index = -1;

       //  while (start <= finish) {
            int median = (start + finish)/2; // таким образом мы сможем найти среднее значение

        if (array[median] == number)  {
            index = median;
        }

        if (start == finish && array [median] != number){
            return  -1;
        }
//binary search written in Recursion
        if (array[median] >number) {
            index = binarySearch(array, number, start,median-1);
        }
//binary search written in Recursion
         if (array[median] < number) {
            index = binarySearch(array,number, median +1, finish);
         }
         return  index;
    }
}


