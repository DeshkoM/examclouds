package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car {
    private int carrying;

    public Lorry(String сlas, String brand, String weight, Driver driver, Engine engine, int carrying) {
        super(сlas, brand, weight, driver, engine);
        this.carrying = carrying;
    }

    public Lorry() {
    }

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }

    @Override
    public String toString() {
        return "Полная информация о грузовике { " + "\n" +
                "Грузоподъёмность: " + carrying + " тонн " + "\n" +
                super.toString() +
                " } ";
    }
}
