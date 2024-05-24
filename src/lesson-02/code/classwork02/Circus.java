package classwork02;

public class Circus {
    public static void main(String[] args) {
        // проверить, можно ли из одного метода вызвать другой, а из того, дальше следующий.
        lightsOn();
        entertainer();
        lightsOff();
    } // end of main
    private static void lightsOff() {
        System.out.println("Lights are OFF!");
    }
    private static void entertainer() {
        jogger();
        clown();
        singer();
    }
    private static void singer() {
        System.out.println("I am singing in the rain...");
    }
    private static void clown() {
        System.out.println("I am a clown, I am joking!");
    }
    private static void jogger() {
        System.out.println("I am jogger, I am jogging!");
    }
    private static void lightsOn() {
        System.out.println("Lights are ON");
    }


} // end of class
