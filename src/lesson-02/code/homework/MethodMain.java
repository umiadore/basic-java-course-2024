package homework;

public class MethodMain {
    // Метод main вызывает method1. method1 вызывает method2. method2 вызывает method3. В каждом методе должно происходить следующее:
    //Печатает в консоль информацию, что метод такой-то стартовал
    //Вызывает следующий метод
    //Печатает в консоль, что метод такой-то финишировал
    public static void main(String[] args) {
        method1();
    }

    public static void method1() {
        System.out.println("Метод method1 стартовал");
        method2();
        System.out.println("Метод method1 завершился");
    }

    public static void method2() {
        System.out.println("Метод method2 стартовал");
        method3();
        System.out.println("Метод method2 завершился");
    }

    public static void method3() {
        System.out.println("Метод method3 стартовал");
        System.out.println("Метод method3 завершился");
    }
}


