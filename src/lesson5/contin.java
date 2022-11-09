package lesson5;
/*
выводим только нечётные числа
с помощью оператора continue мы перепрыгиваем четные числа
также можно использовать с метками как и break
 */
public class contin {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
