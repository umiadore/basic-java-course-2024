package classwork22.aggregation_example;

public class Main_aggregation {
    public static void main(String[] args) {

        Address address = new Address("UAE", "Dubai", "Al Marsa Street");

        Person person1 = new Person("Umut", address);
        Person person2 = new Person("Madina", address);

        person1.introduce();
        person2.introduce();
    }
}
