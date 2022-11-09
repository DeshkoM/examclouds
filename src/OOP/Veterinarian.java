package OOP;

public class Veterinarian {
    private String name;

    public Veterinarian(String name) {
        this.name = name;
    }

    public Veterinarian() {
    }


    public void treatAnimal(Animal animal) {
        System.out.println(" На приёме у ветеринара сейчас " + animal.getType());
        System.out.println("-------------------------------");
        System.out.println(animal.getType() + " ест " + animal.getFood());
        System.out.println(animal.getType() + " обитает в  " + animal.getLocation());
    }
}
