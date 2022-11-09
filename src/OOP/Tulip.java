package OOP;

public class Tulip extends Flower {
    private String color;
    public Tulip(String producingCountry, int shelLife, double price, String color) {
        super(producingCountry, shelLife, price);
        this.color = color;
    }

    public Tulip() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
