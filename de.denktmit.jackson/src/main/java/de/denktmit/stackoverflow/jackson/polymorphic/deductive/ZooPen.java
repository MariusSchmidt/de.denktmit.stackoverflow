package de.denktmit.stackoverflow.jackson.polymorphic.deductive;

import java.util.List;

public class ZooPen {

    private String type;
    private List<Animal> animals;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }
}
