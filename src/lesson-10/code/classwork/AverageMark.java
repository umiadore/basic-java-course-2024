package classwork;
/*
Имеются оценки абитуриента из его аттестата, всего 20 оценок.
Найдите средний балл абитуриента.
 */
public class AverageMark {
    public static void main(String[] args) {
        int [] marks = {1, 2, 1, 2, 3, 2, 1, 3, 4, 1, 2, 3,  5, 2, 1, 3 , 3, 1, 2, 1 };
        System.out.println(marks.length); // чтобы узнать сколько мы там написали цифр

        int sumOfMarks = 0;

        for (int i = 0; i < marks.length; i++) {
            sumOfMarks += marks [i];
        }
        double averageMark  = (double) sumOfMarks /marks.length;
        System.out.println("Average Mark: " +  averageMark);
        System.out.printf("Average Mark: %.2f", averageMark);
        }
    }
