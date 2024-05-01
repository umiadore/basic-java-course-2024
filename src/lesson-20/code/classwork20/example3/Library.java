package classwork20.example3;

public class Library {

    public static Books [] books = new Books[15];

    static  {
        books[0] = new Books(1, "1984", "George Orwell", "Dystopian", 328, 1949, true);
        books[1] = new Books(2, "To Kill a Mockingbird", "Harper Lee", "Thriller", 281, 1960, true);
        books[2] = new Books(3, "The Great Gatsby", "F. Scott Fitzgerald", "Classic", 218, 1925, false);
        books[3] = new Books(4, "Pride and Prejudice", "Jane Austen", "Romance", 279, 1813, true);
        books[4] = new Books(5, "Catcher in the Rye", "J.D. Salinger", "Literary Fiction", 234, 1951, false);
        books[5] = new Books(6, "The Hobbit", "J.R.R. Tolkien", "Fantasy", 310, 1937, true);
        books[6] = new Books(7, "The Diary of a Young Girl", "Anne Frank", "Biography", 283, 1947, true);
        books[7] = new Books(8, "1984", "George Orwell", "Dystopian", 328, 1949, true);
        books[8] = new Books(9, "Brave New World", "Aldous Huxley", "Dystopian", 311, 1932, true);
        books[9] = new Books(10, "Moby Dick", "Herman Melville", "Adventure", 635, 1851, false);
        books[10] = new Books(11, "War and Peace", "Leo Tolstoy", "Historical", 1225, 1869, true);
        books[11] = new Books(12, "Hamlet", "William Shakespeare", "Tragedy", 160, 1603, true);
        books[12] = new Books(13, "The Lord of the Rings", "J.R.R. Tolkien", "Fantasy", 1178, 1954, false);
        books[13] = new Books(14, "The Alchemist", "Paulo Coelho", "Quest", 208, 1988, true);
        books[14] = new Books(15, "The Catcher in the Rye", "J.D. Salinger", "Literary Fiction", 234, 1951, true);
    }

    public static Books takeBook (String title) { // взять книгу

        for (int i = 0; i < books.length; i++) {
            if (title.equalsIgnoreCase(books [i].getTitle()) && books[i].isAvailable()){
                books[i].setAvailable(false); // когда книгу забирают - она не доступна
            return books [i];
            }
        }
        return null;
    }
    public static boolean bookIsAvailable (String title) { // проверить доступна ли книга
        for (int i = 0; i < books.length; i++) {
            if (title.equalsIgnoreCase(books[i].getTitle()))  {
                return books[i].isAvailable();
            }
        }
        return false;
    }
    public static void returnBook (Books book)  {
        for (int i = 0; i < books.length; i++) {
            if (books.equals(books[i]))  {
                books [i].setAvailable(true);
                return;
            }
            System.out.println("This does not belong to us!");
        }
    }
}
