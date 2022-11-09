package OOP;

public class Animal {
    private String food, location, type;

    public Animal (String food, String location, String type){
        this.food = food;
        this.location = location;
        this.type = type;
    }

    public Animal () {

    }

    public String getFood() {
        return food;
    }

    public void setFood (String food){
        this.food = food;
    }

    public String getLocation(){
        return location;
    }

    public void setLocation(String location){
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void makeNoise (){
        System.out.println("Животное активничает");
    }
    public void eat (){
        System.out.println("Животное ест");
    }
    public void sleep (){
        System.out.println("Животное спит");
    }
}
