package OOP;

public class DemoAnimal {
    public static void main(String[] args) {

        Dog dog1 = new Dog("мясо", "Беловодск", "Овчарка", "Сидеть, Лежать и Голос ", "Собака");
        Cat cat1 = new Cat("wiskas", "Беловодск", "Scotish Strite", "Большие когти", "Кошка ");
        Horse horse1 = new Horse("сено", "Эмираты", "Арабский скакун", "40", "Лошадь");
        Veterinarian veterinarian = new Veterinarian("Айболит");
        Animal[] animals = {dog1,cat1,horse1};
        for (Animal animal: animals){
            veterinarian.treatAnimal(animal);
        }
    }
}
