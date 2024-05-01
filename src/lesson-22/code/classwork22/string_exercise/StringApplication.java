package classwork22.string_exercise;

import java.util.Arrays;
import java.util.Locale;

public class StringApplication {
    public static void main(String[] args) {

        String str = "Hello, World"; // str - это объект класса String
        System.out.println(str);
        System.out.println("------------------");

        String str1 = "Hello,";
        char [] str2 = {32,'W', 'o', 'r', 'l', 'd'}; // char закодирован, 32 - ASCII код пробела
        String str3 = new String(str2);
        String str4 = str1 + str3;
        System.out.println(str4);
        System.out.println("------------------");

        // конкактинация - объединение, соединение
        str = str1.concat(str3);
        System.out.println(str);
        System.out.println("------------------");

        // length
        int l = str.length();
        System.out.println("Length of string: " + l);
        System.out.println("------------------");

        // charAt - найти последний символ
        char c = str.charAt(str.length() -1); // последний элемент строки (точно так же как и массива) всегда имеет legth -1,
        System.out.println(c);
        System.out.println("------------------");

        // print every letter of String
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
        System.out.println("------------------");

        // equals
        String w1 = "World";
        String w2 = "world";
        boolean check = w1.equals(w2);
        System.out.println(check); //
        check = w1.equalsIgnoreCase(w2);
        System.out.println(check);
        System.out.println("------------------");

        // toLowerCase, toUpperCase
        String lowerCase = str.toLowerCase();
        System.out.println(lowerCase);
        String upperCase = str.toUpperCase();
        System.out.println(upperCase);
        System.out.println("------------------");

        // index
        int index = str.indexOf('l');
        System.out.println(index);
        index = str.lastIndexOf('l');
        System.out.println(index);
        index = str.indexOf("World"); // с какого индекса начинается слово
        System.out.println(index);
        System.out.println("------------------");
        index = str.indexOf('l', 4); // начиная со второй позиции, включая левый край
        System.out.println(index);
        System.out.println("------------------");

        // subString (подстрока)
        System.out.println(str.substring(6));
        System.out.println(str.substring(2, 8));
        System.out.println("------------------");

        // replace
        System.out.println(str.replace('o', 'a')); // замена "о" на "а"
        System.out.println(str); // выдает старое , потому что просто стр, ссылочный тип(String)
        System.out.println(str.replace("o", "o-o-o")); // "" такие кавычки ставятся если можно написать более одного символа, например "ord"
        System.out.println("------------------");

        // trip - убираем пробелы
        String string = "    Bill Smith  ";
        System.out.println(string.trim());
        System.out.println("------------------");

        // number of words, or letters
        String string1 = "One two, three four five, six seven";
        String [] words = string1.split(" "); // regex - regular expression
        // split - умеет взять строку методом которой он является с разделителем в скобке разбегается, считает и в массив все это закладывает. возвращает массив
        System.out.println("Number of words = " + words.length);

        // print with ARRAYS.toString()
        System.out.println(Arrays.toString(words)); // same as fori
        System.out.println("------------------");

        //подсчет символов или букв
        String [] letters = string1.split(""); // "" пустые кавычки разделяют строку на символы
        System.out.println(letters.length);
        System.out.println(Arrays.toString(letters));

    }
}
