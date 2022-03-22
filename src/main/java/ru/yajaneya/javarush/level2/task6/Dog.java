package ru.yajaneya.javarush.level2.task6;

public class Dog {
    private String name;
    private int age;
    private Woman owner;

    public Dog(String name, Woman owner) {
        this.name = name;
        this.age = 0;
        this.owner = owner;
    }

    public Dog(String name, int age, Woman owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Woman getOwner() {
        return owner;
    }

    public void setOwner(Woman owner) {
        this.owner = owner;
    }
}
