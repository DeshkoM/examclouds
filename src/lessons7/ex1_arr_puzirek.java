package lessons7;
/*
 * Рассмотрим программу сортировки массива пузырьком на Java.
 * меньший элемент поднимается вверх или как в данном примере на лево в начало массива
 * */

import java.util.Arrays;

public class ex1_arr_puzirek {
    public static void main(String[] args) {
        int[] arr = {0, 2, 5, 3, 4};
        sortBubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sortBubble(int[] arr) {
        System.out.println("i" + " " + "j" + " Значение массива" + " if" );
        for (int i = 0; i < arr.length - 1; i++) {     //перебор массива, всегда -1 раз от длинны массива
            for (int j = arr.length - 1; j > i; j--) {   //j уменьшаем пока оно не станет меньше i
                if (arr[j] < arr[j - 1]) {
                    System.out.println(i + " " + j + " " + Arrays.toString(arr) + " +");
                }   else System.out.println(i + " " + j + " " + Arrays.toString(arr) + " - ");
                if (arr[j] < arr[j - 1]) {      //если последний элемент меньше предпоследнего
                    int tmp = arr[j];       //то меняем их местами
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                }
            }
        }
    }
}
