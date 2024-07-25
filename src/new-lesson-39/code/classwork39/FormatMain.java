package classwork39;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatMain {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();

        LocalDateTime localDateTime = LocalDateTime.now();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd MMMM yyyy HH:mm:ss.SSS");
        String string = localDateTime.format(dateTimeFormatter); // dateTimeFormater is string
        System.out.println(string);
    }
}
