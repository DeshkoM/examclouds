package OOP;

public class Cat extends Animal {
    private String breed;   // порода
    private String  scratches;  //арапается или нет

    public Cat(String food, String location, String breed, String scratches, String type) {
        super(food, location, type);
        this.breed = breed;
        this.scratches = scratches;
    }

    public Cat() {

    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getScratches () {
        return scratches;
    }

    public void setCommands(String scratches) {
        this.scratches = scratches;
    }

    public void makeNoise (){
        System.out.println("Кошка играет с мышкой");
    }

    public void eat (){
        System.out.println("Кошка ест вискас ");
    }

    public void scratches (){
        System.out.println("Кошка царапает когтеточку ");
    }

}
