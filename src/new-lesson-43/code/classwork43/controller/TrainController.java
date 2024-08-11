package classwork43.controller;

import classwork43.entity.Schedule;
import classwork43.service.TrainService;

import java.util.List;
import java.util.Scanner;

public class TrainController {
    // Here is scanner, bc it is the only way (for now) to interact with ENUM
    private Scanner scanner;
    private TrainService trainService; // ассоциация, мы дали ссылку контроллеру на сервис

    public TrainController(Scanner scanner, TrainService trainService) {
        this.scanner = scanner;
        this.trainService = trainService;
    }

    public void startProgram () {
        String commandLine = scanner.nextLine();
        // в зависимости от того, какая команда будет выбрана:
        Command command = Command.valueOf(commandLine); // valueof по строке отдает один из вариантов

        switch (command) {
            case GET_SCHEDULE ->getSchedule();
            case DELETE_FROM_SCHEDULE ->deleteFromSchedule();
            case ADD_TO_SCHEDULE -> addToSchedule();
        }
    }

    private void getSchedule () {
        List<Schedule> list = trainService.getSchedule();

        for (Schedule schedule : list) {
            System.out.println(schedule);
        }
        // тут ничего нового мы читать не будем
    }
    private void deleteFromSchedule () {
        System.out.println("Введите номер поезда: ");
        String trainNumber = scanner.nextLine();
       boolean isCompleted=  trainService.deleteFromSchedule(trainNumber);
        if (isCompleted){
            System.out.println("Успешно удалено");
    }
        else {
            System.out.println("Удалить не вышло!");
        }
    }
    private void addToSchedule () {
        System.out.println("В одной строке введите через пробел номер поезда, дату его выезда и приезда");
        String data = scanner.nextLine();
        boolean isCompleted = trainService.addToSchedule(data);
        if (isCompleted){
            System.out.println("Успешно добавлено");
        }
        else {
            System.out.println("Добавить не вышло!");
        }

    }
}
