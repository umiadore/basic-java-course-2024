package homework.book.model;

public class Dictionary extends Book {

    private int edition;
    private String language;


    public Dictionary(String title, String author, int year, long ISBN, int edition, String language ) {
        super(title, author, year, ISBN);
        this.edition = edition;
        this.language = language;
    }


    public int getYear1() {
        return edition;
    }

    public void setYear1(int year1) {
        this.edition = edition;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Dictionary{" +
                "edition=" + edition +
                ", authorisation='" + language + '\'' +
                '}';
    }
    @Override
    public void display() {
        System.out.println(super.toString());
        System.out.println("Dictionary{" +
                "edition=" + edition +
                ", language='" + language + '\'' +
                '}');
    }
}
