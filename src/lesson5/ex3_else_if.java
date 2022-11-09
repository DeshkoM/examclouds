package lesson5;

/*
Передать на вход программы число от 1 до 7 в качестве аргумента.
Если число равно 1, выводим на консоль “Понедельник”, 2 –”Вторник” и так далее. Если 6 или 7 – “Выходной”.
Используем конструкцию if-else-if.
 */
public class ex3_else_if {
    public static void main(String[] args) {
        int day = Integer.parseInt(args[0]);
        if(day == 1){
            System.out.println("Понедельник");
        } else if (day == 2) {
            System.out.println("Вторник");
        } else if (day == 3) {
            System.out.println("Среда");
        }else if (day == 4) {
            System.out.println("Четверг");
        }else if (day == 5) {
            System.out.println("Пятница");
        }else if (day == 6) {
            System.out.println("Суббота");
        }else if (day == 7) {
            System.out.println("Воскресенье");
        }
    }
}
