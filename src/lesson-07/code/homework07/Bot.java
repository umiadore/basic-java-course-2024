package homework07;

import java.sql.SQLOutput;
import java.util.Scanner;

/*
Задача 1. Написать бот, который задает не менее 3-х вопросов
(последовательно), принимает ответы от пользователя
 и реагирует на эти ответы по-разному,
 в зависимости от полученного ответа.

Пример: Как вас зовут? Очень приятно, меня зовут Бот1.
Какой у вас вес? 106 кг. А какой рост? 187
А какой возраст? 60
Для вашего возраста и роста такой вес избыточен,
я вам рекомендую похудеть на 5-10 кг.
 */
public class Bot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("Nice to meet you, i am Bot!");

        System.out.println("What is your weight?");
        int weight = scanner.nextInt();

        if(weight <= 65) {
            System.out.println("You look great!");
        } else {
            System.out.println("Amazing! Let´s do sport together!");
        }

        System.out.println("How tall are you?");
        int height = scanner.nextInt();
        if (height >= 160) {
            System.out.println("That is an average height for all asians!");
        } else {
        System.out.println("Wow you are really tall!");
    }
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        if(age <= 50) {
            System.out.println("You are so young!");
        } else {
            System.out.println("You must be so wise!");
        }
    }

}
