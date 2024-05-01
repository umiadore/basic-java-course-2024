package person;

public class Person {
    public String name;
    public int age;
    public static int count = 0 ;
    public void sayHello (){
        System.out.println("Hi, my name is " + this.name);
    }
    public void sayBye (){
        System.out.println("Bye, my name is " + this.name);
    }
    public  Person (String personName, int personAge) {
        this.name = personName;
        this.age = personAge;
        Person.count +=1;
    }
    public int getAge() {
        return this.age;
    }
    public void setAge (int age) {
        this.age = age;
    }
}


class Main {
    public static void main(String[] args) {
        Person person = new Person("Karl", 99);
        Person person2 = new Person("karina", 123);
        Person person3 = new Person("Kira", 19);
        person.sayHello();
        person.sayBye();
        person2.sayHello();
        person2.sayBye();
        person3.sayHello();
        person3.sayBye();
        System.out.println("Count: " + Person.count);
        System.out.println("Age of person2 " + person2.getAge());
    }
}
