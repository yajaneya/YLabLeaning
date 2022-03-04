/*
2. Создать класс Cat

Создать класс Cat (кот) с пятью инициализаторами:
- Имя
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес (чужой домашний кот)

Задача инициализатора – сделать объект валидным.
Например, если вес неизвестен, то нужно указать какой-нибудь средний вес.
Кот не может ничего не весить. То же касательно возраста.
А вот имени может и не быть (null). То же касается адреса: null.
 */

package ru.yajaneya.javarush.level5.task7;

public class Task7 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.initialize("Василий");
        System.out.println(cat);
        cat.initialize("Василий", 5, 3);
        System.out.println(cat);
        cat.initialize(5, "белый");
        System.out.println(cat);
        cat.initialize(5, "белый", "третий этаж второго продъезда");
        System.out.println(cat);
    }
}

class Cat {
    private String name;
    private int weight;
    private int age;
    private String color;
    private String address;

    public void initialize (String name) {
        this.name = name;
        this.weight = 1;
        this.age = 0;
        this.color = null;
        this.address = null;
    }

    public void initialize (String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = null;
        this.address = null;
    }

    public void initialize (String name, int age) {
        this.name = name;
        this.weight = 5;
        this.age = age;
        this.color = null;
        this.address = null;
    }

    public void initialize (int weight, String color) {
        this.name = null;
        this.weight = weight;
        this.age = 0;
        this.color = color;
        this.address = null;
    }

    public void initialize (int weight, String color, String address) {
        this.name = null;
        this.weight = weight;
        this.age = 0;
        this.color = color;
        this.address = address;
    }

    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                ", colour='" + color + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
