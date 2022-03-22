/*
1. Создать класс Friend

Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
- Имя
- Имя, возраст
- Имя, возраст, пол
 */

package ru.yajaneya.javarush.level5.task6;

public class Task6 {
    public static void main(String[] args) {
        Friend friend = new Friend();
        friend.initialize("Василий");
        System.out.println(friend);
        friend.initialize("Василий", 25);
        System.out.println(friend);
        friend.initialize("Василий", 25, "муж");
        System.out.println(friend);
    }
}

class Friend {
    private String name;
    private int age;
    private String gender;

    public void initialize(String name) {
        this.name = name;
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void initialize(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return name + ((age>0) ? (", возраст: " + age):"") + ((gender != null)?(", пол: " + gender):"");
    }

}


