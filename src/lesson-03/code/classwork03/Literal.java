package classwork03;

import org.w3c.dom.ls.LSOutput;

public class Literal {
    public static void main(String[] args) {

    int number1 = 10;
    double number2 = 5.25;
    char letter = 'a';
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(letter);
}
}

class Main02 {
    public static void main(String[] args) {
        // происходит потеря данных при явном сужающем преобразовании, поэтому выводит 45
    byte number = (byte)45.1;
        System.out.println(number);
}
}
class Main03 {
    public static void main(String[] args) {
        int number = 'a'; // неявное преобразование
        System.out.println(number);
    }
}
class Main04 {
    public static void main(String[] args) {
        short sNumber = (short)0b1110_1000_1100_1101; //-5939 ;
        // lossy conversion
        // number будет показывать только 11001101
        byte number = (byte)sNumber;

        System.out.println(sNumber);
        System.out.println(number);
    }
}

class Main05 {
    public static void main(String[] args) {
        boolean flag1 = false;
        boolean flag2 =true;

        boolean flag3 = 4 >5;
        System.out.println(flag3);
    }
}