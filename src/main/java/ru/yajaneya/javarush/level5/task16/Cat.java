package ru.yajaneya.javarush.level5.task16;

public class Cat {
    private String name;

    public Cat (String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Кошка по кличке " + name;
    }
}
