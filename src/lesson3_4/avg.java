package lesson3_4;

public class avg {
    public static void main(String[] args) {
        avg aaa = new avg();
        double avg = aaa.avgA(-9,0,7);
        System.out.println("среднее значение равно = " + avg);
    }
    public double avgA (int a, int b, int c){
        double avg =(double) (a+b+c)/3;
        return avg;
    }
}