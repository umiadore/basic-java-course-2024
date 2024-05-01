package homework.code;

import homework.code.model.Code;

public class CodeApplication {
    public static void main(String[] args) {
        long codeValue = 12345678;
        Code code = new Code(codeValue);

        System.out.println("Code lenght = " + code.lengthCode());
        System.out.println("Sum of digits = " + code.controlSum());
        System.out.println("Is Valud = " + code.isValid());
    }
}
