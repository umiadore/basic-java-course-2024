package homework25.task;
public class BinarySearch {
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
