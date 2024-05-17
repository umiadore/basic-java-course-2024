package classwork28;

import classwork.StringUtils;
import classwork.StringUtilsImpl;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {
    private static StringUtils utils;
    @BeforeAll
    public static void init () {
        utils = new StringUtilsImpl();
    }
    @Test
    public void isPalindromeReturnsTrueForPalindromes () {
        assertTrue (utils.isPalindrome("12:21"));
        assertTrue (utils.isPalindrome("123321"));
        assertTrue (utils.isPalindrome("hannah"));
    }

    @Test
    public void isPalindromeReturnsFalseForNonPalindromes () {
        assertFalse(utils.isPalindrome("123456"));
        assertFalse(utils.isPalindrome("Salam"));
        assertFalse(utils.isPalindrome("How are you"));
    }
    @Test
    public void isPalindromeReturnsTrueForASingleChar() {
        assertTrue(utils.isPalindrome("1"));
    }
    @Test
    public void isPalindromeReturnsTrueForTheEmptyString() {
        assertTrue(utils.isPalindrome(""));
    }

    @Test
    public void isPangramReturnsTrueForPangrams () { // панграмма - короткий текст, использующий все или почти все буквы алфавита, по возможности не повторяя их.
        assertTrue(utils.isPangram("The quick brown fox jumps over the lazy dog"));
    }
    @Test
    public void isPangramReturnsFalseForPangrams () {
        assertFalse(utils.isPangram("Hello world!"));
    }
 /* Считает сколько раз символ letter появляется в строке
text и возвращает это число.
Возвращает 0 если переданная строка равна null,
 пуста, либо этого символа нет в строке.
  public int countOccurencies(String text, char letter)
  */
    @Test
    public void countOccurenciesCountsLetters () {
    assertEquals(3, utils.countOccurencies("Hello world", 'l'));
    assertEquals(1, utils.countOccurencies("1234567", '2'));
    assertEquals(0, utils.countOccurencies("1234567", '9'));
    }

    @Test
    public void countOccurenciesReturnsZeroForEmptyString ()  {
        assertEquals(0, utils.countOccurencies("", '1'));
    }
 /*
    Разворачивает строку text.
    Например, строка Hello world должна быть
    превращена в dlrow olleH
    public String reverse(String text)
    */
    @Test
    public void reverseWorks() {
        assertEquals("dlrow olleH", utils.reverse("Hello world")); // assert Equals потомк что он возвращает String
    }

    @Test
    public void reverseReturnsTheSameStringForASingleLetter () {
        String s = "a";
        assertEquals("a", utils.reverse(s));
    }

    @Test
    public void reversReturnEmptyStringForEmptyString () {
        assertEquals("", utils.reverse(""));
    }

    /*
Разворачивает порядок слов в строке text (слова разделены пробелами).
Например, для ввода What a wonderful day результат будет day wonderful a What
 public String wordReverse(String text)
 */
    @Test
    public void wordReverseWorks()  {
        assertEquals("world hello", utils.wordReverse("hello world"));
    }

}

