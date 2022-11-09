package Interfaces;

public class DemoInterfaces {
    public static void main(String[] args) {
        Book book1 = new Book("Azbuka");
        Book book2 = new Book("Java book");
        Magazine magazine1 = new Magazine("SpeedInfo");
        Magazine magazine2 = new Magazine("Maxim");
        //Создать массив типа Printable, который будет содержать книги и журналы на печать.
        Printable[] printables = {book1, book2, magazine1, magazine2};
        //В цикле пройти по массиву и вызвать метод print() для каждого объекта.
        for (Printable printable:printables){
            printable.print();
        }
        //Проверим еквивалентность объектов book1 и book2 с помощью equals
        System.out.println(book1.equals(book2));
        Magazine.printMagazines(printables);
        Book.printBooks(printables);

    }
}
