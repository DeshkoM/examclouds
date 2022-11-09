package lesson6;

import java.util.Arrays;

/*
 * Поиск максимального и минимального значения в каждой строке массива.
 * Создать двумерный массив 5х8 типа int и инициализировать его с помощью блока для инициализации.
 * Найти мак и мин значение в каждой "строке" и записать эти значения в двухмерный массив 5х2.
 * Распечатать массив, содержащий максимальное и минимальное значение.
 * */
public class ex5_arr_min_max {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 3, 5, 2, 4},
                {2, 3, 4, 5, 9},
                {3, 4, 5, 6, 7},
                {4, 5, 6, 7, 8},
                {5, 6, 7, 8, 5}
        };
        int[][] arrDst = new int[5][2];
        int max = 1, min = 1;
        for (int[] row : arr) {
            Arrays.sort(row);   //сортируем строку, чтобы потом можно было найти ячейку по её содержимому
            max = row[0];
            min = row[0];
            for (int elem : row) {    //находим максимальное число в строке
                if (elem > max) {
                    max = elem;
                } else min = elem;
            }
            int numMax = Arrays.binarySearch(row, max);  //находим номер ячейки максимального числа , будет 4-я
            int numMin = Arrays.binarySearch(row, min);

            labelMax:
            //Ставим метку.
            for (int[] rowD : arrDst) {
                for (int elemD : rowD) {
                    if (rowD[0] == 0) {       //если 0й элемент строки(массива) rowD = 0 то мы в него копируем, иначе берём следующую строку(массив)
                        System.arraycopy(row, numMax, rowD, 0, 1);  //из строки row 4-я ячейка в строку rowD  в 0ю  ячейку
                        System.out.print(rowD[0] + " ");
                        break labelMax;
                    }
                }
            }
            labelMin:
            for (int[] rowC:arrDst){
                for (int elemC:rowC){
                    if (rowC[1] == 0) {
                        System.arraycopy(row, numMin, rowC, 1, 1);
                        System.out.print(rowC[1] + " ");
                        break labelMin;
                    }
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println(Arrays.deepToString(arrDst));
    }
}
