package com.company.professions;

public class Driver extends Person {
    private int experience;         //Опыт вождения

    public Driver(String fullName, int age, int experience) {
        super(fullName, age);
        this.experience = experience;
    }

    public Driver() {

    }

    public int getExperience() {
        return this.experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Полная информация о водителе { " + "\n" +
                "Опыт вождения " + experience + " года" + "\n" +
                super.toString();      //Вся информация из метода toString  суперкласса Person
    }

}
