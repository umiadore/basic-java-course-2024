package homework;
/*
 Print out all natural numbers less than 200 and multiples of 13.
 Распечатайте все натуральные числа меньшие 200 и кратные 13.
 */
public class Numbers {
    public static void main(String[] args) {
        int number = 1;
        while (number < 200) {
            // Проверяем, кратно ли число 13
            if (number % 13 == 0) {
                System.out.println(number); // Выводим число, если оно кратно 13
            }
            number++;
        }
    } // end of class
} // end of main