package OOP;

public class Demo_Box {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box(2,3,4);
        ColorBox colorBox1 = new ColorBox(10,10,10,"Yellow");
        HeavyBox heavyBox1 = new HeavyBox(6,6,10,250);

        System.out.println("Объем коробки = " + box1.get_volume());
        System.out.println("Объем коробки = " + box2.get_volume());
        System.out.println("Создана цветная коробка с цветом  "
                + colorBox1.color + " и объёмом " + colorBox1.get_volume());
        System.out.println("Создана тяжелая коробка и её вес =   "
                + heavyBox1.weight + " кг " + " и объёмом " + heavyBox1.get_volume());
    }
}
