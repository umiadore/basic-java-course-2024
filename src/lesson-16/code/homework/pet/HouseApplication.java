package homework.pet;

import homework.pet.model.Cats;
import homework.pet.model.Dog;
import homework.pet.model.Pets;

public class HouseApplication {
    public static void main(String[] args) {
        Pets[] pet = new Pets[5];
        pet [0] = new Dog("Sheperd ", 22.5, 52, "Dog");
        pet [1] = new Dog("Dalmatian", 40.5, 62, "Dog");
        pet [2] = new Cats("Persian", 30, 5, "Cat");
        pet [3] = new Cats("Siam", 25, 7, "Cat");
        pet [4] = new Cats("Ginger", 15, 4, "Cat");

        for (int i = 0; i < pet.length; i++) {
            System.out.println(pet [i]);
           // System.out.println("Sound: " );
            pet[i].voice();
        }
    }
}
