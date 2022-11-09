package lessons9_OOP;

public class Demo_ex2_Person {
    public static void main(String[] args) {
        ex2_Person person1 = new ex2_Person();
        ex2_Person person2 = new ex2_Person("Дешко Максим Сергеевич",36);
        person1.setFullName("Дешко Дарья Игоревна");
        person1.setAge(30);

        person1.talk();
        person2.talk();
    }
}
