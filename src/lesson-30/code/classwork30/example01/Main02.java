package classwork30.example01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main02 {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(); // создаем список array list - это массив реализованный в collection framework
        fruits.add("Apple");
        fruits.add("Grapes");
        fruits.add("Orange");
        fruits.add("Melon");
        fruits.add("Pear");

        for(String s : fruits) { // for each можно использовать только для классов iterable
            System.out.println(s);
        }
        System.out.println(fruits);
        fruits.remove("Melon");
        System.out.println(fruits);
    }
}

class Main03 {
    public static void main(String[] args) {
        int [] array = { -1, 3, 14, 52, 7 ,88 };


        List <Integer> list = new ArrayList<>();
        for (int i : array)  {
            list.add(i);
        }
        // example:
        // list = List.of(1,2,3); через List.of это неизменяемый (иммутабельный)список, добавлять в него элементы нельзя, нельзя делать set, add, remove
        // list = new ArrayList<> (List. of (1, 2, 3, 4, 5, 6, 7, 8)); чтобы можно было добавить

        list. add (9);
        System.out.println(list);
    }
}

class Main04 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(45,6,21,-5,15));
        System.out.println(list);
        int oldValue = list.set(1,0);
        System.out.println(list);
        System.out.println(oldValue);

        list.remove(Integer.valueOf(0)); // удаляет реальное число
        System.out.println(list);

        list.remove(0); // удаляет по индексу
        System.out.println(list);

        list.sort(new Comparator<Integer>() { // comparator сортирует натуральный порядок
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        });
        System.out.println(list);
        list.subList(1,3).clear(); // удаляет и из list, потому что sublist дает ссылку на кусок другого списка
        System.out.println(list);
    }
}


