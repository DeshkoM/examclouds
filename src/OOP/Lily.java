package OOP;

public class Lily extends Flower {
    private String color;
    public Lily(String producingCountry, int shelLife, double price, String color) {
        super(producingCountry, shelLife, price);
        this.color = color;
    }

    public Lily() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
