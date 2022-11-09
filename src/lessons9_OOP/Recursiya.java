package lessons9_OOP;

public class Recursiya {

    public static int factorial(int n){
        int result;
        if (n < 2){
            return 1;
        }
        result = factorial(n-1)*n;
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Факториал 3 = " + factorial(3));
    }
}
