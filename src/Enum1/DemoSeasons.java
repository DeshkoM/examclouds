package Enum1;

import java.util.Arrays;

public class DemoSeasons {
    public static void main(String[] args) {
        //Создать переменную содержащую ваше любимое время года и распечатать всю информацию о нем.
        Seasons summer = Seasons.SUMMER;
        System.out.println(summer);
        //создаём массив из значений Пеечисления Seasons
        Seasons[] seasons = Seasons.values();
        System.out.println(Arrays.toString(seasons));
        //Создать метод, который принимает на вход переменную созданного вами enum типа. Если значение равно Лето, выводим на консоль
        // “Я люблю лето” и так далее. Используем оператор switch.
        iLike(seasons);
        //В цикле распечатать все времена года, среднюю температуру и описание времени года.
        for (Seasons season1 : seasons)
            System.out.println(season1 + " " + season1.getTemper() + " " + season1.getDescription());

    }

    public static void iLike(Seasons[] seasons) {
        for (Seasons season : seasons) {
            switch (season) {
                case SUMMER:
                    System.out.println("Я люблю " + season);
                    break;
                case AUTUMN:
                    System.out.println("Я люблю " + season);
                    break;
                case WINTER:
                    System.out.println("Я люблю " + season);
                    break;
                case SPRING:
                    System.out.println("Я люблю " + season);
                    break;
            }
        }

    }
}