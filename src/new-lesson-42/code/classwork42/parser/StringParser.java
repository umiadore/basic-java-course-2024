package classwork42.parser;

import classwork42.calculator.Calculator;
import classwork42.operator.Operator;
import classwork42.calculator.MathCalculator;

import java.util.Scanner;

public class StringParser implements Parser { // parser ассоциативно связан с калькулятор и сканнером

    private final Calculator calculator;
    private final Scanner scanner;

    public StringParser(Calculator calculator, Scanner scanner) {
        this.calculator = calculator;
        this.scanner = scanner;
    }

    public void parse () {
        String stringToCalculate = scanner.nextLine();
        String [] operands = stringToCalculate.split(" ");

        String firstOperand = operands[0]; // здесь лежит первое чисто
        String secondOperand = operands[2]; // здесь лежит второе чисто
        String operatorString = operands[1]; // здесь лежит знак

        Operator operator = Operator.findByString(operatorString);
        Double first = Double.parseDouble(firstOperand);
        Double second= Double.parseDouble(secondOperand);

        calculator.calculate(first,second,operator);
    }
}
