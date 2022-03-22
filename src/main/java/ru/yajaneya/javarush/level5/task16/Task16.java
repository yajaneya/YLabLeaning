/*
1. Три класса

По аналогии с классом Duck(утка) создай классы Cat(кошка) и Dog(собака).
Подумай, что должен возвращать метод toString в классах Cat и Dog?
В методе main создай по два объекта каждого класса и выведи их на экран.
Объекты класса Duck уже созданы и выводятся на экран.
 */

package ru.yajaneya.javarush.level5.task16;

public class Task16 {
    public static void main(String[] args) {
        Duck duck1 = new Duck("Кряква");
        Duck duck2 = new Duck("Мраморный чирок");
        Cat cat1 = new Cat("Барсик");
        Cat cat2 = new Cat("Мурсик");
        Dog dog1 = new Dog("Лайка");
        Dog dog2 = new Dog("Полкан");
        System.out.println(duck1);
        System.out.println(duck2);
        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(dog1);
        System.out.println(dog2);
    }
}
