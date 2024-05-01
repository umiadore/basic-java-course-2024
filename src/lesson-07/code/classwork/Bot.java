package classwork;

import java.util.Scanner;

/*Задание 2. Запрограммировать бот,
который помогает выбрасывать мусор в баки разных цветов:
- упаковки в желтый бак
- пищевые отходы в коричневый бак
- бумага в зеленый бак
- прочие отходы в черный бак
 */
public class Bot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a type of garbage:  ");
        String garbage = scanner.nextLine();

        switch (garbage) {
            case "paper" -> System.out.println("Put it in a green bin. ");
            case "plastic" -> System.out.println("Put it in a yellow bin.");
            case "bio", "food" -> System.out.println("Put it in a brown bin");
            case "rest", "other", "metal" -> System.out.println("Put it in a black bin");

            default -> System.out.println("Please use paper, plastic, bio, food, metal, other or rest. Save the planet!");
        }



    } // end of main
} // end of class
