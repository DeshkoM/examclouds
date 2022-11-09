package Interfaces2;
//Интерфейс Инструмент содержит метод play() и переменную String KEY ="До мажор".
public interface Instrument {
    String KEY = "До мажор";
    void play();
    //метод по умолчанию, Классы, реализующие интерфейсы, не обязаны переопределять такие методы, но могут если надо
    default void noPlay(){
        System.out.println("никто не играет");
    }
}
