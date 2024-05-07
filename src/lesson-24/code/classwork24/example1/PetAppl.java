package classwork24.example1;
public class PetAppl {
    public static  void voice (Pet pet) {
        if (pet instanceof Cat) { // this is how typecheck looks like
            Cat cat = (Cat) pet; // typecast was made by (Cat)
            cat.meow();
        }
        if (pet instanceof Dog)  {
            Dog dog = (Dog) pet; // typecast was made by (Dog)
            dog.bark(); // typecast was made, so we could ask ".bark" from the other class
        }
    }
    public static void main(String[] args) {
    Pet pet1 = new Dog("Richard", 6, "Golden retriever", 15, 50, DogProfession.DOMESTIC);
    Pet pet2 = new Cat("Vasya", 4, "Sphinx", 1.5, false);

    voice (pet1);
    voice (pet2);

}
}