package classwork10;

import java.util.Random;
import java.util.Scanner;

/*пользователь вводит нижнюю и верхнюю границу, а программа дает случайное число в этой границе
 */
public class Main02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter min and max numbers");
        int min = scanner.nextInt();
        int max = scanner.nextInt();

        Random random = new Random();
        // off - by - one error - это если бы мы на единичку не дописали
        int number = min + random.nextInt(max - min +1);
        System.out.println(number);
    }
}
