package lessons9_OOP;

import java.util.Arrays;

/*
 *1. Создайте класс Phone, который содержит переменные number, model и weight.
 *2. Создайте три экземпляра этого класса.
 *3.Выведите на консоль значения их переменных.
 *4. Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего. Выводит на консоль сообщение “Звонит {name}”.
 *Метод getNumber – возвращает номер телефона. Вызвать эти методы для каждого из объектов.
 *5. Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации переменных класса - number, model и weight.
 *6 Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model.
 *7 Добавить конструктор без параметров.
 *8 Вызвать из конструктора с тремя параметрами конструктор с двумя.
 *9 Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер телефона звонящего. Вызвать этот метод.
 *10 Создать метод sendMessage с аргументами переменной длины. Данный метод принимает на вход номера телефонов, которым будет отправлено сообщение.
 *Метод выводит на консоль номера этих телефонов.
 *11 Изменить класс Phone в соответствии с концепцией JavaBean.
 * */
public class ex1_Phone {
    private String number;      //обязательно private, в соответствии с концепцией JavaBeans
    private String model;
    private double weight;


    //Конструктор 3
    ex1_Phone(String number, String model, double weight) {
        this(number, model);    //вызвываем из конструктора 3 -> конструктор 2. this  всегда должно быть в конструкторе на первой строчке
        this.weight = weight;
    }

    //Конструктор 2
    ex1_Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    //Конструктор 1 (пустой)
    ex1_Phone() {
    }
    //Создаём геттеры и сеттеры, обычно пишутся после конструкторов
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    //
    public void receiveCall(String name) {
        System.out.println("Вам звонит " + name);
    }

    //Добавляем перегруженный метод
    public void receiveCall(String name, String number) {
        System.out.println("Вам звонит " + name + " номер телефона " + number);
    }

    /*Создать метод sendMessage с аргументами переменной длины
     *VARARG  - пишется например (int... chisla) chisla - это у нас теперь массив.
     *VARARG -  может быть вместе с обычными типами, 2 VARARGa  быть не может
     * VARARG  - всегда указывается последним в аргументах
     */
    public void sendMessage(String message, String... numbers) {
        System.out.print("Messege " + "\"" + message + "\"" + " receive to numbers ");
        System.out.println(Arrays.toString(numbers));   //выведем на экран что у нас в массиве numbers, а именно все телефоны
    }
}
