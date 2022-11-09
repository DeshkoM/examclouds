package Clothes;
//Создать классы наследники Одежды - Галстук (реализует интерфейс "Мужская Одежда"),
public class Tie extends Clothes implements MensClothing{
    public Tie (Size size, double price, String color, String name) {
        super(size, price, color,name);
    }

    @Override
    public void dressTheMan(){

    }
}
