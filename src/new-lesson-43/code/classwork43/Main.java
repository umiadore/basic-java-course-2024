package classwork43;

import classwork43.controller.TrainController;
import classwork43.service.TrainService;
import classwork43.service.TrainServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите ");

        TrainService trainService = new TrainServiceImpl(); // можно вместо Trainservice добавить TrainserviceImpl, потому что первое - это интерфейс, а второе это его реализация
        TrainController trainController = new TrainController(scanner, trainService);

        trainController.startProgram();
    }
}
