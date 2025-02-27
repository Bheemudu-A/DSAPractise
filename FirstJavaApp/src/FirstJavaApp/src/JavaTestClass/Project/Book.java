package FirstJavaApp.src.JavaTestClass.Project;

public class Book {
    private String bookId;

    public Book(String bookId) {
        this.bookId = bookId;
    }

    public String getBookId() {
        return bookId;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return bookId.equals(book.bookId);
    }

    @Override
    public int hashCode() {
        return bookId.hashCode();
    }
}
