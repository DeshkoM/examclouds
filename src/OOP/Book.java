package OOP;

public class Book {
    private String nameAuthor, nameBook;

    public Book(String nameAuthor, String nameBook) {
        this.nameAuthor = nameAuthor;
        this.nameBook = nameBook;
    }

    public Book() {
    }

    public String getNameAuthor() {
        return this.nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

}
