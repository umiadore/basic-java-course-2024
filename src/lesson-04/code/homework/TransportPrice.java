package homework;
/*
Задача 4(*). Написать программу для вычисления средней стоимости
поездки по транспортному проездному.
В программе задать стоимость проездного
на месяц и количество рабочих дней в месяце.
Считая, что в рабочий день в среднем две поездки,
и 1.5 поездки в выходной, посчитать
и округлить общее число поездок в месяц
и затем рассчитать среднюю стоимость
одной поездки по проездному билету.
Рассчитать для января 2024 года.
 */
public class TransportPrice {
    public static void main(String[] args) {
        int monthlyTicket = 300; // AED currency
        int workDays = 25;
        int offDays = 6;

        System.out.println("Total Trips = " + totalOfTrips(workDays, offDays));
        System.out.println("Average Price per Trip = " + avePricePerTrip(monthlyTicket, totalOfTrips (workDays, offDays)));


    } // end of main

    public static double totalOfTrips (int workDays, int offDays){
        return (workDays * 2) + (offDays * 1.5);
    }
    public static double avePricePerTrip (int monthlyTicket, double totalOfTrips){
        return monthlyTicket / totalOfTrips;
    }
}// end of class
