package homework;
/*
Задача 1. Чему равно значение выражения x-- + --x при x = 5?
Проверьте свое предположение с помощью кода.
 */
public class Value {
    public static void main(String[] args) {

        int x = 5;
        int value = 0;

        while(value <=0) {
            value = x-- + --x; // x-- остается как 5.
            // она в программе поменялась, но в результете все равно 5.
            // но --х вычитается как с 4 минус 1, отсюда 3. поэтому ответ 8
            System.out.println("Value is " + value);
        }
    } // end of main
} // end of class
