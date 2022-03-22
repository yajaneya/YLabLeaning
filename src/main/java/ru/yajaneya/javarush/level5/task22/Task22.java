/*
2. Нужно добавить в программу новую функциональность.

Старая Задача: Программа вводит два числа с клавиатуры и выводит минимальное из них на экран.
Новая задача: Программа вводит пять чисел с клавиатуры и выводит минимальное из них на экран.
 */

package ru.yajaneya.javarush.level5.task22;

import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int min = scanner.nextInt();
        for (int i = 0; i < 4; i++) {
            System.out.print("Введите число: ");
            int b = scanner.nextInt();
            min = Math.min(min, b);
        }
        System.out.println("Минимальное число: " + min);
    }
}
