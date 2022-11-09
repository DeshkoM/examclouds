package lesson5;
/*
распечатать все элементы массива с помощью цикла foreach
*/
public class foreach {
    public static void main(String[] args) {
        String[] arr = {"a","b","c","d"};
        for(String s : arr){
            System.out.print(s + " ");
        }
    }
}
