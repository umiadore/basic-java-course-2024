package classwork.computers;

import classwork.computers.model.Computer1;
import classwork.computers.model.Laptop1;
import classwork.computers.model.Smartphone1;

/*
Задание1.
Создать "семейство" классов Computer, Laptop, SmartPhone.
Реализовать метод, который посчитает общий объем RAM в имеющихся на складе устройствах.
Реализовать метод, который посчитает общий вес имеющихся на складе устройств.
 */
public class ComputerApplication {
    public static void main(String[] args) {

        Computer1 [] comp = new Computer1[3];
        comp [0] = new Computer1("i5", 12, 512, "HP", 1000);
        comp [1] = new Laptop1("i7", 16, 512, "Acer", 1300, 14, 2.2, 6);
        comp [2] = new Smartphone1("A11", 3, 256, "Apple", 900,5.8, 174,12, "IOS 17", true );

        printArray (comp);

        int totalRAM = getTotalRAM (comp);
        System.out.println("Total RAM = " + totalRAM);

        Laptop1 laptop1 = (Laptop1) comp [1]; // эта операция называется down casting - приведение к нужному типу
        System.out.println(laptop1.getWeight());

       double totalWeight = getTotalWeight (comp);
        System.out.println("Total weight =" + totalWeight);

    } // end of main

    private static double getTotalWeight(Computer1[] comp) {
        double res = 0;
        for (int i = 0; i < comp.length; i++) {
            if (comp [i] instanceof Laptop1) {
                Laptop1 laptop1 = (Laptop1)  comp [i];
                res += ((Laptop1) comp[i]).getWeight();
            }
      }
        return res;
    }


    private static int getTotalRAM(Computer1[] comp) {
        int result = 0;
        for (int i = 0; i < comp.length; i++) {
            result += comp[i].getRam();
        }
        return result;
    }

    // methods are always placed in between main and class
    public static void printArray (Computer1 [] comp) {
        for (int i = 0; i < comp.length; i++) { // нужно поставить длину нашего массива, поэтому пишется lenght
            System.out.println(comp [i].toString());
    }
    }
}
