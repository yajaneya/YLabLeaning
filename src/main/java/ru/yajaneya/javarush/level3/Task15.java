/*
Чистая любовь

Ввести с клавиатуры три имени, вывести на экран надпись name1 + name2 + name3 = Чистая любовь, да-да!

Пример:
Вася + Ева + Анжелика = Чистая любовь, да-да!
 */

package ru.yajaneya.javarush.level3;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name1 = scanner.nextLine();
        System.out.print("Введите имя: ");
        String name2 = scanner.nextLine();
        System.out.print("Введите имя: ");
        String name3 = scanner.nextLine();
        System.out.println();
        System.out.println(name1 + " + " + name2 + " + " + name3 + " = Чистая любовь, да-да!");
    }
}
