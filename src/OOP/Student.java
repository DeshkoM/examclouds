package OOP;

//Класс Student содержит переменные: String firstName, lastName, group.А также, double averageMark, содержащую среднюю оценку.
public class Student {
    private String firstName, lastName, group, login, password;
    private double avgMark;

    Student(String firstName, String lastName, String group, double avgMark, String login, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.avgMark = avgMark;
        this.login = login;
        this.password = password;
    }

    Student() {

    }

    public String getLogin() {
        return this.login;
    }

    public String getPassword() {
        return this.password.charAt(0) + "*******";
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getAvgMark() {
        return avgMark;
    }

    public void setAvgMark(double avgMark) {
        this.avgMark = avgMark;
    }


    public void getScholarship() {
        System.out.print(firstName + " " + lastName);
        System.out.println();
        if (avgMark == 5.0) {
            System.out.println("Ваш средний бал = 5.0, " + " cумма стипендии равна = 100");
        }
        if (avgMark < 5.0) {
            System.out.println("Ваш средний бал ниже 5.0 и равен " + avgMark + ", cумма стипендии равна = 80");
        }
    }
}
