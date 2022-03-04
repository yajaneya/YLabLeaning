/*
1. Создать класс Cat

Создать класс Cat.
У кота должно быть имя (name, String), возраст (age, int),
вес (weight, int), сила (strength, int).

2. Реализовать метод fight

Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Зависимость придумать самому.
Метод должен определять, выиграли ли мы (this) бой или нет,
т.е. возвращать true, если выиграли и false - если нет.
Должно выполняться условие:
если cat1.fight(cat2) == true , то cat2.fight(cat1) == false
 */

package ru.yajaneya.javarush.level5.task1task2;

public class Task1Task2 {
    public static void main(String[] args) {
        Cat bars = new Cat("Барсик", 5, 5, 3);
        Cat vas = new Cat("Васька", 2, 3, 2);

        System.out.println("Барсик -> Васька: " + (bars.fight(vas) ? "победил" : "проиграл"));
        System.out.println("Васька -> Барсик: " + (vas.fight(bars) ? "победил" : "проиграл"));
    }
}

