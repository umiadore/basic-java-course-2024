package classwork10;
/*
Создайте массив, который содержит возраст студентов группы.
- какой возраст максимальный?
- какой возраст минимальный?
 */
public class Age {
    public static void main(String[] args) {
        int [] ageOfStudent = {31, 44, 28, 39, 21, 26, 44, 45, 38, 60 };
        // find the max element and its index
        int max = ageOfStudent[0];
        int indexMax =0;
        for (int i = 0; i < ageOfStudent.length; i++) {
            if (ageOfStudent [i] >max) {
                max = ageOfStudent[1];
                indexMax = i;

            }
        }
        System.out.println("Max age = " + max);
        System.out.println("Index of Max element: " + indexMax);
    }
}
