package de.denktmit.stackoverflow.jackson.polymorphic.deductive;

public class Bird extends Animal {
    private double wingspan;

    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }
}
