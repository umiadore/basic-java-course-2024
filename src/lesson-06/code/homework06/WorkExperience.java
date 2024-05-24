package homework06;

import java.util.Scanner;

/*
Задача 1. Напишите программу расчета выдачи денег работнику с учётом надбавки за стаж,
если базовая зарплата 500$. За 3 года работы надбавка 10%, за 5 лет работы надбавка 50%,
за 10 лет работы надбавка 100%, за 15 лет работы надбавка 150%.
Сколько лет проработал работник вводится с клавиатуры.
 */
public class WorkExperience {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Since when are you working here?");
        int experience = scanner.nextInt(); // получаем ответ с клавиатуры

        int BasicSalary = 500;

        switch (experience){
            case 3 -> {System.out.println("You will get 10% on top of your basic salary:");
                System.out.println(BasicSalary + (BasicSalary*0.1)+ " euro");
            }
            case 5 -> {System.out.println("You will get 50% on top of your basic salary:");
                System.out.println(BasicSalary + (BasicSalary*0.5) + " euro");
            }
            case 10 -> {System.out.println("You will get a double salary:");
                System.out.println(BasicSalary + (BasicSalary) + " euro");
            }
            case 15 -> {System.out.println("You will 150% on top of your basic salary:");
                System.out.println(BasicSalary + (BasicSalary*1.5) + " euro");
            }
            default -> System.out.println("Wrong input!");
        } // end of switch

    } // end of main
    } // end of class

