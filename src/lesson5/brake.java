package lesson5;
/*
*Досрочно выходим из второго цикла for  с помошью оператора brake
* или можно выйти сразу к метке(называть метку можем как хотим)
*/
public class brake {
    public static void main(String[] args) {
        metka:      //метка для brake
        for (int i = 0; i < 3; i++) {
            System.out.print("Проход " + i + ": ");
            for (int j = 0; j < 100; j++) {
                if (j == 10) {
                    break metka;   //завершаем цыкл и идём к метке
                }
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
