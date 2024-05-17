package classwork29.example01;

public class Main {
    public static void main(String[] args) {
        Box<Cat> box = new Box<>(); // c левой стороны мы указываем тип, поэтому там внутри что-то есть, с правой стороны мы ставим пустые скобки и комплитяор будет брать тип из скобок которые слева
        Box<Dog> dogBox = new Box<>();

        Cat cat = new Cat();
        box.put(cat);

        System.out.println(box);

        Cat myCat = box.take();
        System.out.println(box);
        System.out.println(cat == myCat); // один и тот же кот в двух разных ссылках
    }
}
