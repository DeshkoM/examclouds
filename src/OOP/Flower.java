package OOP;

/**
 * Создать класс Flower, который содержит переменные страна производитель, срок хранения в днях, цена.
 * Создать классы расширяющие класс Flower (для примера, пусть это будут розы, гвоздики, тюльпаны и... что-то на свой вкус).
 * Собрать 3 букета (используем массив) с определением их стоимости. В букет может входить несколько цветов разного типа.
 * Также подсчитать количество проданных цветов (используем статическую переменную).
 */
public class Flower {
    static int count;       //статическая переменная, будем считать общее количество цветов
    private String producingCountry;       //страна производитель
    private int shelLife;       //срок хранения в днях
    private double price;       //цена

    public Flower(String producingCountry, int shelLife, double price) {
        this.producingCountry = producingCountry;
        this.shelLife = shelLife;
        this.price = price;
        count++;
    }

    public Flower() {
    }

    public String getProducingCountry() {
        return producingCountry;
    }

    public void setProducingCountry(String producingCountry) {
        this.producingCountry = producingCountry;
    }

    public int getShelLife() {
        return shelLife;
    }

    public void setShelLife(int shelLife) {
        this.shelLife = shelLife;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
