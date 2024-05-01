package homework.pet.model;

public class Dog extends Pets {

    String type;
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Dog(String breed, double height, double weight, String type) {
        super(breed, height, weight);
        this.type = type;
    }

    @Override
    public void voice() {
        System.out.println("Woof - woof!");
    }
}