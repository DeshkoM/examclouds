package OOP;

//Даны два целых числа A и В. Выведите все числа от A до B включительно, в порядке возрастания, если A < B,
// или в порядке убывания в противном случае. Использовать рекурсию.
public class Rekursiya2 {
    public static void main(String[] args) {
        rekursiya(6, 1);
    }

    public static int rekursiya(int a, int b) {
        if (a < b) {
            if (a > b) return b;

            System.out.print(a + " ");
            return rekursiya(a + 1, b);
        }
        if (a > b) {
            if (a < b) return a;
            System.out.print(a + " ");
            return rekursiya(a - 1, b);
        }
        System.out.println(b);
        return b;
    }
}
