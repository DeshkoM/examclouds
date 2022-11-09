package OOP;

public class DemoReader {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Дешко М.С.","7488", "Sula", "066 672 70 26",1986);
        reader1.takeBook(5);
        reader1.takeBook("Дети капитана гранта", "Java для начинающих", "Путь самурая");
        //Создадим книги в отдельном классе
        Book book1 = new Book("А.М.Иванов", "Дети капитана гранта");
        Book book2 = new Book("J.B. Loops", "Java для начинающих");
        Book book3 = new Book("Siro Unagi", "Путь самурая");

        reader1.takeBook(book1,book2,book3);

        reader1.returnBook(3);
        reader1.returnBook("Дети капитана гранта","Путь самурая");
        reader1.returnBook(book1,book3);

    }
}
