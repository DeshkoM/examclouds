package OOP;

//Создать абстрактный класс Фрукт и классы Яблоко, Груша, Абрикос расширяющие его.
//в) абстрактный метод, возвращающий стоимость фрукта, который должен быть переопределен в каждом классе наследнике.
// Метод должен учитывать вес фрукта.
public abstract class Fruit {
    private double weight;

    public Fruit(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void printManufacturerInfo() {
        System.out.print("Made in Ukraine");
    }

    public abstract double fruitPrice();      //абстракная функция

}
