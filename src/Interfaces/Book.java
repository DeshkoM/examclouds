package Interfaces;

import java.util.Objects;

public class Book implements Printable {
    private String name;

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void print(){
        System.out.println("Печатаем книгу " + this.name + " с помощью интерфейса");
    }

    //Создать статический метод printBooks(Printable[] printable) в классе Book, который выводит на консоль названия только книг.
    // Используем оператор instanceof (случай).

    public static void printBooks(Printable[] printable){
        for (Printable book: printable){
            if(book instanceof Book){
                System.out.println(((Book)book).name);
            }
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

}
