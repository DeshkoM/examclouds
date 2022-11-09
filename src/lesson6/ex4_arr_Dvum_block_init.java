package lesson6;
/*
* Двумерный массив типа char.
* Создать двумерный массив типа char размером 4х2.
* Записать в него значения с помощью блока для инициализации. Распечатать значения массива.
* */

public class ex4_arr_Dvum_block_init {
    public static void main(String[] args) {
    char[][] arr = {        //блок инициализации двумерного массива
            {'a','a'},
            {'b','b'},
            {'c','c'},
            {'d','d'},
        };
    for (char[] chars : arr){   //массив chars  в который по одному помещаем строки(массивы) массива arr
        for (char symbol : chars){  //перебираем все елементы строки(массива) сhars
            System.out.print(symbol + " ");
        }
        System.out.println();
        }
    }
}
