package ru.yajaneya.javarush.level5.task16;

public class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Собака по кличке " + name;
    }
}
