package Interfaces2;

public class DemoInterface2 {
    public static void main(String[] args) {
        //Создать массив типа Инструмент, содержащий инструменты разного типа.
        Guitar guitar1 = new Guitar(5);
        Guitar guitar2 = new Guitar(7);
        Drum drum1 = new Drum(10);
        Drum drum2 = new Drum(30);
        Ttrumpet trumpet1 = new Ttrumpet(35);
        Ttrumpet trumpet2 = new Ttrumpet(15);

        Instrument[] instruments = {guitar1, guitar2, drum1, drum2, trumpet1, trumpet2};
        //В цикле вызвать метод play() для каждого инструмента, который должен выводить строку "Играет такой-то инструмент,
        // с такими-то характеристиками".

        for (Instrument instrument:instruments){
            instrument.play();
        }

        //Выведем только барабаны
        for (Instrument instrument:instruments){
            if (instrument instanceof Drum){
                instrument.play();
            }
        }

        guitar1.noPlay();
    }
}
