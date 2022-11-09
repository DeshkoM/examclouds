package OOP;

public class Pear extends Fruit{
    private double price;

    public Pear(double weight, double price) {
        super(weight);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double fruitPrice(){
        return price * getWeight();
    }
}
