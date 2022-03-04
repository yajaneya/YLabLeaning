/*
5. Провести три боя попарно между котами

Создать три кота используя класс Cat.
Провести три боя попарно между котами.
Класс Cat создавать не надо. Для боя использовать метод boolean fight(Cat anotherCat).
Результат каждого боя вывести на экран.
 */

package ru.yajaneya.javarush.level5.task5;

import ru.yajaneya.javarush.level5.task1task2.Cat;

public class Task5 {
    public static void main(String[] args) {
        Cat vaska = new Cat("Васька", 7, 10, 4);
        Cat barsik = new Cat("Барсик", 3, 5, 7);
        Cat murka = new Cat("Мурка", 13, 15, 17);
        System.out.println("Бой Васька -> Барсик: Васька - " + (vaska.fight(barsik) ? "победил" : "проиграл"));
        System.out.println("Бой Барсик -> Мурка: Барсик - " + (barsik.fight(murka) ? "победил" : "проиграл"));
        System.out.println("Бой Мурка -> Васька: Мурка - " + (murka.fight(vaska) ? "победила" : "проиграла"));
    }
}
