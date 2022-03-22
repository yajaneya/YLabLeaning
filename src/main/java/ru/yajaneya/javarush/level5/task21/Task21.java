/*
1. Нужно исправить программу, чтобы компилировалась и работала.

Задача: Программа вводит два числа с клавиатуры и выводит их сумму на экран.
 */
/*
Так как программы для исправления нет, привожу код программы под ключ
 */

package ru.yajaneya.javarush.level5.task21;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = scanner.nextInt();
        System.out.print("Введите число: ");
        int b = scanner.nextInt();
        System.out.println("Сумма: " + (a + b));

    }
}
