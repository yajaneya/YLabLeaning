/*
Я буду зарабатывать $50 в час

Ввести с клавиатуры число n. Вывести на экран надпись «Я буду зарабатывать $n в час».

Пример:
Я буду зарабатывать $50 в час
 */

package ru.yajaneya.javarush.level3;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        System.out.println();
        System.out.printf("Я буду зарабатывать $%s в час", n);
    }
}
