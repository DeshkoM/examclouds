package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {
    private String сlas, brand, weight;
    private Driver driver;
    private Engine engine;

    public Car(String clas, String brand, String weight, Driver driver, Engine engine) {
        this.сlas = clas;
        this.brand = brand;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public Car() {
    }

    public String getСlas() {
        return сlas;
    }

    public void setСlas(String сlas) {
        this.сlas = сlas;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }


    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    @Override
    public String toString() {
        return "Полная информация об авто { " + "\n" +
                "Класс : " + getСlas() + "\n" +
                " Марка : " + getBrand() + "\n" +
                " Вес : " + getWeight() + "\n" +
                "Водитель " + "\n" + getDriver() + "\n" +
                " Тип мотора : " + "\n" + getEngine() +
                " } ";
    }

}
