package classwork39.person;

import java.time.LocalDate;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person("Daniil", LocalDate.of(2001, 12, 17));
        System.out.println(person);
    }
}
