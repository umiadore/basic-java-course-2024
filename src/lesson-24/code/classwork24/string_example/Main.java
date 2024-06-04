package classwork24.string_example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String pushkin = "У лукоморья дуб зеленый, златая цепь на дубе том";
        String [] array = pushkin.split(" ");
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

//Пользователем вводится строка,
//возьмите первый и последний символы строки. Конкатенируйте их (сложите)
// повторите полученную строку 5 раз
//Если в строке есть буква "а" замените ее на буквы "b" //оставьте только последние 5 символов
//Выведите на экран символ под номером 2

class Main01  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        int size = string.length();
        String first = string.substring(0,1);
        String last = string.substring(size -1,size);

        System.out.println(first);
        System.out.println(last);

        String res = first + last;
        System.out.println(res);
        res = res.repeat(5);
        System.out.println(res);

        res = res.replace("a", "b");
        System.out.println(res);

        res = res.substring(res.length() - 5);
        System.out.println(res);

        char symbol = res.charAt(2);
        System.out.println(symbol);
    }
}