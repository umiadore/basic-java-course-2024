package classwork;
/*
Создайте массив и заполните его символами латинского алфавита от A до Z.
Раcпечатайте полученный массив.
 */
public class ArrayAlphabet {
    public static void main(String[] args) {
        // заполним массив целыми числами от 1 до 20

        int [] arrayNum = new int[20]; // длина массива будет 20, потому что единица тоже учитывается

        // заполняем массив данными внизу
        for (int i = 0; i < arrayNum.length; i++) {
            arrayNum [i] = i + 1; // i это индекс, увеличиваем на единицу, на каждом шагу цикла будет заноситься правильное число
        }
        // печатаем массив, который у нас заполнен
        for (int i = 0; i < arrayNum.length; i++) {
            System.out.print(arrayNum[i] + " |");
        }
        System.out.println();
        char [] alphabet = new char[26]; // мы уже определили массив
        for (int i = 0; i < alphabet.length; i++) {
            alphabet [i] = (char) (65 +i); // 65 - это номер буквы А по таблице аски
            System.out.print(alphabet[i] + " |" );
        }
        System.out.println();
        System.out.println(alphabet);
    }
}
