package operations;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class AddOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("新增一本书：");
        System.out.println("请输入书名");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("请输入书号");
        String id = scanner.next();
        System.out.println("请输入作者");
        String author = scanner.next();
        Book book = new Book(name, id, author, false);
        bookList.setBooks(bookList, book);
        bookList.setSize(bookList.getSize() + 1);
    }
}
