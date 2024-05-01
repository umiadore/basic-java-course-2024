package classwork23.sentence_test;

import  org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import javax.xml.transform.sax.SAXSource;

public class SentenceTestK {
    private Sentence sentence;

   @BeforeEach
    // тот метод перед каждым тестом должен называеться сетап
    public void setUp () {
       // это нужно чтобы иметь возможность проводить общую логику для всех тестов один раз

       this.sentence = new Sentence();
    }

    @Test
    public void testCountWords () {
      //  logika testirovaniya

        int countAnimalInSentence = this.sentence.countWords("cat dog cat dog");
    // проверить из метода с нажим ожидаемым значением
        Assertions.assertEquals(4,countAnimalInSentence);

        // класс assertions содержит в себе множество других методов, позволяющих сравнивать значения
    }
    @Test
    public void testCountSymbols () {

        int countAnimalSymbols = this.sentence.countSymbols("cat dog cat dog");
        Assertions.assertEquals(15,countAnimalSymbols);

    }

}
