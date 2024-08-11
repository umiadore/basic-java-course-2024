package classwork42.calculator;

import classwork42.printer.ConsolePrinter;
import classwork42.operator.Operator;
import classwork42.printer.Printer;

public class MathCalculator implements Calculator {// калькулятор ассоциативно связан с принтером
    private final Printer printer;

    // связь калькулятора и принтера - это ассоциация
    public MathCalculator(Printer printer) {
        this.printer = printer;
    }

    public void calculate (double first, double second, Operator operator) {
        double result = 0.0;
        switch (operator) {
            case SUM -> result = first + second;
            case SUBTRACTION -> result = first - second;
            case DIVIDE -> result = first / second;
            case MULTIPLY -> result = first * second;
        }
        printer.print(result);

    }
}
