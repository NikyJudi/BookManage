package operations;

import book.BookList;

public class Display implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("打印所有书籍信息");
        for (int i = 0; i < bookList.getSize(); i++) {
            System.out.println(bookList.getBooks()[i]);
        }
        System.out.println("共计 " + bookList.getSize() + " 本书!");
    }
}
