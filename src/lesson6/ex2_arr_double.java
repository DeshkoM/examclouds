package lesson6;
/*
* Одномерный массив типа double. Вторая форма создания.
* Создать массив типа double с размером 4.Записать в него любые значения с помощью блока для инициализации.
* Вывести на консоль значение первого элемента.
* */
public class ex2_arr_double {
    public static void main(String[] args) {
        double[] arr = {1.4,2.4,5.3,6.5};   //создание массива с помощью блока инициализации, размер
        //массива равен кол-ву элементов
        System.out.println(arr[0]);
        System.out.println(arr.length);
    }
}
