package classwork23.student;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class StudentTest {

    // Student student = new Student();
    Student student;  // создаем объект из тестируемого класса. То что наверху равно этой строке

    @BeforeEach
    void setUp() {
        student = new Student();

    }

    @Test
    void aveScore() {
        int [] marks = {1, 2, 1, 3, 2, 1, 6, 5, 4, 2}; // german grading system
        assertEquals(2.7, student.aveScore(marks));

    }
}