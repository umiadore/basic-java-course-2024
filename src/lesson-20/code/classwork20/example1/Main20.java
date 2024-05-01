package classwork20.example1;

public class Main20 {


    public static void main(String[] args) {
        Human20 misha = new Human20("Misha",3);
        Human20 olga = new Human20("Olga", 2);

        System.out.println(misha.getName());
        System.out.println(olga.getName());

        System.out.println("Species: " + misha.species);
        olga.species = "Domestic cat"; // потому что species не привязан к опр объекьту, и если через один объект поменять, то он поменяется для всех
        System.out.println("Species: " + misha.species);
    }
}
