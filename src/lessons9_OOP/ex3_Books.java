package lessons9_OOP;

public class ex3_Books {
    private String nameBook, authorBook;

    public ex3_Books(String nameBook, String authorBook) {
        this.nameBook = nameBook;
        this.authorBook = authorBook;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getAuthorBook() {
        return authorBook;
    }

    public void setAuthorBook(String authorBook) {
        this.authorBook = authorBook;
    }

    public String getInfo() {
        return "{" +
                "name='" + nameBook + '\'' +
                ", author='" + authorBook + '\'' +
                '}';
    }

}
