package lesson6;

/*
*Двумерный массив типа String.
* Создать массив типа String размером 3х6.И записать в него значения:
a1  a2  a3  a4  a5  a6
b1  b2  b3  b4  b5  b6
c1  c2   c3  c4  c5  c6
* Распечатать массив.
 * */
public class ex3_arrDvumern {
    public static void main(String[] args) {
        String[][] arr = new String[3][6];  //создаём массив с 3 строками и 6 столбцами , пустой пока
        char symbol = 'a';
        //блок заполнения нашего двумерного массива
        for (int i = 0; i < arr.length; i++) {      //arr.length длинна массива, здесь первого = 3 строки
            for (int j = 0; j < arr[0].length; j++) {//arr[0].length длинна массива, второго = 6 столбов
                // 0й строки массива
                arr[i][j] = symbol + "" + (j + 1) + " ";
                System.out.print(arr[i][j]);
            }
            System.out.println(); //каждый ряд массива с новой строчки
            symbol++;   //со следующей строчки добавляем уже следующий символ, b, потом c и т.д.
        }
    }
}
