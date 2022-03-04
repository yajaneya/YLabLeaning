/*
Реализовать метод setName, чтобы с его помощью можно было
устанавливать значение переменной private String fullName
равное значению локальной переменной String fullName.
 */

package ru.yajaneya.javarush.level4.task4;

public class Task4 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Мурзик", "Мурзиков");
        System.out.println(cat.getFullName());
    }
}

class Cat
{
    private String fullName;

    public void setName(String firstName, String lastName)
    {
        String fullName = firstName + lastName;
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }
}
