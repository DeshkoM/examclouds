package lessons9_OOP;

public class DemoStudent {
    public static void main(String[] args) {
        ex5_Students student1 = new ex5_Students("Максим", "Дешко", "группа 315", 3.9);
        ex5_Aspirant aspirant1 = new ex5_Aspirant("Анна", "Дешко", "группа 525", 5, "Кандидатская работа");
        //Создать переменную типа Student, которая ссылается на объект типа Aspirant. У этой переменной не будет доступа к work
        ex5_Students aspirant2 = new ex5_Aspirant("Дарья", "Дешко", "группа 525", 4.5, "нет работ");
        //Создать массив типа Student, содержащий объекты класса Student и Aspirant.
        ex5_Students[] students = {student1, aspirant1, aspirant2};
        //Вызвать метод getScholarship() для каждого элемента массива.
        for (ex5_Students student : students) {
            System.out.print(student.getLastName() + " " + student.getFirstName() + " средняя оценка " + student.getAverageMark());
            System.out.print(" поэтому стипендия = " + student.getScholarship() + " грн ");
            System.out.println();
        }
    }
}
