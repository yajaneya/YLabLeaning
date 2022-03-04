/*
3. Геттеры и сеттеры для класса Dog

Создать class Dog. У собаки должна быть кличка String name и возраст int age.
Создайте геттеры и сеттеры для всех переменных класса Dog.
 */

package ru.yajaneya.javarush.level5.task3;

public class Task3 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Шарик");
        dog.setAge(10);
        System.out.println("Собака " + dog.getName() + " возрастом " + dog.getAge() + " лет.");
    }
}
