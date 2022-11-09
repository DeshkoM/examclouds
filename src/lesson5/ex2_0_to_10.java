package lesson5;
import java.util.Scanner;
/*
Если это число от 0 до 10, вывести на консоль сообщение “Положительное число меньше 10 или ноль”,
иначе вывести сообщение “Положительное число больше 10 или отрицательное”.
*/
public class ex2_0_to_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()){
            int number = scanner.nextInt();
            choiseNumber(number);       //сгенерировали метод с помощью ctrl+alt+M
        } else System.out.println("То что вы ввели не число инт ");
    }

    private static void choiseNumber(int number) {
        if(number < 0 || number > 10){
            System.out.println("Положительное число больше 10 или отрицательное");
        } else System.out.println("Положительное число меньше 10 или ноль");
    }
}
