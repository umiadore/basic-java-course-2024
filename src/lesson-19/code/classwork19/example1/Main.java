package classwork19.example1;

public class Main {
    public static void main(String[] args) {
        Human maxim = new Human("Maxim", 12);
        Human anton = new Human("Anton", 32);

        Human.celebrateBday(maxim);
        Human.meet(maxim, anton);

        System.out.println(Human.SPECIES);

    }
}
