package classwork08;
/*
Запустить обратный отсчет старта ракеты от 10 до 0.
Последнее сообщение: "Поехали!...".
 */
public class SpaceXCountdown {
    public static void main(String[] args) {
        int countdown = 10;
        System.out.println("There are " + countdown + " till the start!");

        while (countdown > 0) {
            countdown--; // it is the same as countdown = countdown - 1;
            System.out.println("There are " + countdown + " till the start!");
        }
        System.out.println("Let´s go!...");
    } // end of main
} // end of class

