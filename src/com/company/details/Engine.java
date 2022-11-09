package com.company.details;

public class Engine {
    private String company;     //Производитель
    private int power;          //Мощность

    public Engine(String company, int power) {
        this.company = company;
        this.power = power;
    }

    public Engine() {
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Полная информация о двигателе { " + "\n" +
                "Производитель : " + company + "\n" +
                "Мощность : " + power + "л/с";
    }


}
