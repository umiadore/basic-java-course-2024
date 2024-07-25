package homework39.programmingLanguage;

import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;


public class PLMain {
    public static void main(String[] args) {
        // 1.2 Создайте несколько языков программирования
        ProgrammingLanguage language1 = new ProgrammingLanguage("Java", "James Gosling", LocalDate.of(1995, 5, 1));
        ProgrammingLanguage language2 = new ProgrammingLanguage("Java Script ", "Brendan Eich", LocalDate.of(1995, 5, 10));
        ProgrammingLanguage language3 = new ProgrammingLanguage("Python", "Guido van Rossum", LocalDate.of(1991, 2, 20));
        ProgrammingLanguage language4 = new ProgrammingLanguage("C++", "Bjarne Stroustrup", LocalDate.of(1979, 1, 1));

        List<ProgrammingLanguage> languageList = new ArrayList<>();
        languageList.add(language1);
        languageList.add(language2);
        languageList.add(language3);
        languageList.add(language4);

        // 1.3 Найдите среди них самых старый язык, используя любой подход (стримы привествуются)





    }
}
