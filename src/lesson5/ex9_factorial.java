package lesson5;

/*
 * Реализовать подсчет факториала используя цикл for.
 * */
public class ex9_factorial {
    public static void main(String[] args) {
        double n = Math.random() * 5;
        int result = 1;
        n = (int) n;
        System.out.println(n);
        for (int i = 1; i <= n; i++) {
            result = result * i;
            System.out.print(i + "*");
        }
        System.out.println(" = " + result);
    }
}
