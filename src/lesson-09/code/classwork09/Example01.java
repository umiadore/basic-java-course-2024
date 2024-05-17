package classwork09;

public class Example01 {
    public static void main(String[] args) {

    int [] array = new int[10];
        for (int i = 0; i < array.length; i++)  {
            array[i] = (int)Math.pow(2,i); // выводит первые 10 чисел в степенях 2
        }

        for(int i =0; i < array.length; i ++) {
            System.out.println(array[i]);
        }
    }
}
