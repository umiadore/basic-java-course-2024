package classwork39;

import java.util.Date;

public class DateMain {
    public static void main(String[] args) {
        Date date = new Date(); // Date java util - will give you the current time
        System.out.println(date);

        Date date1 = new Date(0); // можно передать лонг значение и получить 1 января 1970 года, если написать 1000 например, то 1000 будет считаться за одну миллисекунду
        System.out.println(date1);
    }
}
