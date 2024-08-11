package classwork43.entity;

import java.time.LocalDate;
import java.util.Objects;

public class Schedule {
    private String trainName;

    private LocalDate startDate;

    private LocalDate finishDate;

    public Schedule(String trainName, LocalDate startDate, LocalDate finishDate) {
        this.trainName = trainName;
        this.startDate = startDate;
        this.finishDate = finishDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Schedule schedule)) return false;
        return Objects.equals(trainName, schedule.trainName) && Objects.equals(startDate, schedule.startDate) && Objects.equals(finishDate, schedule.finishDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trainName, startDate, finishDate);
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(LocalDate finishDate) {
        this.finishDate = finishDate;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "trainName='" + trainName + '\'' +
                ", startDate=" + startDate +
                ", finishDate=" + finishDate +
                '}';
    }

}
