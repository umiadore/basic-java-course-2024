package classwork.firm.model;

public class Employee {
    // describing fields first:
    private int id; // в компаниях выдают номер для работников
    private String name;
    private String surname;
    private int age;
    private boolean gender;
    private double salary;

    //constructor
    public Employee(int id, String name, String surname, int age, boolean gender, double salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    // getters x setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", salary=" + salary +
                '}';
    }

    public void work(){
        System.out.println("The Employee is working hard!");
    }
    public void lunch (){
        System.out.println("The Employee is on a break");
    }
    public void asleep () {
        System.out.println("The Employee is asleep");
    }
}
