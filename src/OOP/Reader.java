package OOP;

import java.util.Arrays;

// Класс описывающий читателя
public class Reader {
    private String fio, libraryСard, faculty, phone;    //фио, номер читательского, факультет и телефон
    private int dateBirth;      // дата рождения

    public Reader(String fio, String libraryСard, String faculty, String phone, int dateBirth) {
        this.fio = fio;
        this.libraryСard = libraryСard;
        this.faculty = faculty;
        this.phone = phone;
        this.dateBirth = dateBirth;
    }

    public Reader() {
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getLibraryСard() {
        return libraryСard;
    }

    public void setLibraryСard(String libraryСard) {
        this.libraryСard = libraryСard;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(int dateBirth) {
        this.dateBirth = dateBirth;
    }

    public void takeBook(int number) {
        System.out.println("Читатель " + fio + " take a " + number + " books");
    }

    public void takeBook(String... books) {
        System.out.print(fio + " взял книги: ");
        for (String book : books) {
            System.out.print(book + ", ");
        }
        System.out.println();
    }

    //takeBook, который будет принимать переменное количество объектов класса Book (создать новый класс, содержащий имя и автора книги).
    public void takeBook(Book... books) {
        System.out.print(fio + " Взял книги : ");
        for (Book book : books) {
            System.out.print(book.getNameBook() + ", ");
        }
        System.out.println();
    }

    public void returnBook(int number) {
        System.out.println("Читатель " + fio + " return " + number + " books");
    }

    public void returnBook(String... books) {
        System.out.print(fio + " вернул книги : ");
        for (String book : books) {
            System.out.print(book + ", ");
        }
        System.out.println();
    }

    public void returnBook(Book... books) {
        System.out.print(fio + " Вернул книги : ");
        for (Book book:books){
            System.out.print(book.getNameBook() + ", ");
        }
        System.out.println();
    }
}
