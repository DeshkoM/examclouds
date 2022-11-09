package OOP;

import static OOP.Flower.count;     //статический импорт, для того чтоб обращаться к count  без написания класса

public class DemoFlower {
    public static void main(String[] args) {
        Lily lily1 = new Lily("Ukraine", 14, 15.50, "white");
        Lily lily2 = new Lily("Ukraine", 14, 15.50, "white-blue");
        Lily lily3 = new Lily("Ukraine", 14, 15.50, "white-pink");
        Rose rose1 = new Rose("Ukraine", 40, 75.00, "dark red");
        Rose rose2 = new Rose("Ukraine", 40, 55.00, "pink");
        Rose rose3 = new Rose("Ukraine", 40, 45.00, "white");
        Tulip tulip1 = new Tulip("Holland", 15, 30.00, "red");
        Tulip tulip2 = new Tulip("Holland", 15, 25.00, "yellow");
        Tulip tulip3 = new Tulip("Holland", 15, 35.00, "blue");

        Flower[] flowers1 = {tulip1, lily1, rose3};
        Flower[] flowers2 = {tulip2, tulip3, rose2};
        Flower[] flowers3 = {lily2, lily3};

        Bouquet bouquet1 = new Bouquet((flowers1),1);
        Bouquet bouquet2 = new Bouquet((flowers2),2);
        Bouquet bouquet3 = new Bouquet((flowers3),3);

        bouquet1.bouquetPrice();
        bouquet2.bouquetPrice();
        bouquet3.bouquetPrice();

        System.out.println("Общее количество цветов = " + count);


    }
}
