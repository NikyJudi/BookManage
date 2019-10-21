package book;

import java.util.Arrays;

public class BookList {
    private Book[] books = new Book[100];
    private int size ;

    public BookList() {
        books[0] = new Book("书名1", "001", "作者1", false);
        size = 1;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(BookList bookList, Book book) {
        books[size] = book;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "BookList{" +
                "books=" + Arrays.toString(books) +
                ", size=" + size +
                '}';
    }
}
