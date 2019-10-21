package operations;

import book.BookList;

public class Exit implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.exit(0);
    }
}
