package classwork20.library.model;

import java.util.Objects;

public class Book {

    public static final int ISBN_LENGHT = 13; // мы написали константу, она всегда пишется с большой буквы; final - этот модификатор = ограничение изменения, значение константы (13) изменить нельзя

    private String title;
    private String author;
    private int yearOfPublishing;
    private long isbn;

    public Book(String title, String author, int yearOfPublishing, long isbn) {
        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
        this.isbn = checkIsbn(isbn);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public long getIsbn() {
        return isbn;
    }
    // метод
    private long checkIsbn(long isbn) {
        if (countDigits (isbn) == ISBN_LENGHT) {
            return isbn; // если он пройдет проверку, то он вернет isbn
        }
        return -1; // если не пройдет проверку, то вернет -1
    }
// снизу метод от countDigits
    private int countDigits(long isbn) {
        int count = 0;
        do  {
            count++;

           isbn =  isbn /10;
        } while (isbn != 0);

        return count; // count и есть нужный результат
    }

    @Override
    public String toString() {
        return "Book" +
                "title='" + title +
                ", author='" + author +
                ", yearOfPublishing=" + yearOfPublishing +
                ", isbn=" + isbn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return isbn == book.isbn;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }
}
