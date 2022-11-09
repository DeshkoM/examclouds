package lesson6;
/*
 * Класс Arrays  и его методы, помогающие в роботе с массивами
 * */

import java.lang.reflect.Array;
import java.util.Arrays;

public class classArray_metods {
    public static void main(String[] args) {
        int[] arr1 = {4, 5, 3, 6, 7, 8};
        int[][] arr2 = {
                {3, 4, 5},
                {5, 6, 7},
                {3, 4, 5}
        };

        System.out.println(Arrays.toString(arr1));  //Arrays.toString() возвращает одномерный массив
        System.out.println(Arrays.deepToString(arr2));  //возвращает многомерный массив
        Arrays.sort(arr1);      //сортируем массив arr1  по возрастанию
        System.out.println(Arrays.toString(arr1));
        //Метод Arrays.binarySearch();
        //получаем порядковый номер ячейки где хранится 8, работает только с отсортированными массивами
        int pos8 = Arrays.binarySearch(arr1, 8);
        System.out.println(pos8);   //8 находится в ячейке №5, считаем с 0
        //если попытаемся найти где хранится число которого нет в массиве, например 9
        int pos9 = Arrays.binarySearch(arr1, 9);
        System.out.println(pos9);   //получим -7, минус значит что такого числа нет в массиве, а 7-1 = 6
        // это позиция этого числа если бы оно было бы в массиве
        //Метод System.arraycopy();
        //копируем с 0го элемента arrSrc в arrDst начиная с 2го элемета, всего 3 числа, 1,2,3
        int[] arrSrc = {1,2,3,4,5};
        int[] arrDst = {0,0,0,0,0,0,0,0,0};
        System.arraycopy(arrSrc,0,arrDst,2,3);
        System.out.println(Arrays.toString(arrDst));
        //можно копировать часть одного массива в самого себя
    }
}