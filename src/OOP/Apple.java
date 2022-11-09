package OOP;

public class Apple extends Fruit{
    private double price;

    public Apple(double weight, double price) {
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
