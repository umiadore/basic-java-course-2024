package homework;

import java.util.Scanner;

/*
• Разработайте программу расчёта индекса массы тела (ИМТ).
• Подробнее по теме можно прочитать здесь https:/Lgenesis-clinic.com.ua/ru/indeks-masy-tila
• Формула ИМТ рассчитывается так: нужно взять вес в килограммах, и разделить на квадрат роста в метрах
Обратите внимание, что оператор ^ не является оператором степени. Чтобы сделать степень в джаве, вам прийдется либо проявить креативность, либо найти в интернете как это делается.
• Протестируйте свою программу и сравните результаты с калькулятором в выше приведенном сайте
 */
public class BodyMass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your weight in kg");
        float weight = scanner.nextFloat();
        System.out.println("Enter your height in cm");
        float height = scanner.nextInt() / 100f; // сантиметры делим на 100f, чтобы получить метры

        // body mass index.имт = вес / (рост)
        float bodyIndex = weight / (height * height); // BMI
        System.out.println("Your body mass index is " + bodyIndex);

        if (bodyIndex <=15) {
            System.out.println("Anorexia");
        } else if (bodyIndex <=20){
            System.out.println("Underweight");
        }else if (bodyIndex <=25) {
            System.out.println("Normal weight");
        } else if (bodyIndex <=30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obesity");
        }
    }

}
