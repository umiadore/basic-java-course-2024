package classwork39;

import java.time.*;

public class ZoneMain {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();

        ZonedDateTime zonedDateTime = ZonedDateTime.now(); // выдаст то же самое, только с временной зоной , отличающейся от Гривинча

        System.out.println(localDateTime);
        System.out.println(zonedDateTime);

        //System.out.println(zonedDateTime.plusDays(1));
        //System.out.println(zonedDateTime.withHour(10));


        System.out.println(zonedDateTime.withZoneSameInstant(ZoneId.of("Asia/Karachi")));
        System.out.println(zonedDateTime.withZoneSameLocal(ZoneId.of("Asia/Karachi")));


        Instant instant = Instant.now();
        System.out.println(instant);
    }
    }

