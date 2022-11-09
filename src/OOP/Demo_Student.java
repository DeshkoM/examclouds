package OOP;

public class Demo_Student {
    public static void main(String[] args) {
        Student student1 = new Student("Максим", "Дешко", "315", 3.5, "deshko86", "Qwerty");
        Student student2 = new Student("Дарья", "Дешко", "305", 5.0, "deshko93", "fe14f1f");
        Aspirant aspirant1 = new Aspirant("Игорь","Петровских","444", 4.5,"petro", "sad234sd","Диссертация");
        //Создать переменную типа Student, которая ссылается на объект типа Aspirant.
        Aspirant aspirant2 = new Aspirant("Егор","Линевич","554", 5,"egor", "eg234sd","Научная работа");
        System.out.println(aspirant1.work);
        //System.out.println(aspirant2.work);
        System.out.println("Логин  " + student1.getLogin());
        System.out.println("Пароль  " + student1.getPassword());
        //Создать массив типа Student, содержащий объекты класса Student и Aspirant. Вызвать метод getScholarship() для каждого элемента массива.
        Student[] students = {student1, student2, aspirant1, aspirant2};
        for (Student student:students){
            student.getScholarship();
        }
    }
}
