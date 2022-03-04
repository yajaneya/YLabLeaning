/*
3. Задача по алгоритмам.

Задача: Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
 */

package ru.yajaneya.javarush.level5.task23;

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int n = scanner.nextInt();
        int max = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Введите число: ");
            int c = scanner.nextInt();
            if (i == 0) {
                max = c;
            } else {
                max = Math.max(max, c);
            }
        }
        System.out.println("Максимальное число: " + max);
    }
}
