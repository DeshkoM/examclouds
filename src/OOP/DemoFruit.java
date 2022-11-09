package OOP;

//Создать несколько объектов разных классов.
//Подсчитать общую стоимость проданных фруктов.
//А также общую стоимость отдельно проданных яблок, груш и абрикос.
public class DemoFruit {
    private static Object Apple;

    public static void main(String[] args) {
        Apple fruit1 = new Apple(50.0, 55);
        Apple fruit2 = new Apple(100.0, 55);
        Apricot fruit3 = new Apricot(50.0, 75);
        Apricot fruit4 = new Apricot(50.0, 75);
        Pear fruit5 = new Pear(50.0, 100);
        Pear fruit6 = new Pear(75.0, 100);

        Fruit[] fruits = {fruit1, fruit2, fruit3, fruit4, fruit5, fruit6};

        double price = 0.0;
        for (Fruit fruit : fruits){
            price =  price + fruit.fruitPrice();
        }
        System.out.println("Общая стоимость фруктов = " + price);
    }

}
