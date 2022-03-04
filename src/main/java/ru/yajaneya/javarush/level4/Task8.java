/*
адача 3. Сортировка трех чисел

Ввести с клавиатуры три числа, и вывести их в порядке убывания.
 */

package ru.yajaneya.javarush.level4;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = scanner.nextInt();
        System.out.println("Введите число: ");
        int b = scanner.nextInt();
        System.out.println("Введите число: ");
        int c = scanner.nextInt();
        if (a > b) {
            if (a > c) {
                System.out.println(a);
                if (b > c) {
                    System.out.println(b);
                    System.out.println(c);
                } else {
                    System.out.println(c);
                    System.out.println(b);
                }
            } else {
                System.out.println(c);
                System.out.println(a);
                System.out.println(b);
            }
        } else {
            if (b > c) {
                System.out.println(b);
                if (a > c) {
                    System.out.println(a);
                    System.out.println(c);
                } else {
                    System.out.println(c);
                    System.out.println(a);
                }
            } else {
                System.out.println(c);
                System.out.println(b);
                System.out.println(a);
            }
        }
    }
}
