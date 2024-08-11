package classwork43.repository;

import classwork43.entity.Schedule;

import java.util.List;

//Здесь будут методы, которые отвечают за хранение данных
public interface TrainRepository {
    List<Schedule> getSchedule ();
    boolean deleteFromSchedule (String trainName);
    boolean addToSchedule (Schedule schedule);


}
