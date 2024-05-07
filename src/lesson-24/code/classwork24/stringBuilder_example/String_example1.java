package classwork24.stringBuilder_example;

public class String_example1 {
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

    class String_example2 {
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