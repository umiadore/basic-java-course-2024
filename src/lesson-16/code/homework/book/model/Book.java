package homework.book.model;

public class Book {
    private String title;
    private String author;
    private int year;
    private   long ISBN;

    public Book(String title, String author, int year, long ISBN) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.ISBN = ISBN;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public long getISBN() {
        return ISBN;
    }

    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", ISBN=" + ISBN +
                '}';
    }

    public void display () {
        System.out.println(
                "Book{" +
                        "title='" + title + '\'' +
                        ", author='" + author + '\'' +
                        ", year=" + year +
                        ", ISBN=" + ISBN +
                        '}');
    }
}
