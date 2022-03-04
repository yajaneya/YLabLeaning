/*
2. Среднее такое среднее

Ввести с клавиатуры три числа, вывести на экран среднее из них, т.е. не самое большое и не самое маленькое.
 */

package ru.yajaneya.javarush.level4;

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = scanner.nextInt();
        System.out.println("Введите число: ");
        int b = scanner.nextInt();
        System.out.println("Введите число: ");
        int c = scanner.nextInt();
        if ((a < b && a > c) || (a > b && a < c)) {
            System.out.println(a);
        }
        if ((b < a && b > c) || (b > a && b < c)) {
            System.out.println(b);
        }
        if ((c < b && c > a) || (c > b && c < a)) {
            System.out.println(c);
        }
    }
}
