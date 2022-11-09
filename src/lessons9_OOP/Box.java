package lessons9_OOP;

public class Box {
    double height, width, depth;
    Box(){};    //пустой конструктор создаём вручную.
    Box (double height, double width, double depth){    //конструктор с аргументами
        System.out.println("Конструирование объекта");
        this.height = height;
        this.width = width;
        this.depth = depth;
    }
    public void print(){
        System.out.println("Был создада коробка высотой = " + height);
        System.out.println("Шыриной = " + width);
        System.out.println("Глубиной равной = " + depth);
    }
}
