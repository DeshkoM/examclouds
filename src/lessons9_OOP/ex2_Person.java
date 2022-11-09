package lessons9_OOP;
/*
* переменные fullName, age;
методы move() и talk(), в которых просто вывести на консоль сообщение -"Такой-то  Person говорит".
Добавьте два конструктора  - Person() и Person(fullName, age).
Создайте два объекта этого класса. Один объект инициализируется конструктором Person(), другой - Person(fullName, age).
* */
public class ex2_Person {
    private String fullName;
    private int age;

    ex2_Person(String fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }

    ex2_Person(){}

    public String getFullName(){
        return fullName;
    }

    public void setFullName(String fullName){
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void move (){
        System.out.println(fullName + "ходит пешком " );
    }

    public void talk (){
        System.out.println(fullName + " сейчас говорит");
    }
}
