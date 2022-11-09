package shop;
//Корзина купленных товаров ,  содержащяя массив купленных товаров.
public class Basket {
    private Product[] basket;      //массив купленных товаров

    public Basket(Product[] basket) {
        this.basket = basket;
    }

    public Basket() {
    }

    public Product[] getBasket() {
        return basket;
    }

    public void setBasket(Product[] basket) {
        this.basket = basket;
    }


}
