package classwork24;

import java.util.Objects;

public class StringBuilderExample {
    public static void main(String[] args) {
        // Создаем объект StringBuilder
        StringBuilder shoppingList = new StringBuilder();

        // Добавляем пункты в список покупок
        shoppingList.append("Молоко");
        shoppingList.append(", Яйца");
        shoppingList.append(", Хлеб");
        shoppingList.append(", Шоколад");

        // Выведем итоговый список покупок
        System.out.println(
                "Список покупок: " + shoppingList.toString()
        );
    }
}

class StringExample {
    public static void main(String[] args) {
        // Создаем пустую строку
        String shoppingList = "";

        // Добавляем пункты в список покупок
        shoppingList = shoppingList + "Молоко";
        shoppingList = shoppingList + ", Яйца";
        shoppingList = shoppingList + ", Хлеб";
        shoppingList = shoppingList + ", Шоколад";

        // Выводим итоновый список покупок
        System.out.println(
                "Список покупок: " + shoppingList
        );
    }
}

class StringBuilderExample2 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("");
        str.append("a");
        str.append(" cat without a tail ");
        str.insert(0, "I have ");
        str.delete(7,9);// задается первым начальным и вторым конечный
        int i = str.indexOf("cat");
        str.delete(i, i + 3);

        int haveIndex = str.indexOf("have");
        str.replace(haveIndex, haveIndex +4, "had");

        str.append("headache");

        // что такое append?

        System.out.println(str.toString());
        System.out.println(str.reverse().toString());

    }
}





