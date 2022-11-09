package lessons9_OOP;

/**
 * Определить класс Reader, хранящий такую информацию о пользователе библиотеки:
 * ФИО,номер читательского билета,факультет,дата рождения,телефон.
 * Методы takeBook(), returnBook().
 * Разработать программу, в которой создается массив объектов данного класса.
 * Перегрузить методы takeBook(), returnBook():
 * - takeBook, который будет принимать количество взятых книг. Выводит на консоль сообщение "Петров В. В. взял 3 книги".
 * - takeBook, который будет принимать переменное количество названий книг. Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
 * - takeBook, который будет принимать переменное количество объектов класса Book (создать новый класс, содержащий имя и автора книги). Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
 * Аналогичным образом перегрузить метод returnBook(). Выводит на консоль сообщение "Петров В. В. вернул книги: Приключения, Словарь, Энциклопедия". Или  "Петров В. В. вернул 3 книги".
 */
public class ex3_Reader {
    String fio, facultet, dateOfBirth, phone;
    int numRT;

    // конструкторы

    public ex3_Reader(String fio, String facultet, String dateOfBirth, String phone, int numRT) {
        this.fio = fio;
        this.facultet = facultet;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.numRT = numRT;
    }

    public ex3_Reader() {
    }

    //геттеры и сеттеры
    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getFacultet() {
        return facultet;
    }

    public void setFacultet(String facultet) {
        this.facultet = facultet;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getNumRT() {
        return numRT;
    }

    public void setNumRT(int numRT) {
        this.numRT = numRT;
    }

    // рабочие методы
    //takeBook, который будет принимать количество взятых книг. Выводит на консоль сообщение "Петров В. В. взял 3 книги".
    public void takeBook(int countBooks) {
        System.out.println(fio + " взял " + countBooks + " книги");
    }

    //takeBook, который будет принимать переменное количество названий книг. Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
    public void takeBook(String... nameBooks) {
        System.out.print(fio + " взял книги ");
        for (String s : nameBooks) {
            System.out.print(" " + s + ",");
        }
        System.out.println();
    }

    //takeBook, который будет принимать переменное количество объектов класса Book (создать новый класс, содержащий имя и автора книги).
//Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
    public void takeBook(ex3_Books... books) {
        System.out.print(fio + " взял книги ");
        for (ex3_Books book : books) {
            System.out.print(" " + book.getNameBook() + ",");
        }
        System.out.println();
    }

    public void returnBook(int countBooks) {
        System.out.println(fio + " вернул " + countBooks + " книги");
    }

    public void returnBook(String... nameBooks) {
        System.out.print(fio + " вернул книги ");
        for (String s : nameBooks) {
            System.out.print(" " + s + ",");
        }
        System.out.println();
    }

    public void returnBook (ex3_Books... books){
        System.out.print(fio + " вернул книги ");
        for (ex3_Books book :books){
            System.out.println(" " + book.getNameBook() + " ");
        }
    }
    public String getInfo() {
        return "{" +
                "name='" + fio + '\'' +
                ", numBileta='" + numRT + '\'' +
                '}';
    }

}
