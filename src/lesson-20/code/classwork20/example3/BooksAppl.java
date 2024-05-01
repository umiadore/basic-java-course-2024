package classwork20.example3;

import java.util.Scanner;

public class BooksAppl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String bookName = scanner.nextLine();

        if (Library.bookIsAvailable(bookName)) {
            System.out.println("The Book is available! Here you go");

            Books book = Library.takeBook(bookName);
            System.out.println("You are reading a book: " + book.getTitle() + " by " + book.getAuthor());

            Library.returnBook(book);
        } else  {
            System.out.println("We dont have this book");
        }
    }

}
