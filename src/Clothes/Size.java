package Clothes;
//Создать перечисление, содержащее размеры одежды (XXS, XS, S, M, L). Перечисление содержит метод getDescription,
// возвращающий строку "Взрослый размер". Переопределить метод getDescription - для константы XXS метод должен
// возвращать строку “Детский размер”.  Также перечисление должно содержать числовое значение euroSize(32, 34, 36, 38, 40),
// соответствующее каждому размеру. Создать конструктор, принимающий на вход euroSize.
public enum Size {
    XXS(32){
        @Override
        public String getDescription(){
            return "Детский размер";
        }
    },
    XS(34), S(36), M(38), L(40);
    private int euroSize;

    Size (int euroSize){
        this.euroSize = euroSize;
    }

    public int getEuroSize() {
        return euroSize;
    }

    public String getDescription(){
        return "Взрослый размер";
    }
}
