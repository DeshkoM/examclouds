package Clothes;

//Создать класс Ателье, содержащий методы одетьЖенщину,
// одетьМужчину, на вход которых будет поступать массив, содержащий все типы одежды. Метод одетьЖенщину
// выводит на консоль всю информацию о женской одежде. То же самое для метода одетьМужчину.
public class Atelier {

    public void dressTheMan(Clothes[] clothes) {
        System.out.println("Для мужчин есть в наличии: ");
        for (Clothes clothes1 : clothes) {
            if (clothes1 instanceof MensClothing) {
                System.out.println(clothes1.getName() + " " +
                        clothes1.getColor() + " " +
                        clothes1.getSize() + " " +
                        " по цене " + clothes1.getPrice());
            }
        }
    }

    ;

    public void dressTheWoman(Clothes[] clothes) {
        System.out.println("Для женщин есть в наличии: ");
        for (Clothes clothes1 : clothes) {
            if (clothes1 instanceof WomensClothing) {
                System.out.println(clothes1.getName() + " " +
                        clothes1.getColor() + " " +
                        clothes1.getSize() + " " +
                        " по цене " + clothes1.getPrice());
            }
        }
    }

    ;
}
