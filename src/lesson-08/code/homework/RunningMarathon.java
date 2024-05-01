package homework;

import java.util.Scanner;

/*
В первый день спортсмен пробежал s километров,
а затем он каждый день увеличивал пробег
на 10 % от предыдущего значения.
Определите номер того дня, на который пробег спортсмена
составит не менее target километров.
Программа получает на вход действительные
числа s и target и должна вывести одно натуральное число.
 */
public class RunningMarathon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input distance");
        double s = scanner.nextDouble();
        System.out.println("Input your goal /target!");
        double target = scanner.nextDouble();

        int days = 0;

        while (s < target) {
            s+= s*0.1; // 0.1 because its 10%
            days++;
        }
        System.out.println("After "+ days + " days the distance will be "+ s);
        
    } // end of main
} //end of class
