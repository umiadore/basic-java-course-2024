package classwork43.service;

import classwork43.entity.Schedule;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class TrainServiceImpl implements TrainService{
    @Override
    public List<Schedule> getSchedule() {
        return new ArrayList<>();
    }

    @Override
    public boolean deleteFromSchedule(String trainName) {
        return false;
    }

    @Override
    public boolean addToSchedule(String data) {
        if (data == null) {
            return false;
        }
        String [] stringArray = data.split(" ");
        if (stringArray.length !=3){
            return false;
        }
        String trainName = stringArray[0];
        LocalDate start;
        LocalDate finish;
        try {
           start = LocalDate.parse(stringArray[1]);
           finish = LocalDate.parse(stringArray[2]);
        }
        catch (DateTimeParseException e){
            return false;
        }

        Schedule schedule = new Schedule(trainName, start, finish);

        return true;
    }
}
