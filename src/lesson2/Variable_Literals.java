package lesson2;

public class Variable_Literals {
    public static void main(String[] args) {
        boolean a = true;
        byte b = 124;
        short c = 1234;
        int d = 123456;
        long e = 1234L;
        float f = 3.5F;
        double g = 3.5;
        char ch = 'c';

        System.out.println("Логический литерал " + true); //ctrl+D скопировать строчку
        System.out.println("Целочисленный десятичный литерал " + b);
        System.out.println("шестнацетиричный литерал " + 0x43F);
        System.out.println("двоичный литерал " + 0b10000000);
        System.out.println("Символьный литерал " + ch);
        System.out.println("Дробный литерал " + g);

    }
}
