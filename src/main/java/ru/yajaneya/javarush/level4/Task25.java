/*
4. Меня зовут 'Вася'...

Ввести с клавиатуры строку name.
Ввести с клавиатуры дату рождения (три числа): y, m, d.
Вывести на экран текст:
«Меня зовут name
Я родился d.m.y»

Пример:
Меня зовут Вася
Я родился 15.2.1988
 */

package ru.yajaneya.javarush.level4;

import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = scanner.nextLine();
        int y, m, d;
        while (true) {
            System.out.println("Введите число (год): ");
            y = scanner.nextInt();
            if (y > 0 && y < 2023) {
                break;
            }
        }
        while (true) {
            System.out.println("Введите число (месяц): ");
            m = scanner.nextInt();
            if (m > 0 && m < 13) {
                break;
            }
        }
        while (true) {
            System.out.println("Введите число (день): ");
            d = scanner.nextInt();
            if ((y%4) == 0 && m == 2 && (d > 0 && d < 30)) {
                break;
            }
            if (m == 2 && (d > 0 && d < 29)) {
                break;
            }
            if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12 ) {
                if (d > 0 && d < 32) {
                    break;
                }
            }
            if (m == 4 || m == 6 || m == 9 || m == 11) {
                if (d > 0 && d < 31) {
                    break;
                }
            }
        }
        System.out.println("Меня зовут " + name);
        System.out.println("Я родился " + d + "." + m + "." + y);
    }
}
