package classwork25.example01;

public class Cat25 extends Pet25 implements Voiceable, Petable{
    public Cat25(String name, int age) {
        super(name, age);
    }

    @Override
    public void feed() {
        System.out.println("(You put some cat food in a plate)");
    }

    @Override
    public void cleanUp() {
        System.out.println("(You clean up a litter box)");
    }

    // переопределение метода voice

    @Override
    public void voice () {
        System.out.println("Meow");
    }

    @Override
    public void pet() {

    }
}
