package Enum1;
//Создать перечисление, содержащее названия времен года.
//Перечисление должно содержать переменную, содержащую среднюю температуру в каждом времени года.
// Добавить конструктор принимающий на вход среднюю температуру.
public enum Seasons {
    //Переопределить метод getDescription - для константы Лето метод должен возвращать “Теплое время года”.
    SUMMER(35){
        @Override
        public String getDescription() {
            return "Тёплое время года ";
        }
    },
    AUTUMN(10), WINTER(-15), SPRING(10);
    private int temper;

    Seasons (int temper){
        this.temper = temper;
    }

    public int getTemper() {
        return temper;
    }
    //Создать метод getDescription, возвращающий строку “Холодное время года”.
    public String getDescription (){
        return  "Холодное время года ";
    }
}
