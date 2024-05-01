package homework.student;

import homework.student.model.Student;

/*
В классе StudentAppl создать несколько студентов. Отобразить процесс учебы.
 */
public class StudentApplication {
    public static void main(String[] args) {
        Student bir = new Student(1,"Alex", "Riddle", 1995, "Math");
        Student eki = new Student(2,"Kira", "Stan", 1999, "Theology");
        Student uch = new Student(3,"Marina", "Pearl", 2005, "law");


        System.out.println(bir);
        System.out.println(eki);
        System.out.println(uch);

        System.out.print(eki.getName());
        eki.study();

        System.out.print(bir.getName());
        bir.exam();

        System.out.print(uch.getName());
        uch.leave();
        System.out.println();
        uch.display();
    }

}
