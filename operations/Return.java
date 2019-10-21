package operations;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class Return implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("归还书籍");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要归还的书的编号: ");
        String id = scanner.next();
        for (int i = 0; i < bookList.getSize(); i++) {
            Book book = bookList.getBooks()[i];
            if (!book.getId().equals(id)) {
                continue;
            }
            // 执行具体的还书操作
            if (!book.getIsBorrowed()) {
                System.out.println("这本书已经被归还了!");
                break;
            }
            book.setIsBorrowed(false);
        }
    }
}
