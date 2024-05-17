package classwork29.example02;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Bottle bottle1 = new Bottle(Materials.PLASTIC, 10);
        Bottle bottle2 = new Bottle(Materials.STEEL, 1.5);

        int res = bottle1.compareTo(bottle2);

        if (res >0 ){
            System.out.println("The 1st bottle is bigger");
        } else if (res <0){
            System.out.println("The 2nd bottle is bigger");
        }else {
            System.out.println("Bottles are equal");
        }
        Comparator <Bottle> comparator = new BottleMaterialComparator ();
        res = comparator.compare(bottle1, bottle2);
        if (res >0 ){
            System.out.println("The 1st bottle is stronger");
        } else if (res <0){
            System.out.println("The 2nd bottle is stronger");
        }else {
            System.out.println("Bottles are equal");
        }
    }
}
