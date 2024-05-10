package classwork25.example01;

public class Fish25 extends Pet25 implements Petable {
    public Fish25(String name, int age) {
        super(name, age);
    }

    @Override
    public void feed() {
        System.out.println("(You throw some fish meal to the aquarium!)");

    }

    @Override
    public void cleanUp() {
        System.out.println("(You change dirty water)");

    }

    @Override
    public void pet() {
        System.out.println("(You pet the fish. Not a very pleasant experience)");
    }
}
