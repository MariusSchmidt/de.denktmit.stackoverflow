package de.denktmit.stackoverflow.jackson.polymorphic.deductive;

public class Fish extends Animal {

    private boolean freshwater;

    public boolean isFreshwater() {
        return freshwater;
    }

    public void setFreshwater(boolean freshwater) {
        this.freshwater = freshwater;
    }
}
