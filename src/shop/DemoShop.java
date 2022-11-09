package shop;

import java.util.Arrays;
import java.util.Scanner;

public class DemoShop {
    public static void main(String[] args) {
        Pc pc1 = new Pc("Pentium4", "15000", 4.5);
        Pc pc2 = new Pc("Athlon", "10000", 4.0);
        Phone phone1 = new Phone("xiaomi", "4000", 4);
        Phone phone2 = new Phone("iphone", "54000", 5);
        Tv tv1 = new Tv("LG", "30 000", 4.4);
        Tv tv2 = new Tv("Samsung", "50 000", 5.0);
        //Массив всех товаров
        Product[] products = {pc1, pc2, phone1, phone2, tv1, tv2};
        //Список категорий товаров
        Category phone = new Category("Телефоны", products);

        Category pc = new Category("Компьютеры", products);

        Category tv = new Category("Телевизоры", products);

        Category[] categories = {phone, pc, tv};

        //массив купленных товаров
        Product[] purchasedGoods = {pc1,phone1,tv2};
        Basket basket = new Basket(purchasedGoods);
        //Создать объект класса User.
        User user1 = new User("deshko86", "1111", basket);
        System.out.println("Добро пожаловать в наш магазин электроники");

        //Аутентификация пользователя. Пользователь вводит логин и пароль с клавиатуры.
        Action authentification = Action.AUTHENTIFICATION;
        authentification.authentification(user1);

        //Просмотр списка каталогов товаров.
        Action categoryList = Action.CATEGORYLIST;
        categoryList.categoryList(categories);


        //Просмотр списка товаров из категории Телефоны
        Action categoryPhone = Action.PHONELIST;
        categoryPhone.productList(products);

        //Просмотр списка товаров из категории Компьютеры
        Action categoryPc = Action.PCLIST;
        categoryPc.productList(products);

        //Просмотр списка товаров из категории Телевизоры
        Action categoryTv = Action.TVLIST;
        categoryTv.productList(products);

        //Просмотр списка товаров в корзине
        Action productBasket = Action.PRODUCTBASKET;
        productBasket.productList(purchasedGoods);

    }
}
