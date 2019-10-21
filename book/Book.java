package book;

public class Book {
    private String name;
    private String id;
    private String author;
    private Boolean isBorrowed;

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public Boolean getIsBorrowed() {
        return isBorrowed;
    }

    public void setIsBorrowed(Boolean isborrowed) {
        isBorrowed = isborrowed;
    }

    public Book(String name, String id, String author, Boolean isBorrowed) {
        this.name = name;
        this.id = id;
        this.author = author;
        this.isBorrowed = isBorrowed;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", author='" + author + '\'' +
                ", isBorrowed=" + isBorrowed +
                '}';
    }
}
