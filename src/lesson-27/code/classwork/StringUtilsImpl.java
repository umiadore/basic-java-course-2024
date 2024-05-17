package classwork;

public class StringUtilsImpl implements StringUtils {
    /*
       Проверяет, является ли строка word палиндромом
       (т.е. можно ли ее одинаково прочитать с начала в конец и с конца в
               начало), игнорируя регистр букв
       Примеры палиндромов (для этих вводов true): 12:21, тенет, Пилип
       Обратите внимание, что, к примеру, "А роза упала на лапу Азора"
        не будет палиндромом в нашей программе, так как
       в этой строке палиндромными будут только буквы, но не пробелы.
       Дополнительное задание: сделать так,
       чтобы знаки препинания и пробелы не мешали определению палиндрома
    */
    @Override
    public boolean isPalindrome(String word) { // palindrome это слово которое справа налево и лево на право чистается одинаково
      return (word.equalsIgnoreCase(reverse(word)));
     //  return (word.equalsIgnoreCase(new StringBuilder (word).reverse().toString()); = the same one as the one above
    }
    /*
Проверяет, является ли строка sentence панграммой (на английском) и возвращает истину если это так.
Справка: панграмма - такое предложение, в котором каждая буква алфавита использована один раз
Пример: The quick brown fox jumps over the lazy dog
       */
    @Override
    public boolean isPangram(String sentence) {
        sentence = sentence.toLowerCase();
        boolean [] found = new boolean[26];
        for (int i = 0; i < sentence.length(); i++) {
            int code = sentence.charAt(i) - 'a';
            if (code >=0 && code <26) {
                found[code] = true;
            }
        }
        for (int i = 0; i < found.length ; i++) {
            if (!found[i])  {
                return false;
            }
        }
        return true;
    }
    /*
          Читает строку в которой записан IPv4 и возвращает массив из 4 значений типа byte со значениями этого айпи
          Для этого сначала нужно разделить строку на подстроки по КАКОМУ-ТО признаку (намек на то что вам нужно понять, по какому именно),
          а потом использовать класс Byte чтобы превратить строки в числа.
          Выбросить исключение, если на любом этапе работы метода была ошибка в введенных данных.
          Примеры айпи: 127.0.0.1, 192.168.0.12, 77.156.21.33
          Обратите внимание, что в результате могут выйти отрицательные числа. Это вполне нормально (см. тему "целочисленное переполнение")

       */
    @Override
    public byte[] parseIp(String ip) {
        return new byte[0];
    }
/*
Шифрует строку text таким образом, чтобы ее нельзя было с легкостью прочитать.
Можно использовать любой метод шифрования, либо взять предложенный.

Предложенный метод: метод Цезаря. Все буквы сдвигаются
на 3 вперед по алфавиту для зашифровки и на 3 назад
по алфавиту для расшифровки.
Подсказка: табличка ASCII
*/
    @Override
    public String encrypt(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i ++){
            char ch = text.charAt(i);
            sb.append((char)(ch + 3));
        }
        return sb.toString();
    }
    /*
 Делает противоположное действие со строкой data к тому, которое было сделано в методе encrypt().
Таким образом, происходит расшифровка, и должно быть получено исходное сообщение
         */
    @Override
    public String decrypt(String data) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < data.length(); i ++){
            char ch = data.charAt(i);
            sb.append((char)(ch - 3));
        }
        return null;
    }
    /* Считает сколько раз символ letter появляется в строке text и возвращает это число.
Возвращает 0 если переданная строка равна null, пуста, либо этого символа нет в строке.
        */
    @Override
    public int countOccurencies(String text, char letter) {
        // null check
        if (text == null) {
            return 0;
        }
        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == letter){
                counter ++;
            }
        }
        return counter;
    }
    /*
    Разворачивает строку text.
    Например, строка Hello world должна быть
    превращена в dlrow olleH
    */
    @Override
    public String reverse(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = text.length() -1; i >= 0; i--){
            sb.append(text.charAt(i));
        }
        return sb.toString();
        // return new StringBuilder (text).reverse().toString(); - альтернативный вариант
    }
/*
Разворачивает порядок слов в строке text (слова разделены пробелами).
Например, для ввода What a wonderful day результат будет day wonderful a What
 */
    @Override
    public String wordReverse(String text) {
        StringBuilder sb = new StringBuilder();
        String [] words = text.split(" ");
        for (int i = words.length -1; i >=0 ; i--) {
            sb.append(words[i]).append(" ");

        }
        return sb.toString().trim();
    }
    /*
Переводит текст в строке text в идентификатор в стиле lowerCamelCase
Например, для ввода What a BEAUTIFUL day должен получиться
результат whatABeautifulDay

Дополнительное задание: также убрать из строки все символы,
которые не разрешаются в идентификаторах (напр. знаки препинания)
        */
    @Override
    public String toCamelCase(String text) {
        StringBuilder sb = new StringBuilder(); // создали чтобы записывать результат
        String [] words = text.split(" "); //

        for (int i = 0; i < words.length; i++){
            if (words[i].isEmpty()){
                continue;
            }
            if (i == 0 ){
                sb.append(words [i].toLowerCase());
            } else {
                sb.append(words[i].substring(0,1).toUpperCase())
                .append(words[i].substring(1).toLowerCase());
            }
        }
        return sb.toString();
    }
}
