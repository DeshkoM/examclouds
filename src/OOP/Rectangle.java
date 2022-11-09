package OOP;

public class Rectangle extends Shape{
    private String a, b, c , d ;

    public Rectangle(String color, String a, String b, String  c, String d) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public Rectangle() {
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }
    @Override
    public String draw() {
        return  "Рисуем квадрат ";
    }
}
