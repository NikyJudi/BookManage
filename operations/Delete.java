package operations;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class Delete implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("删除书籍");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要删除的序号: ");
        String id = scanner.next();
        // 先查找
        int i = 0;
        for (; i < bookList.getSize(); i++) {
            Book book = bookList.getBooks()[i];
            if (book.getId().equals(id)) {
                // 找到了
                break;
            }
        }
        if (i >= bookList.getSize()) {
            // 没找到
            System.out.println("未找到要删除的书籍!");
            return;
        }
        // 处理找到了的情况
        // 直接用最后一个元素覆盖当前要删除的元素
        // 再进行尾删.
        Book lastBook = bookList.getBooks()[bookList.getSize() - 1];
        bookList.setBooks(bookList, lastBook);
        bookList.setSize(bookList.getSize() - 1);
        System.out.println("删除成功!");
    }
}
