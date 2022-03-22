package ru.yajaneya.javarush.level5.task1task2;

public class Cat {
    private String name;
    private int age;
    private int weight;
    private int strength;

    public boolean fight(Cat anotherCat) {
        double l1 = this.level();
        double l2 = anotherCat.level();
        return l1 > l2;
    }

    public Cat(String name, int age, int weight, int strength) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    private double level () {
        return 0.6*strength + 0.2*weight - 0.3*age;
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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}
