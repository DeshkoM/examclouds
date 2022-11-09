package OOP;

import java.util.Arrays;

public class Phone {
    static int count = 0;       //будем считать сколько объектов класса было создано
    private String number, model;
    private double weight;

    //Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации переменных класса - number, model и weight.
    //Вызвать из конструктора с тремя параметрами конструктор с двумя.
    Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    //Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model.
    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
        count++;
    }

    //Добавить конструктор без параметров.
    Phone() {
        count++;        //при создании объекта счётчик прибавляет 1
    }

    //Изменить класс Phone в соответствии с концепцией JavaBean.
    //создаём геттеры и сеттеры

    public String getNumber() {
        return this.number;
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

    void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    //Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер телефона звонящего. Вызвать этот метод.
    void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + ", номер абонента " + number);
        System.out.println("Мой номер " + this.number);
    }

    //Создать метод sendMessage с аргументами переменной длины. Данный метод принимает на вход номера телефонов, которым будет отправлено сообщение.
    // Метод выводит на консоль номера этих телефонов.
    void sendMessage(String message, String... numbers) {
        System.out.println(" \" " + message + " \" " + " отправляем на номера " + Arrays.toString(numbers));    //все номера из массива numbers выводим в строку
    }

}
