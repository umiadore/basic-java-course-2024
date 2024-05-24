package homework05;
/*

    Разработайте систему тестирования, которая задаст пять вопросов по теме "Примитивные типы данных и переменные"
    На каждый тестовый вопрос должна быть возможность выбрать один из трех вариантов ответа (через сканнер).
    Если выбран правильный вариант, следует увеличить количество баллов на 1.
    В конце теста нужно вывести оценку. Если оценка 3 или выше написать "Вы справились с тестом", а если ниже - "Вы провалились"

 */
import java.util.Scanner;

public class Exam_example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer;
        int score =0;

        System.out.println("1. \na\nb\nc");
        answer = scanner.next().substring(0,1);
        if (answer.equals("a"))  {
            score ++;
        }
        System.out.println("2. \na\nb\nc");
        answer = scanner.next().substring(0,1);
        if (answer.equals("c"))  {
            score ++;
        }
        System.out.println("3. \na\nb\nc");
        answer = scanner.next().substring(0,1);
        if (answer.equals("b"))  {
            score ++;
        }
        System.out.println("4. \na\nb\nc");
        answer = scanner.next().substring(0,1);
        if (answer.equals("d"))  {
            score ++;
        }
        System.out.println("5. \na\nb\nc");
        answer = scanner.next().substring(0,1);
        if (answer.equals("e"))  {
            score ++;
        }
        // accba

        System.out.println("Your Score" + score + "/5");
        if (score <3){
            System.out.println("You failed");
        } else {
            System.out.println("You passed!");
        }
    }
}
