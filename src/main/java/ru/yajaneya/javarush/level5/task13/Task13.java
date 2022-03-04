/*
3. Создать класс Dog

Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
 */

package ru.yajaneya.javarush.level5.task13;

public class Task13 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Мухтар");
        System.out.println(dog1);
        Dog dog2 = new Dog("Актриса", 1);
        System.out.println(dog2);
        Dog dog3 = new Dog("Барбос", 2, "черный");
        System.out.println(dog3);
    }

}

class Dog {
    private String name;
    private int growth;
    private String color;

    public Dog (String name) {
        this.name = name;
    }

    public Dog (String name, int growth) {
        this.name = name;
        this.growth = growth;
    }

    public Dog (String name, int growth, String color) {
        this.name = name;
        this.growth = growth;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", growth=" + growth +
                ", color=" + color +
                '}';
    }
}
