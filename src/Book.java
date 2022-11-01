public class Book {
    private final String bookName;
    private final Author Author;
    private int publishYear;

    public Book (String bookName, Author author, int publishYear) {
        this.bookName = bookName;
        this.Author = author;
        this.publishYear = publishYear;
    }
    public String getBookName() {
        return bookName;
    }

    public Author getAuthor() {
        return Author;
    }
    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }
}
