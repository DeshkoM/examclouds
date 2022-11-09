package OOP;

public class Box {
    double width, height, depth;

    //добавим конструктор с параметрами
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    //добавим конструктор по умолчанию
    Box() {
    }

    /**
     * Подсчитать объем коробки
     *
     * @return Объем
     */

    double get_volume() {
        double result = width * height * depth;
        return result;
    }
}

