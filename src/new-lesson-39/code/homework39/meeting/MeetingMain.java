package homework39.meeting;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/*
3.2 Создайте несколько встреч
3.3 Найдите среднее время начала всех встреч
(Например, две встречи - одна встреча начинается 14-00, другая встреча начинается 16-00.
Тогда среднее время начала встречи - 15-00)
 */
public class MeetingMain {
    public static void main(String[] args) {

        Meeting meeting1 = new Meeting("Kira", "Kirill", LocalDateTime.of(2024, 7, 22, 14, 0));
        Meeting meeting2 = new Meeting("Kira", "Kirill", LocalDateTime.of(2024, 7, 22, 12, 0));
        Meeting meeting3 = new Meeting("Kira", "Kirill", LocalDateTime.of(2024, 7, 22, 17, 0));


        List <Meeting> meetingList = new ArrayList<>();
        meetingList.add(meeting1);
        meetingList.add(meeting2);
        meetingList.add(meeting3);

        Meeting aveTime = meetingList.stream()

    }
}
