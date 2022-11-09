package OOP;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circle2 {

    private int radius;

    public Circle2(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void calculateArea() {
        double area = PI * pow(radius, 2);
        System.out.println("Площадь данного круга = " + area);
    }

    public void calculateLong() {
        double area = 2 * PI * radius;
        System.out.println("Длинна данного круга = " + area);
    }


}
