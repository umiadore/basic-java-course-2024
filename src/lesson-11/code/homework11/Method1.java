package homework11;
/*
Задайте массив из 10 случайных чисел в интервале от -10 до 10.
Протестируйте работу методов на созданном массиве.
Написать метод, принимающий массив целых чисел,
и возвращающий сумму всех его нечетных элементов.
 */
public class Method1 {
    public static void main(String[] args) {
        int [] randomNumbers ={-10, -7, -5, -4, -1, 2, 4, 5, 9, 10};

        int sumOfOddNumbers = sumOfOddElements(randomNumbers); // Вычисляем сумму нечетных элементов массива
        System.out.println("Sum of odd elements is  " + sumOfOddNumbers);
    }
    public static int sumOfOddElements(int[] array) {
        int sum = 0;
        for (int num : array) {
            if (num % 2 != 0) { // Если число нечетное, добавляем его к сумме
                sum += num;
            }
        }
        return sum;
}
}
