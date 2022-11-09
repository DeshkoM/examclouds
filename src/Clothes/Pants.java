package Clothes;
//Создать классы наследники Одежды - Штаны (реализует интерфейсы "Мужская Одежда" и "Женская Одежда"),
public class Pants extends Clothes implements MensClothing, WomensClothing {
    public Pants (Size size, double price, String color, String name) {
        super(size, price, color,name);
    }


    @Override
    public void dressTheMan() {

    }

    @Override
    public void dressTheWoman() {

    }
}
