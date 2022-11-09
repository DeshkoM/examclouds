package com.company;

import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.professions.Person;
import com.company.vehicles.Car;
import com.company.vehicles.Lorry;
import com.company.vehicles.SportCar;

public class DemoCar {
    public static void main(String[] args) {
        Driver driver1 = new Driver("Дешко Николай Николаевич", 54, 25);
        Driver driver2 = new Driver("Дешко Максим Сергеевич", 36, 2);
        Driver driver3 = new Driver("Гвоздик Николай Николаевич", 50, 3);

        Engine Engine = new Engine("Megane", 90);
        Engine lorryEngine = new Engine("MAN", 100);
        Engine lorryEngine2 = new Engine("Renault", 110);
        Engine sportEngine = new Engine("BMW", 300);
        Engine sportEngine2 = new Engine("McLaren", 400);

        Car megane = new Car("B", "Renault", "2500", driver2, Engine);
        Lorry man = new Lorry("C", "MAN", "6000", driver1, lorryEngine,30);
        SportCar mclaren = new SportCar("A","McLaren", "3000", driver3, sportEngine2, 350 );

        System.out.println(megane);
        System.out.println(man);
        System.out.println(mclaren);
    }
}
