package homework.pet.model;

public class Cats extends Pets{
    String type;

    public Cats(String breed, double height, double weight, String type) {
        super(breed, height, weight);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void voice() {
        // super.voice();
        System.out.println("Meow");
    }
}
