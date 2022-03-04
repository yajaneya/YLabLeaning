/*
Реализовать метод setCatsCount так, чтобы с его помощью можно было
устанавливать значение переменной catsCount равное переданному параметру.
 */

package ru.yajaneya.javarush.level4.task3;

public class Task3 {
    public static void main(String[] args) {
        Cat.setCatsCount(5);
        System.out.println(Cat.getCatsCount());
    }
}

class Cat
{
    private static int catsCount = 0;
    public static void setCatsCount(int catsCount)
    {
        Cat.catsCount = catsCount;
    }

    public static int getCatsCount() {
        return catsCount;
    }
}

