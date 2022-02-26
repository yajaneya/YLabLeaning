package ru.yajaneya.javarush.level2.task6;

public class Fish {
    private String name;
    private String species;
    private Woman owner;

    public Fish(String name, String species, Woman owner) {
        this.name = name;
        this.species = species;
        this.owner = owner;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Woman getOwner() {
        return owner;
    }

    public void setOwner(Woman owner) {
        this.owner = owner;
    }
}
