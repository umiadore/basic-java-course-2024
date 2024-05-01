package homework.pet;

import homework.pet.model.Pet;

/*
В классе PetAppl создать несколько экземпляров домашних животных.
Отобразить прожитый день.
 */
public class PetApplication {
    public static void main(String[] args) {
 // создаем животных
        Pet cat = new Pet(1, "Egyptian Cat", 3,"Monti" );
        Pet dog = new Pet(2, "German Dog",5, "Shaman" );
        Pet hamster = new Pet(3, "Chinese Hamster", 2, "Viva");

        System.out.println(cat);
        System.out.println(dog);
        System.out.println(hamster);

        // the day of a cat

        System.out.println("The day of a pet named " + cat.getName());
        System.out.print("After a pet wakes up, ");
        cat.eat();
        System.out.print("And then "); cat.play();
        cat.walk() ; cat.noise();
        System.out.print("In the end of the day, ");
        cat.sleep();
    }
}
