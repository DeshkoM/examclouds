package OOP;

public class Bouquet {
    private int number;
    private Flower[] bouquet;

    public Bouquet(Flower[] bouquet, int number) {
        this.bouquet = bouquet;
        this.number = number;
    }

    public Flower[] getBouquet() {
        return bouquet;
    }

    public void setBouquet(Flower[] bouquet) {
        this.bouquet = bouquet;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void bouquetPrice (){
        double price = 0.0;
        for (Flower flower:bouquet){
            price = price + flower.getPrice();
        }
        System.out.println(number + " й букет стоит " + price + " grn");
    }

}
