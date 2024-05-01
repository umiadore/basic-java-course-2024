package homework.equation;

import homework.equation.model.Equation;

import java.util.Scanner;

public class EquationApplication {
    public static void main(String[] args) {
        Equation a1 = new Equation(12,34, 45);
        Equation b1 = new Equation(13,23,-3);
        Equation c1 = new Equation(-3,45,19);

        System.out.println("Equation a:");
        a1.display();
        System.out.println("Delta:" + a1.delta());
        System.out.println("Number of roots " + a1.quantityRoots());

        System.out.println("Equation b:");
        b1.display();
        System.out.println("Delta:" + b1.delta());
        System.out.println("Number of roots " + b1.quantityRoots());

        System.out.println("Equation c:");
        c1.display();
        System.out.println("Delta:" + c1.delta());
        System.out.println("Number of roots " + c1.quantityRoots());

    }
}
