package Interfaces2;

import java.util.Objects;

//Труба
public class Ttrumpet implements Instrument{
    private int diametr;

    public Ttrumpet(int diametr) {
        this.diametr = diametr;
    }

    public int getDiametr() {
        return diametr;
    }

    public void setDiametr(int diametr) {
        this.diametr = diametr;
    }

    public void play(){
        System.out.println("Играет труба диаметром " + this.diametr + " см");
    }

    @Override
    public String toString() {
        return "Ttrumpet{" +
                "diametr=" + diametr +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ttrumpet ttrumpet = (Ttrumpet) o;
        return diametr == ttrumpet.diametr;
    }

    @Override
    public int hashCode() {
        return Objects.hash(diametr);
    }
}
