package lesson2;

import java.util.Scanner;

public class MetodSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число А ");
        int a = 0;
        int b = 0;
        if (scanner.hasNextInt()) {
            a = scanner.nextInt();
        } else System.out.println("Вы не ввели число А");
        System.out.println("Введите число Б ");
        if (scanner.hasNextInt()&& a != 0) {
            b = scanner.nextInt();
        } else System.out.println("Вы не ввели число Б");
        int sum = a+b;
        System.out.println("Сумма двух чисел равна " + sum);
    }
}
