package classwork.computers;

import classwork.computers.model.Computer1;
import classwork.computers.model.Laptop1;
import classwork.computers.model.Smartphone1;

public class ComputerCompareApplication {
    public static void main(String[] args) {
        Computer1[] comp = new Computer1[3];
        comp [0] = new Computer1("i5", 12, 512, "HP", 1000);
        comp [1] = new Laptop1("i7", 16, 512, "Acer", 1300, 14, 2.2, 6);
        comp [2] = new Smartphone1("A11", 3, 256, "Apple", 900,5.8, 174,12, "IOS 17", true );

        printArray (comp);

        Computer1 computer = new Computer1("i5", 12, 512, "HP", 1000);
        System.out.println(computer);
        System.out.println(comp [0]);
        boolean checker = computer == comp[0]; // == - это сравнение
        System.out.println(checker);
        System.out.println("________________");
        System.out.println(computer.equals(comp [0]));
    }
    public static void printArray (Object[] comp) {
        for (int i = 0; i < comp.length; i++) {
            System.out.println(comp [i].toString());
        }
    }
}
