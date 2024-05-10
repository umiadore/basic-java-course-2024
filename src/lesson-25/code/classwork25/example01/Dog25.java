package classwork25.example01;

public class Dog25 extends Pet25 implements Voiceable, Petable, Walkable {
    public Dog25(String name, int age) {
        super(name, age);
    }

    @Override
    public void feed() {
        System.out.println("(Give your dog some food!)");
    }

    @Override
    public void cleanUp() {
        System.out.println("(Clean up after your dog)");
    }

    @Override
    public void voice () {
        System.out.println("Woof!");
    }

    @Override
    public void pet() {
        System.out.println("(You pet your dog)");
    }

    @Override
    public void goForAWalk() {
        System.out.println("(You go for a lovely walk with your dog)");
    }
}
