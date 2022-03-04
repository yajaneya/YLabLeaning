/*
Реализовать метод addNewCat, чтобы при его вызове (т.е. добавлении нового кота),
количество котов увеличивалось на 1. За количество котов отвечает переменная catsCount.
 */

package ru.yajaneya.javarush.level4.task2;

public class Task2 {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        System.out.println(Cat.getCatsCount());
        Cat cat2 = new Cat();
        System.out.println(Cat.getCatsCount());
        Cat cat3 = new Cat();
        System.out.println(Cat.getCatsCount());

    }
}

class Cat
{
    private static int catsCount = 0;
    public static void addNewCat()
    {
        Cat.catsCount++;
    }

    public Cat() {
        addNewCat();
    }

    public static int getCatsCount() {
        return catsCount;
    }
}
