package classwork;

import com.sun.security.jgss.GSSUtil;
import java.util.Scanner;

/*
Задание 2. Родители позволяют ребенку играть на компьютере 1 час.
Напишите программу, которая будет реагировать на полученную в школе оценку:
1. "Молодец!", время для игр на компьютере увеличивается на 30 мин.
2. "Хорошо", ты можешь играть на компьютере обычные 60 минут.
3. "Посредственно.", время для игр уменьшается на 30 мин.
4. "Плохо!", сегодня никаких игр на компьютере.
5. "Позор семьи!", никаких игр на компьютере 2 дня.
 */
public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What grade did you get today?");
        int grade = scanner.nextInt(); // получаем ответ с клавиатуры

        int timeForGaming = 60;

        switch (grade) {
            case 1:{
                System.out.println("Good job!");
                timeForGaming = timeForGaming + 30;
                System.out.println("You are allowed to play one hour plus " + timeForGaming);
                break; // пишется когда заканчивается кейс
            }
            case 2: {
                System.out.println("Good!");
                System.out.println("Time for game: " + timeForGaming);
                break; // пишется когда заканчивается кейс
            }
            case 3: {
                timeForGaming = timeForGaming - 30;
                System.out.println("Not so good... "+ "You can play " + timeForGaming);
                break;
            }
            case 4: {
                System.out.println("Too bad...");
                timeForGaming = 0;
                System.out.println("You can not play any games today!");
                break;
            }
            default: { // по умолчанию
                System.out.println("Wrong Input!");
            }
            }
        }

    }
