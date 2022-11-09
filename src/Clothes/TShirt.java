package Clothes;
//Создать классы наследники Одежды - Футболка (реализует интерфейсы "Мужская Одежда" и "Женская Одежда"),
public class TShirt extends Clothes implements MensClothing,WomensClothing{

    public TShirt(Size size, double price, String color, String name) {
        super(size, price, color,name);
    }


    @Override
    public void dressTheMan() {

    }

    @Override
    public void dressTheWoman() {

    }
}
