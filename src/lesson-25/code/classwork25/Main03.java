package classwork25;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Locale;

public class Main03 {
    public static void main(String[] args) {
        String text = "Hello World";
        System.out.println(text);

        text = text.toUpperCase(); // если не написать text=  вначале, то ничего не поменяктся, так как String иммутабелен
        System.out.println(text);

        System.out.println("*".repeat(text.length()));

        System.out.println(text.endsWith("!"));

        text = text.indent(4); // добавляет пробелы
        System.out.println(text);

        text = text.trim(); // убирает все пробелы
        System.out.println(text);

        System.out.println(Arrays.toString(text.split(" "))); // split разделяет массив
    }
}

class Main05 {
    public static void main(String[] args) {
        String res = "";
        long start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            res +="!";
        }
        long end = System.nanoTime();
        double time = (end - start) / 1000000.0;
        System.out.println(time);

        StringBuilder sb = new StringBuilder();
        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            sb.append("!");
        }
        end = System.nanoTime();
        time = (end - start) / 1000000.0;
        System.out.println(time);
    }
}
