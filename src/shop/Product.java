package shop;

//товар
public abstract class  Product{
    private String name, cost;  //название и цена
    private double rating;      //рейтинг товара

    public Product(String name, String cost, double rating) {
        this.name = name;
        this.cost = cost;
        this.rating = rating;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

}
