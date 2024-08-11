package homework39.meeting;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import static java.time.temporal.ChronoField.SECOND_OF_DAY;

/*
3.2 Создайте несколько встреч
3.3 Найдите среднее время начала всех встреч
(Например, две встречи - одна встреча начинается 14-00, другая встреча начинается 16-00.
Тогда среднее время начала встречи - 15-00)
 */
public class MeetingMain {
    public static void main(String[] args) {

        Meeting meeting1 = new Meeting("Kira", "Kirill", LocalDateTime.of(LocalDate.now(), LocalTime.of(23, 45)));
        Meeting meeting2 = new Meeting("Kira", "Kirill", LocalDateTime.of(LocalDate.now(), LocalTime.of(21, 15)));
        Meeting meeting3 = new Meeting("Kira", "Kirill", LocalDateTime.of(LocalDate.now(), LocalTime.of(22, 10)));


        List <Meeting> meetingList = new ArrayList<>();
        meetingList.add(meeting1);
        meetingList.add(meeting2);
        meetingList.add(meeting3);

        int sum = meetingList.stream()
                .map(meeting -> meeting.getTime().toLocalTime())
                .map(localTime -> localTime.get(SECOND_OF_DAY))
                .reduce((first, second)-> first + second)
                .orElse(0);

        int ave = sum /meetingList.size();

        LocalTime localTime = LocalTime.ofSecondOfDay(ave);
        System.out.println(localTime);

    }
}
