package OOP;

public class Rekursiya {
    static public int factorial (int n){
        //задаём точку выхода, это когда n = 1
        if (n == 1) return 1;
        //запускаем рекурсивную функцию для n = 4 пока не дойдём до 1
        //4 * factorial(3)
        //3 * factorial(2)
        //2 * factorial(1)
        //1  return 1
        //а теперь в обратной последовательности
        //2 * 1 = 2 это у нас factorial(2)
        //3 * 2 = 6 это у нас factorial(3)
        //4 * 6 = 24 это у нас factorial(4)
        return n * factorial(n-1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(4));
    }
}
