package homework.pet.model;

public class Pets {
    String breed;
    double height;
    double weight;

    public Pets(String breed, double height, double weight) {
        this.breed = breed;
        this.height = height;
        this.weight = weight;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Pets{" +
                "breed='" + breed + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
    public void voice() {
        System.out.println("Animal sound");
}
}
