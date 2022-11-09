package lesson3_4;

import java.util.Scanner;

public class ex_modul {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c, a2, b2, c2;
        System.out.println("Введите первое число ");
        a = scanner.nextInt();
        System.out.println("Введите второе число ");
        b = scanner.nextInt();
        System.out.println("Введите третье число ");
        c = scanner.nextInt();
        //получаем модуль
        a2 = a < 0 ? -a : a;  // тренарный оператор если a < 0  то меняем знак , иначе просто а
        b2 = b < 0 ? -b : b;
        c2 = c < 0 ? -c : c;
        System.out.println("Модуль числа " + a + " равен " + a2);
        System.out.println("Модуль числа " + b + " равен " + b2);
        System.out.println("Модуль числа " + c + " равен " + c2);
        if (a2 < b2 && a2 < c2) {
            System.out.println("Наименьшее число по модулю это число а = " + a2);
        } else if (b2 < a2 && b2 < c2) {
            System.out.println("Наименьшее число по модулю это число b = " + b2);
        } else if (a2 == b2 && a2 < c2) {
            System.out.println("Наименьшее число по модулю это числа a и b = " + a2 + " и " + b2);
        } else if (a2 == c2 && a2 < b2) {
            System.out.println("Наименьшее число по модулю это числа a и c = " + a2 + " и " + c2);
        } else if (b2 == c2 && b2 < a2) {
            System.out.println("Наименьшее число по модулю это числа b и c = " + b2 + " и " + c2);
        } else System.out.println("Наименьшее число по модулю это число c = " + c2);
    }
}
