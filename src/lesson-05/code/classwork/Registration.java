package classwork;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        if (age < 13) {
            System.out.println("You are too young. Return later, when you are older than 14.");
        } else  {
            System.out.println("Enter your login");
            String login = scanner.next();
            System.out.println("Create your password");
            String password = scanner.next();

            System.out.println("You are registered!");
            System.out.println("Login: " + login);
            System.out.println("Password: " + "*".repeat(password.length()));
        }
    }
}
