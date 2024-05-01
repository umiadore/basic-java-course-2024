package homework.student.model;

public class Student {
    private int id;
    private String name;
    private String surname;
    private int birthYear;
    private String specialization;

    //constructor


    public Student(int id, String name, String surname, int birthYear, String specialization) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
        this.specialization = specialization;
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

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthYear=" + birthYear +
                ", specialization='" + specialization + '\'' +
                '}';
    }

    public void display () {
        System.out.println("The ID of the student: "+ id + " |" + " Full Name: " + name +" " + surname + " |"  + " The Year of Birth: " + birthYear +  " |" + " Specialization: " + specialization);
    }
    public void study () {System.out.println(" is studying.");}
    public void exam () {System.out.println(" passed all the exams");}
    public void leave () {System.out.println(" is on an academic leave");}
}
