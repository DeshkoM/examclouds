package lesson3_4;

/*
Чётное не чётное, аргументы передаём в конфигураторе
* */
public class IsEven {
    public static void main(String[] args) {
        System.out.println("Вы ввели число " + args[0]);
        int a = Integer.parseInt(args[0]);  //конвертируем в инт наше число которое сейчас стринг
        if (a == 0) {
            System.out.println("вы ввели 0");
        } else if (a % 2 == 0) {
            System.out.println(a + " у нас чётное");
        } else System.out.println(a + " у нас не чётное");
    }
}
