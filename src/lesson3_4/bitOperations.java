package lesson3_4;
/*
* Побитовые операции
*/
public class bitOperations {
    public static void main(String[] args) {
        int a = 3;
        int b = 6;
        int c = a | b;  //or , если 0 и 0 то 0 иначе 1
        int d = a & b;  //and , если 1 и 1 то 1, иначе 0
        int e = a ^ b;  //xor , если 1 и 1 или 0 и 0 то 0
        int f = ~b;     //не б

        System.out.println("a = " + Integer.toBinaryString(a));
        System.out.println("b = " + Integer.toBinaryString(b));
        System.out.println("c = " + Integer.toBinaryString(c));
        System.out.println("d = " + Integer.toBinaryString(d));
        System.out.println("e = " + Integer.toBinaryString(e));
        System.out.println("f = " + Integer.toBinaryString(f));
    }
}
