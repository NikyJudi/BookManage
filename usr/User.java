package usr;

import book.BookList;
import operations.IOperation;

abstract public class User {
    String name;
    String id;
    protected IOperation[] operations;
    public User(String name, String id) {
        this.name = name;
        this.id = id;
    }
    abstract public int menu();
    public void doOperation(int choice, BookList bookList) {
        operations[choice].work(bookList);
    }
}
