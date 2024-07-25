package homework39.meeting;

import java.time.LocalDateTime;
import java.util.Objects;

/*
3. Создать класс Meeting (встреча),
3.1 В класс добавьте поля: кто встречается, с кем встречается и дату-время встречи
3.2 Создайте несколько встреч
3.3 Найдите среднее время начала всех встреч
(Например, две встречи - одна встреча начинается 14-00, другая встреча начинается 16-00.
Тогда среднее время начала встречи - 15-00)
 */
public class Meeting {
    private String organizer;
    private String attendee;
    private LocalDateTime localDateTime;


    public Meeting(String organizer, String attendee, LocalDateTime localDateTime) {
        this.organizer = organizer;
        this.attendee = attendee;
        this.localDateTime = localDateTime;
    }

    public String getOrganizer() {
        return organizer;
    }

    public void setOrganizer(String organizer) {
        this.organizer = organizer;
    }

    public String getAttendee() {
        return attendee;
    }

    public void setAttendee(String attendee) {
        this.attendee = attendee;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Meeting meeting)) return false;
        return Objects.equals(organizer, meeting.organizer) && Objects.equals(attendee, meeting.attendee) && Objects.equals(localDateTime, meeting.localDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(organizer, attendee, localDateTime);
    }

    @Override
    public String toString() {
        return "Meeting{" +
                "organizer='" + organizer + '\'' +
                ", attendee='" + attendee + '\'' +
                ", localDateTime=" + localDateTime +
                '}';
    }
}
