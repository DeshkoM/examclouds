package OOP;

public class Dog extends Animal {
    private String breed;       // порода
    private String commands;      //какие комманды выполняет

    public Dog(String food, String location, String breed, String commands, String type) {
        super(food, location, type);
        this.breed = breed;
        this.commands = commands;
    }

    public Dog() {

    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getCommands() {
        return getCommands();
    }

    public void setCommands(String commands) {
        this.commands = commands;
    }

    public void makeNoise (){
        System.out.println("Собака играет с мячём ");
    }

    public void eat (){
        System.out.println("Собака ест мясо ");
    }
}
