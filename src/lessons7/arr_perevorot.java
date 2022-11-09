package lessons7;

import java.util.Arrays;

/*
* Существует массив {1, 2, 3, 4,5,6} и его надо развернуть (или инвертировать)
и получить массив {6,5,4, 3, 2, 1}.
 */
public class arr_perevorot {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        inverse(array);
    }

    private static void inverse(int[] arr) {
        for (int i = 0; i < arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
