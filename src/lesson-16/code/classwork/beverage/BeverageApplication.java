package classwork.beverage;

import classwork.beverage.model.Beer;
import classwork.beverage.model.Beverage;

public class BeverageApplication {
    public static void main(String[] args) {

        Beverage b1 = new Beverage("Milk", false, "Bayara", 2, "in boxes" );
        b1.toBuy("Milk", "in boxes", 3);
        b1.displayStock();

        Beer beer = new Beer("Beer", true, "Corona", 3, "in boxes", false, "dark ");
        beer.toBuy("beer", "in boxes", 6);
        beer.displayStock();
    }
}
