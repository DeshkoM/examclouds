package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends Car {
    private double speed;

    public SportCar(String clas, String brand, String weight, Driver driver, Engine engine, double speed) {
        super(clas, brand, weight, driver, engine);
        this.speed = speed;
    }

    public SportCar(double speed) {
        this.speed = speed;
    }

    public SportCar() {
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Полная информация о спорткаре { " + "\n" +
                "Максимальная скорость : " + speed + " км/ч" + "\n" +
                super.toString() +
                " } ";
    }
}
