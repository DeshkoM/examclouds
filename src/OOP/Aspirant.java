package OOP;

public class Aspirant extends Student {
    String work;

    Aspirant(String firstName, String lastName, String group, double avgMark, String login, String password, String work) {
        super(firstName, lastName, group, avgMark,login, password);
        this.work = work;
    }
    // Переопределяем метод getScholarship() из класса Student
    @Override
    public void getScholarship(){
        System.out.print(getFirstName() + " " + getLastName());
        System.out.println();
        if (getAvgMark() == 5.0) {
            System.out.println("Ваш средний бал = 5.0, " + " cумма стипендии равна = 200");
        }
        if (getAvgMark() < 5.0) {
            System.out.println("Ваш средний бал ниже 5.0 и равен " + getAvgMark() + ", cумма стипендии равна = 180");
        }
    }
}
