package homework22.string_practicum;

public class String_Practicum {
    public static void main(String[] args) {

        String strLanguage = "I'm proud to learn Java! Java is the most famous programming language!!!";
        System.out.println(strLanguage);
        System.out.println("------------------");

        // Распечатать последний символ строки.
        char last = strLanguage.charAt(strLanguage.length() -1);
        System.out.println(last);
        System.out.println("------------------");

        //Найти позицию подстроки “Java” в строке
        System.out.println(strLanguage.indexOf("Java"));
        System.out.println("------------------");

        // Проверить, содержит ли заданная строка подстроку “Java”.
        System.out.println("Contains 'Java': " + strLanguage.contains("Java")); // contains используется для проверки наличия подстроки в строкe
        System.out.println("------------------");

        // Заменить все символы “o” на “a”.
        System.out.println(strLanguage.replace("o", "a"));
        System.out.println("------------------");

        // Преобразуйте строку к верхнему регистру.
        System.out.println(strLanguage.toUpperCase());
        System.out.println("------------------");

        //Преобразуйте строку к нижнему регистру.
        System.out.println(strLanguage.toLowerCase());
        System.out.println("------------------");

        //Вырезать подстроку Java c помощью метода substring().
        System.out.println(strLanguage.substring(strLanguage.indexOf("Java")));
        System.out.println("------------------");

        //Проверить, заканчивается ли строка подстрокой “!!!”.
        System.out.println(strLanguage.endsWith("!!!"));
        System.out.println("------------------");

        //Проверить, начинается ли строка подстрокой “I'm proud”.
        System.out.println(strLanguage.startsWith("I'm proud"));
        System.out.println("------------------");
    }
}
