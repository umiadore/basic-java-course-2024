package classwork20.library.controller;

import classwork20.library.model.Book;

public class Library {
    // начинаем и создаем все поля
    // создадим массив для книг / array for books

    private Book [] books;

    // quantity of books in the library
    private int size;

    // we created a constructor that will create an object type of library
    public Library(int capacity) {
        this.books = new Book[capacity];
        this.size= 0;
    }

    // methods
     //we need a method addBook
    private boolean addBook (Book book) {
        // необходимо в массив добавить элемент с помощью этого метода
        // контролер должен пересмотреть чтобы не добавлялись пустые книги (null), dublicates , и нельзя привышать вместимость библиотеки (длина isbn)

        if (book == null || size == books.length || findBook (book.getIsbn()) != null) {
            return false;
        }
        books[size] = book;
        size++;
        return true;
    }
// этот метод будет возвращать нам книжку
    private Book findBook(long isbn) {
        for (int i = 0; i < books.length; i++) {
           if (books[i].getIsbn() == isbn) {
               return books [i];
           }
        }
        return null;
    }
}
