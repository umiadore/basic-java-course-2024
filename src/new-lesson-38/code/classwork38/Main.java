package classwork38;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        boolean isNotOk = random.nextBoolean();

        if (isNotOk) {
            throw new RuntimeException();
        /*  RuntimeException runtimeException = new RuntimeException();
            throw runtimeException; // new ислючения - это тоже объекты, создаваемые в джаве
          */
        }
    }
}

