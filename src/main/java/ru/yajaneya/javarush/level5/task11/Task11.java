/*
1. Создать класс Friend

Создать класс Friend (друг) с тремя конструкторами:
- Имя
- Имя, возраст
- Имя, возраст, пол
 */

package ru.yajaneya.javarush.level5.task11;

public class Task11 {
    public static void main(String[] args) {
        Freind freind1 = new Freind("Василий");
        System.out.println(freind1);
        Freind friend2 = new Freind("Василий", 25);
        System.out.println(friend2);
        Freind freind3 = new Freind("Василий", 25, "муж");
        System.out.println(freind3);
    }
}

class Freind {
    private String name;
    private int age;
    private String gender;

    public Freind(String name) {
        this.name = name;
    }

    public Freind(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Freind(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

}