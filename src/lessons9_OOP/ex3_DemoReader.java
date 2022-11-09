package lessons9_OOP;

public class ex3_DemoReader {
    public static void main(String[] args) {
        ex3_Reader maxDeshko = new ex3_Reader("Дешко М. C. ", "СУЛА", "11.08.1986", "0666727026", 111111);
        ex3_Reader annDeshko = new ex3_Reader("Дешко А. М. ", "УЛА", "28.11.2018", "0667777777", 222222);
        ex3_Reader dashaDeshko = new ex3_Reader("Дешко Д. И. ", "ИСИ", "11.08.1986", "063256489", 333333);
        ex3_Books book1 = new ex3_Books("Приключения", "Агата Кристи");
        ex3_Books book2 = new ex3_Books("Букварь", "Народ");
        ex3_Books book3 = new ex3_Books("Java для новичков", "Умный дядька");
        ex3_Books[] books = {book1,book2, book3};
        ex3_Reader[] readers = {maxDeshko,annDeshko,dashaDeshko};
        printBooks(books);
        printReaders(readers);
        maxDeshko.takeBook(3);
        maxDeshko.takeBook("Приключения", "Букварь", "Java для новичков");
        maxDeshko.takeBook(book1,book2);
        annDeshko.returnBook(4);
        annDeshko.returnBook("Колобок","Феи");
        annDeshko.returnBook(book1,book3);


    }

    public static void printBooks (ex3_Books[] books){
        System.out.println("Список книг ");
        for (ex3_Books book :books){
            System.out.println(book.getInfo());
        }
   }

   public static void printReaders(ex3_Reader[] readers){
       System.out.println("Список читателей ");
       for (ex3_Reader reader :readers){
           System.out.println(reader.getInfo());
       }
   }

}
