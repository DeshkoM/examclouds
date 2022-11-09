package Clothes;
//Создать абстрактный класс Одежда, содержащий переменные - размер одежды, стоимость, цвет.
public abstract class Clothes {
    private String name;
    private Size size;
    private double price;
    private String color;

    public Clothes(Size size, double price, String color, String name) {
        this.size = size;
        this.price = price;
        this.color = color;
        this.name = name;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
