package classwork23.student;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    //fields
    private int id;
    private String name;
    private String surname;
    private int [] marks;

    // constructor


    public Student(int id) {
        this.id = id;
    }

    public Student(String name, String surname, int[] marks) {
        this.name = name;
        this.surname = surname;
        this.marks = marks;
    }

    // пустой конструктор
    public Student() {
    }
    // setters x getters

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

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }
//toString
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", marks=" + Arrays.toString(marks) +  // arrays - класс обертка над массивами
                '}';
    }
// В equals оставляем только айди потому что оно позволяет быстро и эффективно сравнить тех или иных студентов
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    // average score

    public double aveScore (int [] marks) { // static - метод прописан приписан к данному классу онли
        //sum of marks
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum+= marks[i];
        }
        return sum/(double)marks.length;
    }
}
