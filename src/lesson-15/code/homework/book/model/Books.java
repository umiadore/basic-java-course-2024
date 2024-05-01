package homework.book.model;

public class Books {
    private long ISBN;
    private String title;
    private String author;
    private int yearOfPublishing;

    public Books(long ISBN, String title, String author, int yearOfPublishing) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
    }

    public long getISBN() {
        return ISBN;
    }

    public void setISBN(long ISBN) {
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

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    @Override
    public String toString() {
        return "Books{" +
                "ISBN=" + ISBN +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearOfPublishing=" + yearOfPublishing +
                '}';
    }
    public void display () {
        System.out.println("The info about the book: " + ISBN + "," + title + "," + author + "," + yearOfPublishing + ".");
    }
}
