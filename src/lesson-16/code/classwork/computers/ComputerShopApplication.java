package classwork.computers;

import classwork.computers.model.Computer1;
import classwork.computers.model.Laptop1;
import classwork.computers.model.Smartphone1;

public class ComputerShopApplication {
    public static void main(String[] args) {

        Computer1[] comp = new Computer1[6]; // это чтобы не печатать 5 компьютеров и не давать им названия, массив из объектов

        comp [0] = new Computer1("i7", 8,  256, "Asus", 1200);
        comp [1] = new Computer1("i9", 16,  512, "Acer" , 1800);
        comp [2] = new Laptop1("m2", 16, 512, "Apple", 2400, 14,2.15, 10);
        comp [3] = new Laptop1("AMD", 64, 2000, "MCI", 3000, 21,3, 4);
        comp [4] = new Laptop1("Intel", 32, 1024, "MCI", 1500, 15, 2.5, 6);
        comp [5] = new Smartphone1("A9", 64, 512, "Apple Iphoen 15",1500, 9, 300,6, "Ios", true );

        
        for (int i = 0; i < comp.length; i++) {
            System.out.println(comp [i]);

        }
        int sumSSD = 0;
        for (int i = 0; i < comp.length; i++) {
            sumSSD = sumSSD + comp[i].getSsd();
        }
        System.out.println("Total SSD memory is " + sumSSD);

        int totalPrice =0;
        for (int i = 0; i < comp.length; i++) {
            totalPrice += comp[i].getPrice();
        }
        System.out.println("Total price is " + totalPrice);
    }
}
