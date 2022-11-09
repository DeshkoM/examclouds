package lesson5;

/*
Распечатать 5 символов в одну строку начиная с ‘h’. Используем цикл for.
 */
public class ex7_for {
    public static void main (String[] args) {
        char symbol = 'h';
        for (int i = 0; i < 5; i++) {
            System.out.print(symbol + " ");
            symbol++;
        }
    }
}
