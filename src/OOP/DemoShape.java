package OOP;

public class DemoShape {
    public static void main (String[] args){
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("black", "5", "6");
        shapes[1] = new Circle("blue", "5", "7");
        shapes[2] = new Rectangle("yellow", "5", "7","10", "12");

        for (Shape shape:shapes){
            System.out.println(shape.draw() + " а цвет у него " + shape.getColor()  );

        }
    }
}
