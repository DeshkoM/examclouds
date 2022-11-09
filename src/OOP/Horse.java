package OOP;

public class Horse extends Animal {
    private String breed, speed;

    public Horse(String food, String location, String breed, String speed, String type) {
        super(food, location, type);
        this.breed = breed;
        this.speed = speed;
    }

    public Horse() {

    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public void makeNoise() {
        System.out.println("Лошадь гуляет в загоне ");
    }

    public void eat() {
        System.out.println("Лошадь ест сено ");
    }

    public void run () {
        System.out.println("Лошадь способна бежать со скоростью  " + speed + " км/ч");
    }
}
