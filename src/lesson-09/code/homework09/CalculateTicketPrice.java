package homework09;

import java.net.SocketTimeoutException;
import java.util.Scanner;

/*
Задача 4. В кинотеатре есть разные типы билетов: стандартный, студенческий (-10%)
и для пенсионеров(-25%). Каждый тип билета имеет свою стоимость.
Клиент может также выбрать место в VIP-зоне, что увеличит стоимость билета на 25%.
Создайте метод calculateTicketPrice, который принимает возраст клиента,
статус студента и флаг VIP-места, а возвращает итоговую стоимость билета.
Реализуйте приложение-бот, которое задает необходимые вопросы и объявляет стоимость билета.
 */
public class CalculateTicketPrice {
    public static void main(String[] args) {
        int standardTicket = 12; // in euros
        double discount = 0;
        double VIPincrease = 0;
        int numberOfTickets = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        System.out.println("Are you a student? (true/false):");
        boolean isStudent = scanner.nextBoolean();
        System.out.println("Are you a retiree? (true/false):");
        boolean isRetiree = scanner.nextBoolean();
        System.out.println("Do you want a VIP seat? (true/false):");
        boolean isVIP = scanner.nextBoolean();
        System.out.println("Enter the number of tickets:");
        numberOfTickets = scanner.nextInt();

        scanner.close();

        // Apply discounts based on age and student status
        if (age >= 18 || age <= 22) {
            discount = 0.10; // 10% discount for children 18 - 22
        } else if (age >= 60 || isRetiree) {
            discount = 0.25; // 25% discount for retirees or those aged 60 and above
        }

        // Apply VIP seat increase
        if (isVIP) {
            VIPincrease = 0.25; // 25% increase for VIP seats
        }

        // Calculate final ticket price per ticket
        double finalPricePerTicket = standardTicket * (1 - discount) * (1 + VIPincrease);

        // Calculate total cost
        double totalCost = finalPricePerTicket * numberOfTickets;

        System.out.println("Your final price for " + numberOfTickets + " tickets is: " + totalCost + " euros.");
    }
}