package classwork;
/*
Распечатать в консоли все числа от 1 до 100,
которые делятся на 5 без остатка.
 */
public class NumbersBy5 {
    public static void main(String[] args) {

        int count = 1;

        System.out.print(" | "); //это сделано для красоты, смысловой нагрузки 0
        while (count <= 100){
            if (count %5 == 0) { //если count разделился на 5, без остатка, то есть остаток равен нулю,
                System.out.print(count + " | "); //ln - это переход на новую строку (println)
            }
            count++;
        }
    } // end of main
} // end of class
