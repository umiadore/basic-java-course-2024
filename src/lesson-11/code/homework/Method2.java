package homework;
/*
Задайте массив из 10 случайных чисел в интервале от -10 до 10.
Протестируйте работу методов на созданном массиве.
Написать метод, принимающий массив целых чисел,
и возвращающий произведение всех его элементов с четными индексами.
 */
public class Method2 {
    public static void main(String[] args) {
        int [] randomNumbers ={-10, -7, -5, -4, -1, 2, 4, 5, 9, 10};

        int sumOfEvenElements = sumOfEvenElements(randomNumbers); // Вычисляем произведение элементов с четными индексами
        System.out.println("Произведение элементов с четными индексами: " + sumOfEvenElements);
    }

    // Метод для вычисления произведения элементов массива с четными индексами
    public static int sumOfEvenElements(int[] array) {
        int product = 1;
        for (int i = 0; i < array.length; i += 2) { // Начинаем с нулевого индекса и шагаем через один (четные индексы)
            product *= array[i];
        }
        return product;
    }
}
