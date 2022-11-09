package Clothes;
//Создать классы наследники Одежды - Юбка (реализует интерфейс "Женская Одежда"),
public class Skirt extends Clothes implements WomensClothing{

    public Skirt (Size size, double price, String color, String name) {
        super(size, price, color,name);
    }

    @Override
    public void dressTheWoman() {

    }
}
