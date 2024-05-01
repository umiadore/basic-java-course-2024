package classwork;
/*
Шаг 2. Создайте класс ArrayAppl, создайте в нем метод main,
создайте тестовые массивы и вызовите методы
из класса ArrayMethods для проверки их работоспособности.
 */
public class ArrayApplication {
    public static void main(String[] args) {
        int [] numbers =  {-238, -96, 5, 57, -34, 77, -76, 33, -142, -200};
        ArrayMethods.printArray(numbers);
        int max = ArrayMethods.maxOfArray(numbers);
        System.out.println("Max of Array is " + max);
        int maxIndex = ArrayMethods.indexMaxOfArray(numbers);
        System.out.println("Max index of Array is " + maxIndex);

        String [] weekday = {"Mo, Tue, Wed, Th, Fr, Sat, Sun"}; // каждая из строковых данных берется в кавычки
        ArrayMethods.printArray(weekday);

        ArrayMethods.bubbleSort(numbers);
        ArrayMethods.printArray(numbers);

    }
}
