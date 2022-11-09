package lesson5;

/*
Распечатать все числа от 1 до 100, которые делятся на 5 без остатка. Используем цикл do-while.
*/
public class ex6_do_while {
    public static void main(String[] args) {
        int a = 1;
        do {
            if (a % 5 == 0) {
                System.out.println(a);
            }
            a++;
        } while (a <= 100);

    }
}
