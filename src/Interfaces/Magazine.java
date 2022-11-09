package Interfaces;

import java.util.Objects;

public class Magazine implements Printable{
    private String name;

    public Magazine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void print(){
        System.out.println("Печатаем журнал " + this.name + " с помощью интерфейса");
    }
    //Создать статический метод printMagazines(Printable[] printable) в классе Magazine, который выводит на консоль названия только журналов.
    //instanceof  позволяет проверить принадлежит ли объект указанному классу, с учётом наследования.
    public static void printMagazines(Printable[] printable){
        for (Printable magazine : printable){
            if(magazine instanceof Magazine)
            System.out.println(((Magazine) magazine).name);
        }
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Magazine magazine = (Magazine) o;
        return Objects.equals(name, magazine.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
