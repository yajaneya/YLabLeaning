/*
Задача 2. Максимум четырех чисел

Ввести с клавиатуры четыре числа, и вывести максимальное из них.
 */

package ru.yajaneya.javarush.level4;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = scanner.nextInt();
        System.out.println("Введите число: ");
        int b = scanner.nextInt();
        System.out.println("Введите число: ");
        int c = scanner.nextInt();
        System.out.println("Введите число: ");
        int d = scanner.nextInt();
        System.out.println("Максимальное число: " + Math.max(Math.max(a, b), Math.max(c,d)));
    }
}
