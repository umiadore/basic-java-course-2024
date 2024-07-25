package homework39.programmingLanguage;

import java.time.LocalDate;
import java.util.Objects;

/*
1. Создайте класс "Язык программирования"
1.1 Добавьте поля: название языка, автор языка (или компания), дата первой версии языка
1.2 Создайте несколько языков программирования
1.3 Найдите среди них самых старый язык, используя любой подход (стримы привествуются)
 */
public class ProgrammingLanguage {
    private String name;
    private String founder;
    private LocalDate date;

    public ProgrammingLanguage(String name, String founder, LocalDate date) {
        this.name = name;
        this.founder = founder;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFounder() {
        return founder;
    }

    public void setFounder(String founder) {
        this.founder = founder;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "ProgrammingLanguage{" +
                "name='" + name + '\'' +
                ", founder='" + founder + '\'' +
                ", date=" + date +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProgrammingLanguage that)) return false;
        return Objects.equals(name, that.name) && Objects.equals(founder, that.founder) && Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, founder, date);
    }
}
