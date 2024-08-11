package classwork43.service;

import classwork43.entity.Schedule;

import java.util.List;

public interface TrainService {

    // для того чтобы получить расписание, создаем список
    List<Schedule> getSchedule ();

    // метод для удаления расписания
    boolean deleteFromSchedule (String trainName);

    // метод для добавления
    boolean addToSchedule (String data);
}
