/*
Задача 1. Минимум двух чисел

Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
 */

package ru.yajaneya.javarush.level4;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = scanner.nextInt();
        System.out.println("Введите число: ");
        int b = scanner.nextInt();
        System.out.println("Минимальное число: " + Math.min(a, b));
    }
}
