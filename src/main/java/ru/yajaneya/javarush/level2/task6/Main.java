/*
Создайте объект типа Cat(кот), объект типа Dog (собака), объект типа Fish (рыбка) и объект типа Woman.
Присвойте каждому животному владельца (owner).
 */

package ru.yajaneya.javarush.level2.task6;

public class Main {
    public static void main(String[] args) {
        Woman woman = new Woman("Клара");
        Cat cat = new Cat("Мурзик", woman);
        Dog dog = new Dog("Шарик", woman);
        Fish fish = new Fish("Аква", "guppy", woman);
    }
}
