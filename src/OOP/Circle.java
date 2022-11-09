package OOP;

public class Circle extends Shape{
    private String a, b ;

    public Circle(String color, String a, String b) {
        super(color);
        this.a = a;
        this.b = b;
    }

    public Circle() {
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

    @Override
    public String draw() {
        {
            return  "Рисуем круг ";
        }
    }
}
