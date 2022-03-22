/*
Задача 4. Сравнить имена

Ввести с клавиатуры два имени, и если имена одинаковые, вывести сообщение «Имена идентичны».
Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».
 */

package ru.yajaneya.javarush.level4;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String  name1 = scanner.nextLine();
        System.out.println("Введите имя: ");
        String  name2 = scanner.nextLine();
        if (name1.equals(name2)) {
            System.out.println("Имена идентичны");
        } else if (name1.length() == name2.length()) {
            System.out.println("Длины имен равны");
        }
    }
}
