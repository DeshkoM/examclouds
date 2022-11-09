package Clothes;

import static Clothes.Size.*;

//Создать массив, содержащий все типы одежды. 
public class DemoClothes {
    public static void main(String[] args) {
        TShirt tShirt1 = new TShirt(L, 100, "white", "футболка");
        TShirt tShirt2 = new TShirt(M, 90, "white/black","футболка");
        Skirt skirt1 = new Skirt(S, 200, "pink", "юбка");
        Skirt skirt2 = new Skirt(XXS, 180, "pink/black","юбка");
        Pants pants1 = new Pants(M, 150, "blue","штаны");
        Pants pants2 = new Pants(S, 250, "white/blue","штаны");
        Tie tie = new Tie(M, 50, "red", "галстук");
        Clothes[] clothes = {tShirt1,tShirt2,skirt1,skirt2,pants1,pants2,tie};

        Atelier atelier = new Atelier();
        atelier.dressTheMan(clothes);
        atelier.dressTheWoman(clothes);


    }

}
