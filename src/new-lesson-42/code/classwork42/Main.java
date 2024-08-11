package classwork42;

import classwork42.calculator.MathCalculator;
import classwork42.parser.StringParser;
import classwork42.printer.ConsolePrinter;
import classwork42.printer.FilePrinter;
import classwork42.printer.Printer;

import java.util.Scanner;

/*
Пользователь вводит два числа и название операции
Программа выводит на экран ответ должна быть история операций
 */
public class Main { // main ассоциативно связан с парсером
    public static void main(String[] args) {
        FilePrinter filePrinter = new FilePrinter();
        MathCalculator mathCalculator = new MathCalculator(filePrinter); // калькулятор связан с принтером, поэтому мы не можем создать новый калькулятор без принтера

        Scanner scanner = new Scanner(System.in);
        StringParser stringParser = new StringParser(mathCalculator,scanner);

        stringParser.parse();
        scanner.close();
    }
}
