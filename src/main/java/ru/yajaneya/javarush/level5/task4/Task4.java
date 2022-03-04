/*
4. Создать три объекта типа Cat

В методе main создать три объекта типа Cat и заполнить их данными.
Использовать класс Cat из первой задачи. Класс Cat создавать не надо.
 */

package ru.yajaneya.javarush.level5.task4;

import ru.yajaneya.javarush.level5.task1task2.Cat;

public class Task4 {
    public static void main(String[] args) {
        Cat vaska = new Cat("Васька", 7, 10, 4);
        Cat barsik = new Cat("Барсик", 3, 5, 7);
        Cat murka = new Cat("Мурка", 13, 15, 17);
    }
}
