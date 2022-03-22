/*
Реализовать метод setName, чтобы с его помощью можно было устанавливать
значение переменной private String name равное переданному параметру String name.
 */

package ru.yajaneya.javarush.level4.task1;

public class Task1 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Мурзик");
    }
}

class Cat
{
    private String name;
    public void setName(String name)
    {
        this.name = name;
    }
}
