package homework;

import java.util.Scanner;

/*
Задание 3. Напишите программу для машины на светофоре.
Что делать, если горит красный, жёлтый или зелёный свет.
Цвет светофора задается в программе, затем с клавиатуры.
 */
public class TrafficLights {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What Light is on? Enter 'red', 'yellow', or 'green'");
        String lightsOn = scanner.nextLine();

        switch (lightsOn){
            case "red" -> System.out.println("You can drive");
            case "yellow" -> System.out.println("Prepare to stop");
            case "green" -> System.out.println("Wait");

            default -> System.out.println("Wrong Input");

        }
    } //end of main
} // end of class
