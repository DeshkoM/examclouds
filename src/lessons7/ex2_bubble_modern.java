package lessons7;

import java.util.Arrays;

/*
* Изменить программу сортировки пузырьком:
программа написана таким образом, что минимальный элемент "всплывает" в начало массива.
* Измените программу так, чтобы минимальный элемент "всплывал" в конец массива (внутренний цикл for
* должен перебирать элементы не с конца, а с начала).
* */
public class ex2_bubble_modern {
    public static void main(String[] args) {
        int[] arr = {0, 2, 5, 3, 4};
        label:
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    System.out.println(i + " " + j + " " + Arrays.toString(arr) + " + ");
                } else System.out.println(i + " " + j + " " + Arrays.toString(arr) + " - ");

                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
    }
}
