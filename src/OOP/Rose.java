package OOP;

public class Rose extends Flower {
    private String color;
    public Rose(String producingCountry, int shelLife, double price, String color) {
        super(producingCountry, shelLife, price);
        this.color = color;
    }

    public Rose() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
