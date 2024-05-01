package classwork;
/*
Задача о яблоках (начальное значение 30 яблок).
Запустить цикл, в котором яблоки берутся из корзины до тех пор,
пока они там есть. Последнее сообщение: "Яблоки кончились!".
 */
public class ApplePie {
    public static void main(String[] args) {
        int apples = 30;
        int counter = 0;
        int applesInTheBasket = apples;

        while ( applesInTheBasket > 0 ) {
            // начинаем делать тело цикта - cycle´s body
            System.out.println("Take one apple from the basket.");
            applesInTheBasket = applesInTheBasket - 1;
            System.out.println("We have now apples  " + applesInTheBasket + " left. ");
            counter++; // it is the same as counter = counter +1;
        }
        System.out.println("The work is done. Total amount of apples " + counter + " added in the pie ");
    } // end of main
} // end of class
