package classwork31;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue =new LinkedList<>(); // Linked List можно использовать в качестве очереди
        queue.add("Banana");
        queue.offer("Apple");
        queue.offer("Cherry");
        System.out.println("Poll: " + queue.poll()); // poll забирает первый элемент
        queue.offer("Pear");
        for (String s:queue) {
            System.out.println(s);
        }
        System.out.println("Queue is empty: " + queue.isEmpty());
        System.out.println(queue.peek()); // позволяет посмотреть как элемент в начале очереди
    }
}


class Main02 {
    public static void main(String[] args) {
        // key - value pair
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("hello", "привет");
        dictionary.put("integer", "целый");
        dictionary.put("programming", "программирование");
        dictionary.put("map", "карта");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово на английском");
        String word = scanner.next();
        if (dictionary.containsKey(word)) {
            System.out.println("Перевод: " + dictionary.get(word));
        } else  {
            System.out.println("Такого слова нет в словаре!");
            for (String key : dictionary.keySet())  {
                System.out.println(key + ": " + dictionary.get(key));
            }
        }
    }
}

class Main03 {
    public static void main(String[] args) {
        Set <String> set = new HashSet<>();
        set.add("mango");
        set.add("mango");
        set.add("apple");
        set.add("grape");
        set.add("banana");
        System.out.println(set);
    }
}